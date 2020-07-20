/**  
 * @Title: CallHistMsg.java
 * @Package com.cms.msg
 * @author 田锐
 * @date 2020年7月8日
 * @version V1.0  
 */
package com.cms.msg;

/**
 * @ClassName: CallHistMsg
 * @Description: 保存通话记录所用常量的接口
 * @author 田锐
 * @date 2020年7月8日
 * @since JDK 1.8
 */
public interface CallHistMsg {

	
	/**
	 * 通话记录查询状态key
	 */
	String CH_QUERY_STATUS_KEY = "status";
	
	/**
	 * 通话记录查询成功状态值
	 */
	String CH_QUERY_SUCCESS_STATUS = "1";
	
	/**
	 * 查询结果数量的key
	 */
	String QUERY_SUCCESS_NUM_KEY = "callNum";
	
	/**
	 * 查询结果列表的key
	 */
	String QUERY_SUCCESS_LIST_KEY = "callList";
	
	/**
	 * 通话记录查询失败状态值
	 */
	String CH_QUERY_FAIL_STATUS = "0";
	
	/**
	 * 查询失败，提示信息的key
	 */
	String QUERY_FAIL_MSG_KEY = "msg";
	
	/**
	 * 查询失败，原因查询结果为空
	 */
	String QUERY_FAIL_NUL_MSG = "您在查询期间未进行通话。";
	
}
