/**  
 * @Title: UserMsg.java
 * @Package com.cms.msg
 * @author daluosi
 * @date 2020年6月29日
 * @version V1.0  
 */
package com.cms.msg;

/**
 * @ClassName: UserMsg
 * @Description: 用户常量
 * @author daluosi
 * @date 2020年6月29日
 * @since JDK 1.8
 */
public interface BalanceMsg {

	
	/**
	 * 查询消息key
	 */
	String  Balance_STATUS_MSG_KEY = "msg";
	
	/**
	 * 查询成功状态值1
	 */
	String Balance_SUCCESS_STATUS ="1";
	
	/**
	 * 查询失败状态值0
	 */
	String Balance_FAIL_STATUS ="0";
	/**
	 * 通话记录查询状态key
	 */
	String Balance_STATUS_KEY = "status";
	
	
}
