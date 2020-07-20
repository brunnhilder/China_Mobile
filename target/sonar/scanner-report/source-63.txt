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
public interface UserMsg {

	/**
	 * 登录状态key
	 */
	String  LOGIN_STATUS_KEY="status";
	
	/**
	 * 登录消息key
	 */
	String  LOGIN_STATUS_MSG_KEY = "msg";
	
	/**
	 * 登录成功状态值1
	 */
	String LOGIN_SUCCESS_STATUS ="1";
	
	/**
	 * 登录失败状态值01
	 */
	String LOGIN_FAIL_STATUS ="0";
	
	/**
	 * 手机号验证有误消息
	 */
	String LOGIN_ID_VAL_FAIL_MSG ="您输入的手机号有误，请重新输入";
	
}
