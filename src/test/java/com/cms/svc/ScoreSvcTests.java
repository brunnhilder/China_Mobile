/**  
 * @Title: ScoreSvcTests.java
 * @Package com.cms.svc
 * @author 田锐
 * @date 2020年7月6日
 * @version V1.0  
 */
package com.cms.svc;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.cms.BaseTests;
import junit.framework.TestCase;

/**
 * @ClassName: ScoreSvcTests
 * @Description: 积分计划业务类功能测试
 * @author 田锐
 * @date 2020年7月6日
 * @since JDK 1.8
 */
public class ScoreSvcTests extends BaseTests{
	
	/**
	 * 被测试类
	 */
	@Autowired
	private ScoreSvc scoreSvc;
	
	@Autowired
	private ChangepwdSvc changepwdSvc;
	
	/**
	 * 
	 * @Title: testGetScores
	 * @Description: 测试积分查询功能
	 */
	@Test
    public void testGetScores(){
		
		//测试号码
		String phone = "15910203619";
		
		//查询积分列表
		List<Map<String,Float>> scoreList = scoreSvc.getScores(phone);
		
		//输出积分列表
		System.out.println("scoreList = " + scoreList);
		
		//测试结果
		TestCase.assertNotNull(scoreList);
    }
}
