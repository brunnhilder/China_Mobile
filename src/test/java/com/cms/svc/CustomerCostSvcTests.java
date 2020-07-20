/**  
 * @Title: CustomerCostSvcTestsTests.java
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
 * @ClassName: CustomerCostSvcTestsTests
 * @Description:测试余额信息查询
 * @author sunxiaoning
 * @date 2020年7月6日
 * @since JDK 1.8
 */
public class CustomerCostSvcTests extends BaseTests {

	@Autowired
	private CustomerCostSvc customerCostSvc;
	
	@Test
    public void testLogin(){
		int cmsCcRid=1;
		int result;
		float balance = customerCostSvc.balance(cmsCcRid);
		if(balance==12.21)
		{
			result=1;
		}
		else
		{
			result=0;
		}
		TestCase.assertEquals("是否等于1", result, 1);
    }
}
