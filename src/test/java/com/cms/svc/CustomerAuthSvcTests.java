/**  
 * @Title: CustomerAuthSvcTests.java
 * @Package com.cms.svc
 * @author sunxiaoning
 * @date 2020年7月6日
 * @version V1.0  
 */
package com.cms.svc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cms.BaseTests;

import junit.framework.TestCase;

/**
 * @ClassName: CustomerAuthSvcTestsTests
 * @Description:测试登陆
 * @author sunxiaoning
 * @date 2020年7月6日
 * @since JDK 1.8
 */
public class CustomerAuthSvcTests extends BaseTests {

	@Autowired
	private CustomerAuthSvc customerAuthSvc;
	
	@Test
    public void testLogin(){
		String phoneNum = "17624035467";
		String password = "123456";
		int result = customerAuthSvc.validateUser(phoneNum, password);
		TestCase.assertEquals("是否等于1", result, 1);
    }
}
