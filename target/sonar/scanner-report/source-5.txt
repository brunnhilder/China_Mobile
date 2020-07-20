/**  
 * @Title: CustomerAuthAction.java
 * @Package com.cms.action
 * @author sunxiaoning
 * @date 2020年7月5日
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.UserMsg;
import com.cms.svc.CustomerAuthSvc;

/**
 * @ClassName: CustomerAuthAction
 * @Description: 登陆操作
 * @author sunxiaoning
 * @since JDK 1.8
 */
@RestController
public class CustomerAuthAction {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CustomerAuthSvc CustomerAuthSvc;

	//get           select
	//post          insert 
	//delete        delete
	//put           update
	/**
	 * 
	 * @Title: login
	 * @Description: 登陆页面
	 * @param request
	 * @return
	 */
	@GetMapping({"/","/loginIndex"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}

	/**
	 * 
	 * @Title: validateUser
	 * @Description: 验证用户
	 * @param paramMap
	 * @return
	 */
	@GetMapping("login")//创建一个会话
	@ResponseBody
	public Map<String, String> validateUser(@RequestParam Map<String, String> paramMap,HttpSession session) {
		logger.info("用户登陆信息:{}", paramMap);
		// 获取登录信息
		String phoneNum = paramMap.get("phoneNum");
		String password = paramMap.get("password");

		// 验证手机号
		Pattern p = Pattern.compile("[1][3578][0-9]{9}");
		Matcher matcher = p.matcher(phoneNum);
		boolean b = matcher.matches();
		Map<String, String> map = new HashMap<>();

		// 手机号不合法，则返回并提示
		if (!b) {
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_FAIL_STATUS);
			map.put(UserMsg.LOGIN_STATUS_MSG_KEY, UserMsg.LOGIN_ID_VAL_FAIL_MSG);
			logger.info(UserMsg.LOGIN_STATUS_MSG_KEY);
			return map;
		}

		// TODO 同理验证密码
		int result = CustomerAuthSvc.validateUser(phoneNum, password);
		
		//数据库中没查询到用户
		if (result == 0) {
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_FAIL_STATUS);
			map.put(UserMsg.LOGIN_STATUS_MSG_KEY, "手机号和密码有误");
			logger.info(UserMsg.LOGIN_STATUS_MSG_KEY);
		}

		// 登录成功
		if (result == 1) {
			// 认证与用户信息一般情况下时分属两张表，所以需要再查询一下用户的数据保存到session中
			session.setAttribute("phone",phoneNum);
			//通过手机号查询ridId存入session中
			int ridId = CustomerAuthSvc.getRidId(phoneNum);
			session.setAttribute("ridId",ridId);
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_SUCCESS_STATUS);
			logger.info(UserMsg.LOGIN_SUCCESS_STATUS);
		}
			//手机号停机等导致无法登陆
		if (result == 2) {
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_FAIL_STATUS);
			map.put(UserMsg.LOGIN_STATUS_MSG_KEY, "手机号已冻结或注销");
			logger.info(UserMsg.LOGIN_STATUS_MSG_KEY);
		}
		return map;
	}
	
	
}
