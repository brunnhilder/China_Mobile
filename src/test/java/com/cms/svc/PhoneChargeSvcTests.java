/**  
 * @Title: PhoneChargeSvcTests.java
 * @Package com.cms.svc
 * @author 田锐
 * @date 2020年7月9日
 * @version V1.0  
 */
package com.cms.svc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cms.BaseTests;
import com.cms.msg.PayChargeMsg;

import junit.framework.TestCase;

/**
 * @ClassName: PhoneChargeSvcTests
 * @Description: 测试，话费充值功能的业务层类
 * @author 田锐
 * @date 2020年7月9日
 * @since JDK 1.8
 */
public class PhoneChargeSvcTests extends BaseTests {

	/**
	 * 话费充值功能的业务层类
	 */
	@Autowired
	private PhoneChargeSvc phoneChargeSvc;

	/**
	 * 
	 * @Title: testCheckRefillCard
	 * @Description: 测试检查充值卡的功能
	 */
	@Test
	public void testCheckRefillCard() {

		// 卡号密码
		String cardId = "15822320200709108";
		String cardPwd = "123456123456123456";

		// 测试
		int status = phoneChargeSvc.checkRefillCard(cardId, cardPwd);

		// 测试结果应该为充值卡可用
		TestCase.assertEquals(status, PayChargeMsg.CARD_CHECK_SUCCESS);
	}

	/**
	 * 
	 * @Title: testPayChargeByCard
	 * @Description: 测试充值功能
	 */
	@Test
	public void testPayChargeByCard() {

		// 测试号码
		String phone = "15910203619";

		// 测试卡号和卡密码
		String cardId = "15822320200709108";
		String cardPwd = "123456123456123456";

		// 进行充值
		int res = phoneChargeSvc.payChargeByCard(cardId, cardPwd, phone);

		TestCase.assertEquals(res, PayChargeMsg.REFILL_EDIT_SUCC);
	}

}
