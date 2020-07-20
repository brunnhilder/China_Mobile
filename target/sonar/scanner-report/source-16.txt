/**  
 * @Title: ScoreAction.java
 * @Package com.cms.action
 * @author 田锐
 * @date 2020年7月6日
 * @version V1.0  
 */
package com.cms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.ScoreMsg;
import com.cms.svc.ScoreSvc;

/**
 * @ClassName: ScoreAction
 * @Description: 积分查询与积分商城
 * @author 田锐
 * @date 2020年7月6日
 * @since JDK 1.8
 */
@RequestMapping("/score")
@RestController
public class ScoreAction {

	/**
	 * logger对象
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 积分计划功能的业务层对象
	 */
	@Autowired
	private ScoreSvc scoreSvc;

	/**
	 * 验证手机号码格式的pattern
	 */
	private Pattern phonePattern = Pattern.compile("[1][3578][0-9]{9}");

	/**
	 * 
	 * @Title: index
	 * @Description: 进入积分查询页面
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView index() {

		// 设置跳转页面为积分查询页面
		ModelAndView modelAndView = new ModelAndView("score/score_list");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: getScores
	 * @Description: 处理积分查询请求
	 * @param session
	 * @return
	 */
	@GetMapping("gs")
	public Map<String, Object> getScores(HttpSession session) {

		// 取得客户的手机号
		String phone = (String) session.getAttribute("phone");

		// 记录手机号
		logger.info("phone=" + phone);

		// 用于返回值的map
		Map<String, Object> returnMap = new HashMap<>(2);

		// 验证手机号码格式
		Matcher matcher = phonePattern.matcher(phone);

		// 如果格式不正确，直接返回并提示
		if (!matcher.matches()) {

			returnMap.put(ScoreMsg.SCORE_QUERY_STATUS_KEY, ScoreMsg.SCORE_QUERY_FAIL_STATUS);
			returnMap.put(ScoreMsg.QUERY_FAIL_MSG_KEY, ScoreMsg.QUERY_FAIL_PF_MSG);

			// 记录提示
			logger.info(ScoreMsg.QUERY_FAIL_PF_MSG);
			return returnMap;
		}

		// 查询积分
		List<Map<String, Float>> scoreList = scoreSvc.getScores(phone);

		// 查询结果为空，返回并提示
		if (scoreList == null || scoreList.size() == 0) {

			returnMap.put(ScoreMsg.SCORE_QUERY_STATUS_KEY, ScoreMsg.SCORE_QUERY_FAIL_STATUS);
			returnMap.put(ScoreMsg.QUERY_FAIL_MSG_KEY, ScoreMsg.QUERY_FAIL_NUL_MSG);

			// 记录提示
			logger.info(ScoreMsg.QUERY_FAIL_NUL_MSG);
			return returnMap;
		}

		// 查询成功
		returnMap.put(ScoreMsg.SCORE_QUERY_STATUS_KEY, ScoreMsg.SCORE_QUERY_SUCCESS_STATUS);
		returnMap.put(ScoreMsg.QUERY_SUCCESS_MSG_KEY, scoreList);

		// 记录查询结果
		logger.info("queryResult{}", scoreList);

		return returnMap;
	}

}
