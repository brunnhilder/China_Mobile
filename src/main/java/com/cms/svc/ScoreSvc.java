/**  
 * @Title: ScoreSvc.java
 * @Package com.cms.svc
 * @author 田锐
 * @date 2020年7月6日
 * @version V1.0  
 */
package com.cms.svc;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: ScoreSvc
 * @Description: 积分计划功能中，积分查询与积分商城相关的业务接口。
 * @author 田锐
 * @date 2020年7月6日
 * @since JDK 1.8
 */
public interface ScoreSvc {
	
	/**
	 * 
	 * @Title: getScores
	 * @Description: 根据客户手机号，查询该客户的所有未过期积分的类型（作为key）和余额(作为value)
	 * @param phone
	 * @return
	 */
	List<Map<String,Float>> getScores(String phone);
	
}