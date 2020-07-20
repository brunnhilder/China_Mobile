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
public interface ChangepwdMsg {

	/**
	 * 登录状态key
	 */
	String  CHANGE_STATUS_KEY="status";
	
	/**
	 * 登录消息key
	 */
	String  CHANGE_STATUS_MSG_KEY = "msg";
	
	/**
	 * 登录成功状态值1
	 */
	String CHANGE_SUCCESS_STATUS ="1";
	
	/**
	 * 登录失败状态值0
	 */
	String CHANGE_FAIL_STATUS ="0";
	
	/**
	 * 原密码验证有误消息
	 */
	String CHANGE_ID_VAL_FAIL_MSG ="您输入的原密码有误，请重新输入";
	
}
