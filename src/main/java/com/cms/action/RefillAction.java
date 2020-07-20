/**  
 * @Title: RefillAction.java
 * @Package com.cms.action
 * @author 田锐
 * @date 2020年7月9日
 * @version V1.0  
 */
package com.cms.action;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.PayChargeMsg;
import com.cms.svc.PhoneChargeSvc;

/**
 * @ClassName: RefillAction
 * @Description: 使用充值卡进行话费充值
 * @author 田锐
 * @date 2020年7月9日
 * @since JDK 1.8
 */
@RequestMapping("/bill")
@RestController
public class RefillAction {

	/**
	 * logger对象
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 话费充值功能的业务层类
	 */
	@Autowired
	private PhoneChargeSvc phoneChargeSvc;

	/**
	 * 验证充值卡卡号格式的Pattern
	 */
	private Pattern cardIdPattern = Pattern.compile("[0-9]{17}");

	/**
	 * 验证充值卡密码格式的Pattern
	 */
	private Pattern cardPwdPattern = Pattern.compile("[0-9]{18}");

	/**
	 * 
	 * @Title: index
	 * @Description: 进入跳转到充值卡方式话费充值页面
	 * @param mav
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView index(ModelAndView mav) {

		// 设置跳转页面，跳转到充值卡方式话费充值页面
		mav.setViewName("card/refill_bill");
		return mav;
	}

	/**
	 * 
	 * @Title: refillBill
	 * @Description: 使用移动充值卡，充值话费
	 * @param session
	 * @param cardId
	 * @param password
	 * @return
	 */
	@PostMapping("rb")
	public Map<String, String> refillBill(HttpSession session, String cardId, String password) {

		// 记录卡号和密码
		logger.info("cardId=" + cardId + ",password=" + password);

		// 用于返回的map
		Map<String, String> returnMap = new HashMap<>(2);

		String phone = (String) session.getAttribute("phone");

		// 若session保存的客户手机号为空，充值失败，直接返回
		if (phone == null) {

			// 设置失败提示，未登录
			returnMap.put(PayChargeMsg.REFILL_STATUS_KEY, PayChargeMsg.REFILL_STATUS_FAIL);
			returnMap.put(PayChargeMsg.REFILL_FAIL_MSG_KEY, PayChargeMsg.REFILL_FAIL_PNE_MSG);

			logger.info("returnMap={}", returnMap);

			return returnMap;
		}

		// 检查卡号格式
		Matcher idMatcher = cardIdPattern.matcher(cardId);
		if (!idMatcher.matches()) {

			returnMap.put(PayChargeMsg.REFILL_STATUS_KEY, PayChargeMsg.REFILL_STATUS_FAIL);
			returnMap.put(PayChargeMsg.REFILL_FAIL_MSG_KEY, PayChargeMsg.REFILL_FAIL_CIF_MSG);

			logger.info("returnMap={}", returnMap);

			return returnMap;
		}

		// 检查密码格式
		Matcher pwdMatcher = cardPwdPattern.matcher(password);
		if (!pwdMatcher.matches()) {

			returnMap.put(PayChargeMsg.REFILL_STATUS_KEY, PayChargeMsg.REFILL_STATUS_FAIL);
			returnMap.put(PayChargeMsg.REFILL_FAIL_MSG_KEY, PayChargeMsg.REFILL_FAIL_CPF_MSG);

			logger.info("returnMap={}", returnMap);

			return returnMap;
		}

		// 检查充值卡是否可用
		int checkStatus = phoneChargeSvc.checkRefillCard(cardId, password);

		// 若不可用，充值失败，返回
		if (checkStatus != PayChargeMsg.CARD_CHECK_SUCCESS) {

			// 根据状态值设置失败提示
			String failMsg = null;

			switch (checkStatus) {
			case PayChargeMsg.CARD_NOT_EXIST:
				failMsg = PayChargeMsg.REFILL_FAIL_CNE_MSG;
				break;
			case PayChargeMsg.CARD_PWD_ERROR:
				failMsg = PayChargeMsg.REFILL_FAIL_PE_MSG;
				break;
			case PayChargeMsg.CARD_END_TIME:
				failMsg = PayChargeMsg.REFILL_FAIL_CE_MSG;
				break;
			case PayChargeMsg.CARD_STATUS_USED:
				failMsg = PayChargeMsg.REFILL_FAIL_CU_MSG;
				break;
			case PayChargeMsg.CARD_STATUS_INVALID:
				failMsg = PayChargeMsg.REFILL_FAIL_CIV_MSG;
				break;
			default:
				failMsg = "未知的错误";
				break;
			}

			// 设置失败提示
			returnMap.put(PayChargeMsg.REFILL_STATUS_KEY, PayChargeMsg.REFILL_STATUS_FAIL);
			returnMap.put(PayChargeMsg.REFILL_FAIL_MSG_KEY, failMsg);

			logger.info("returnMap={}", returnMap);

			return returnMap;
		}

		// 充值操作的状态
		int editStatus;
		try {

			// 进行充值业务，返回值含义见PayChargeMsg接口
			editStatus = phoneChargeSvc.payChargeByCard(cardId, password, phone);

		} catch (RuntimeException re) {

			// 充值失败，设置状态
			editStatus = PayChargeMsg.REFILL_EDIT_FAIL;
		}

		// 若充值成功
		if (editStatus == PayChargeMsg.REFILL_EDIT_SUCC) {

			// 设置成功提示
			returnMap.put(PayChargeMsg.REFILL_STATUS_KEY, PayChargeMsg.REFILL_STATUS_SUCC);
			returnMap.put(PayChargeMsg.REFILL_SUCC_MSG_KEY, PayChargeMsg.REFILL_SUCC_MSG);

			logger.info("returnMap={}", returnMap);

			return returnMap;
		}

		// 若充值失败

		// 设置失败提示，充值卡无误但业务失败
		returnMap.put(PayChargeMsg.REFILL_STATUS_KEY, PayChargeMsg.REFILL_STATUS_FAIL);
		returnMap.put(PayChargeMsg.REFILL_FAIL_MSG_KEY, PayChargeMsg.REFILL_FAIL_VE_MSG);

		logger.info("returnMap={}", returnMap);

		return returnMap;
	}

}
