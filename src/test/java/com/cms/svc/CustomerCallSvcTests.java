/**  
 * @Title: CustomerCallSvcTests.java
 * @Package com.cms.svc
 * @author 田锐
 * @date 2020年7月7日
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
import junit.framework.TestCase;

/**
 * @ClassName: CustomerCallSvcTests
 * @Description: 通话记录功能业务类测试
 * @author 田锐
 * @date 2020年7月7日
 * @since JDK 1.8
 */
public class CustomerCallSvcTests extends BaseTests {

	/**
	 * 被测试类
	 */
	@Autowired
	private CustomerCallSvc customerCallSvc;

	/**
	 * 
	 * @Title: testGetCallHistory
	 * @Description: 测试根据手机号和最早时间查询通话记录功能
	 */
	@Test
	public void testGetCallHistory() {

		// 创建测试数据
		String phone = "15910203619";
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
		List<CallInfoWithPhone> callInfoList = customerCallSvc.getCallHistory(phone, beginTime, endTime);

		// 输出callInfoList
		System.out.println("callInfoList = " + callInfoList);

		// 测试是否非空
		TestCase.assertNotNull(callInfoList);
	}
}
