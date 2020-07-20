/**  
 * @Title: IndexAction.java
 * @Package com.cms.action
 * @author daluosi
 * @date 2020年6月30日
 * @version V1.0  
 */
package com.cms.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.svc.CustomerAuthSvc;


/**
 * @ClassName: IndexAction
 * @Description: 主页操作
 * @author sunxiaoning
 * @since JDK 1.8
 */

@RequestMapping("/index")
@RestController
public class IndexAction {

	@Autowired
	private CustomerAuthSvc customerAuthSvc;
	
	/**
	 * 
	 * @Title: index
	 * @Description: 访问主页
	 * @return
	 */
	//响应进入首页请求
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("main");
		return modelAndView;
	}
	//响应余额查询请求
	@GetMapping("balanceCheck")
	public ModelAndView getBalance(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("balance");
		return modelAndView;
	}
	
	@GetMapping("paymentHistory")
	public ModelAndView getPaymentHistory(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("paymenthistory");
		return modelAndView;
	}
}
