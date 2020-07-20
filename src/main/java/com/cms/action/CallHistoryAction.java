/**  
 * @Title: CallHistoryAction.java
 * @Package com.cms.action
 * @author 田锐
 * @date 2020年7月8日
 * @version V1.0  
 */
package com.cms.action;

import java.util.Calendar;
import java.util.Date;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.CallHistMsg;
import com.cms.pojo.CallInfoWithPhone;
import com.cms.svc.CustomerCallSvc;

/**
 * @ClassName: CallHistoryAction
 * @Description: 客户通话记录相关功能的控制层类
 * @author 田锐
 * @date 2020年7月8日
 * @since JDK 1.8
 */
@RequestMapping("/call")
@RestController
public class CallHistoryAction {

	/**
	 * logger对象
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 通话记录功能的业务层对象
	 */
	@Autowired
	private CustomerCallSvc customerCallSvc;

	/**
	 * 
	 * @Title: index
	 * @Description: 进入通话记录页面
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView index() {

		// 设置跳转页面为通话记录页面
		ModelAndView modelAndView = new ModelAndView("call/call_history");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: getCallHistory
	 * @Description: 获取参数给定区间的客户通话记录
	 * @param session
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	@GetMapping("ch")
	public Map<String, Object> getCallHistory(HttpSession session, 
			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date beginTime, 
			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endTime) {

		// 取得客户手机号
		String phone = (String) session.getAttribute("phone");

		// 如果截止时间为空，则设置为默认值，为当前时间
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
		logger.info("phone=" + phone + "beginTime=" + beginTime + "endTime=" + endTime);

		// 查询通话记录
		List<CallInfoWithPhone> callList = customerCallSvc.getCallHistory(phone, beginTime, endTime);

		// 创建返回值map
		Map<String, Object> returnMap = new HashMap<>(3);

		// 如果查询结果为空，返回失败信息
		if (callList == null) {

			// 设置查询状态为失败，设置原因为空结果
			returnMap.put(CallHistMsg.CH_QUERY_STATUS_KEY, CallHistMsg.CH_QUERY_FAIL_STATUS);
			returnMap.put(CallHistMsg.QUERY_FAIL_MSG_KEY, CallHistMsg.QUERY_FAIL_NUL_MSG);

			// 记录失败提示
			logger.info("fail cause=", CallHistMsg.QUERY_FAIL_NUL_MSG);

			return returnMap;
		}

		// 不为空，返回提示信息和查询结果
		returnMap.put(CallHistMsg.CH_QUERY_STATUS_KEY, CallHistMsg.CH_QUERY_SUCCESS_STATUS);
		returnMap.put(CallHistMsg.QUERY_SUCCESS_NUM_KEY, callList.size());
		returnMap.put(CallHistMsg.QUERY_SUCCESS_LIST_KEY, callList);

		// 记录查询结果
		logger.info("returnMap{}", returnMap);

		return returnMap;
	}
}
