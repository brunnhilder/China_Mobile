/**  
 * @Title: IndexAction.java
 * @Package com.cms.action
 * @author sunxiaoning
 * @date 2020年7月1日
 * @version V1.0  
 */
package com.cms.action;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.BalanceMsg;
import com.cms.svc.CustomerCostSvc;


/**
 * @ClassName: BalanceAction
 * @Description: 主页操作
 * @author sunxiaoning
 * @since JDK 1.8
 */

@RequestMapping("/balance")
@RestController
public class BalanceAction {

	@Autowired
	private CustomerCostSvc customerCostSvc;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 
	 * @Title: balance
	 * @Description: 访问余额查询页面
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView index() {
		// 设置跳转页面为通话记录页面
		ModelAndView modelAndView = new ModelAndView("balance/balance");
		return modelAndView;
	}
	
	@GetMapping("balanceCheck")
	public Map<String, Object> getBalance(HttpSession session) {
		Map<String, Object> map = new HashMap<>();
		//从session中获取ridId
		int cmsCcRid=(int) session.getAttribute("ridId");
		//通过ridId查询余额
		float balance = customerCostSvc.balance(cmsCcRid);
		//查询成功的结果
		map.put(BalanceMsg.Balance_STATUS_KEY, BalanceMsg.Balance_SUCCESS_STATUS);
		//将余额放入map中提供给前端显示
		map.put("balance",balance);
		logger.info(BalanceMsg.Balance_SUCCESS_STATUS);
		return map;
	}
}
