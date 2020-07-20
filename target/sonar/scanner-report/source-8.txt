/**  
 * @Title: PaymentHistoryAction.java
 * @Package com.cms.action
 * @author sunxiaoning
 * @date 2020年7月11日
 * @version V1.0  
 */
package com.cms.action;

import java.util.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.PaymentHistoryMsg;
import com.cms.pojo.CmsPaymentHistory;
import com.cms.svc.CustomerPaymentHistorySvc;

/**
 * @ClassName: PaymentHistoryAction
 * @Description: 缴费详单查询操作
 * @author sunxiaoning
 * @since JDK 1.8
 */
@RequestMapping("/paymentHistory")
@RestController
public class CustomerPaymentHistoryAction {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CustomerPaymentHistorySvc customerPaymentHistorySvc;
	/**
	 * 
	 * @Title: getPaymentHistory
	 * @Description: 缴费详单查询操作
	 * @param paramMap
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("paymenthistory/paymenthistory");
		return modelAndView;
	}
	
	@GetMapping("paymentHistoryCheck")//创建一个会话
	@ResponseBody
	public Map<String, Object> getPaymentHistory(HttpSession session,
			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date beginTime, 
			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endTime) {
		// 获取登录信息
		int ridId=(int) session.getAttribute("ridId");
		if (endTime == null) {
			endTime = new Date();
		}
		// 如果开始时间为空，则设置为默认值，为开始时间前一个月
		if (beginTime == null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(endTime);
			cal.add(Calendar.MONTH, -1);
			beginTime = cal.getTime();
		}
		// 记录查询条件
		logger.info("ridId=" + ridId + "beginTime=" + beginTime + "endTime=" + endTime);
		List<CmsPaymentHistory> lists= customerPaymentHistorySvc.getInfo(ridId,beginTime,endTime);
		Map<String, Object> returnMap = new HashMap<>(3);
		//查询失败
		if (lists == null) {
			// 设置查询状态为失败，设置原因为空结果
			returnMap.put(PaymentHistoryMsg.CH_QUERY_STATUS_KEY, PaymentHistoryMsg.CH_QUERY_FAIL_STATUS);
			returnMap.put(PaymentHistoryMsg.QUERY_FAIL_MSG_KEY, PaymentHistoryMsg.QUERY_FAIL_NUL_MSG);
			// 记录失败提示
			logger.info("fail cause=", PaymentHistoryMsg.QUERY_FAIL_NUL_MSG);
			return returnMap;
		}
		// 不为空，返回提示信息和查询结果
		returnMap.put(PaymentHistoryMsg.CH_QUERY_STATUS_KEY, PaymentHistoryMsg.CH_QUERY_SUCCESS_STATUS);
		returnMap.put(PaymentHistoryMsg.QUERY_SUCCESS_NUM_KEY, lists.size());
		returnMap.put(PaymentHistoryMsg.QUERY_SUCCESS_LIST_KEY, lists);
		// 记录查询结果
		logger.info("returnMap{}", returnMap);
		return returnMap;
	}
}
