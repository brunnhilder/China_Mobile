/**  
 * @Title: PhoneChargeSvc.java
 * @Package com.cms.svc
 * @author 田锐
 * @date 2020年7月7日
 * @version V1.0  
 */
package com.cms.svc;

import java.util.Map;

/**
 * @ClassName: PhoneChargeSvc
 * @Description: 客户手机话费功能的业务类接口
 * @author 田锐
 * @date 2020年7月7日
 * @since JDK 1.8
 */
public interface PhoneChargeSvc {

	/**
	 * 
	 * @Title: checkRefillCard
	 * @Description: 检查充值卡是否可用，返回值见PayChargeMsg接口
	 * @param cardId
	 * @param cardPwd
	 * @return
	 */
	public int checkRefillCard(String cardId, String cardPwd);
	
	/**
	 * 
	 * @Title: payChargeByCard
	 * @Description: 使用移动充值卡在线缴费，返回结果含义见PayChargeMsg接口
	 * @param cardId
	 * @param cardPwd
	 * @param phone
	 * @return
	 */
	int payChargeByCard(String cardId, String cardPwd, String phone);
}
