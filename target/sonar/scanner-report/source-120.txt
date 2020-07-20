/**  
 * @Title: CustomerPaymentHistorySvcTests.java
 * @Package com.cms.svc
 * @author sunxiaoning
 * @date 2020年7月6日
 * @version V1.0  
 */
package com.cms.svc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.cms.BaseTests;
import com.cms.pojo.CallInfoWithPhone;
import com.cms.pojo.CmsPaymentHistory;

import junit.framework.TestCase;

/**
 * @ClassName: CustomerPaymentHistorySvcTests
 * @Description:测试缴费历史查询
 * @author sunxiaoning
 * @date 2020年7月6日
 * @since JDK 1.8
 */
public class CustomerPaymentHistorySvcTests extends BaseTests {

	/**
	 * 被测试类
	 */
	@Autowired
	private CustomerPaymentHistorySvc customerPaymentHistorySvc;

	/**
	 * 
	 * @Title: testGetCallHistory
	 * @Description: 测试根据手机号和最早时间查询通话记录功能
	 */
	@Test
	public void testGetCallHistory() {

		// 创建测试数据
		int ridId = 1;
		Date beginTime = null;
		Date endTime = null;

		try {
			
			// 生成查询的开始时间和截止时间
			beginTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2020-07-01 00:00:00");
			endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2020-07-08 23:59:59");
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// 测试getCallHistory方法
		List<CmsPaymentHistory> callInfoList = customerPaymentHistorySvc.getInfo(ridId,beginTime,endTime);

		// 测试是否非空
		TestCase.assertNotNull(callInfoList);
	}
}
