/**  
 * @Title: ChangepwdAction.java
 * @Package com.cms.action
 * @author 陈超
 * @date 2020年7月8日
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.ChangepwdMsg;
import com.cms.svc.ChangepwdSvc;

/**
 * @ClassName: ChangepwdAction
 * @Description: 修改服务密码
 * @author 陈超
 * @date 2020年7月8日
 * @since JDK 1.8
 */
@RequestMapping("/changepwd")
@RestController
public class ChangepwdAction {

	/**
	 * logger对象
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 修改密码功能的业务层对象
	 */
	@Autowired
	private ChangepwdSvc changepwdSvc;

	/**
	 * 
	 * @Title: index
	 * @Description: 进入修改密码页面
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("changepwd");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: pwdUpdate
	 * @Description: 处理修改密码请求
	 * @param session
	 * @return
	 */
	@PostMapping("password")
	@ResponseBody
	public Map<String, String> updateChangepwd(@RequestParam Map<String, String> paramMap, HttpSession session) {
		logger.info("用户登陆信息:{}", paramMap);
		// 获取前端输入的信息
		String phoneNum = (String) session.getAttribute("phone");
		String password = paramMap.get("password");
		String oldpassword = paramMap.get("oldpassword");

		// 验证session中的手机号
		Pattern p = Pattern.compile("[1][3578][0-9]{9}");
		Matcher matcher = p.matcher(phoneNum);
		boolean b = matcher.matches();
		Map<String, String> map = new HashMap<>();

		// 手机号不合法，则返回并提示
		if (!b) {
			map.put(ChangepwdMsg.CHANGE_STATUS_KEY, ChangepwdMsg.CHANGE_FAIL_STATUS);
			map.put(ChangepwdMsg.CHANGE_STATUS_MSG_KEY, ChangepwdMsg.CHANGE_ID_VAL_FAIL_MSG);
			logger.info(ChangepwdMsg.CHANGE_STATUS_MSG_KEY);
			return map;
		}

		// TODO 同理验证原密码
		int result = changepwdSvc.updateChangepwd(phoneNum, password, oldpassword);
		// 修改失败
		if (result == 0) {
			map.put(ChangepwdMsg.CHANGE_STATUS_KEY, ChangepwdMsg.CHANGE_FAIL_STATUS);
			map.put(ChangepwdMsg.CHANGE_ID_VAL_FAIL_MSG, "原密码不正确");
			logger.info(ChangepwdMsg.CHANGE_STATUS_MSG_KEY);
		}

		// 修改成功
		if (result == 1) {
			// 认证与用户信息一般情况下时分属两张表，所以需要再查询一下用户的数据保存到session中
			session.setAttribute("password", phoneNum);
			map.put(ChangepwdMsg.CHANGE_STATUS_KEY, ChangepwdMsg.CHANGE_SUCCESS_STATUS);
			map.put(ChangepwdMsg.CHANGE_STATUS_MSG_KEY, "原密码正确");
			logger.info(ChangepwdMsg.CHANGE_SUCCESS_STATUS);
		}

		return map;
	}

}
