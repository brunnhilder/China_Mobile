/**  
 * @Title: ScoreMsg.java
 * @Package com.cms.msg
 * @author 田锐
 * @date 2020年7月6日
 * @version V1.0  
 */
package com.cms.msg;

/**
 * @ClassName: ScoreMsg
 * @Description: 积分计划功能常量
 * @author 田锐
 * @date 2020年7月6日
 * @since JDK 1.8
 */
public interface ScoreMsg {

	/**
	 * 积分查询状态key
	 */
	String SCORE_QUERY_STATUS_KEY = "status";
	
	/**
	 * 积分查询成功状态值
	 */
	String SCORE_QUERY_SUCCESS_STATUS = "1";
	
	/**
	 * 查询成功，查询结果的key
	 */
	String QUERY_SUCCESS_MSG_KEY = "score";
	
	/**
	 * 积分查询失败状态值
	 */
	String SCORE_QUERY_FAIL_STATUS = "0";
	
	/**
	 * 积分查询失败提示key
	 */
	String QUERY_FAIL_MSG_KEY = "msg";
	
	/**
	 * 积分查询失败提示，原因为手机号格式有误
	 */
	String QUERY_FAIL_PF_MSG = "查询失败，手机号格式有误！";
	
	/**
	 * 积分查询失败提示，原因为手机号不存在
	 */
	String QUERY_FAIL_PNE_MSG = "查询失败，手机号不存在！";
	
	/**
	 * 查询结果为空
	 */
	String QUERY_FAIL_NUL_MSG = "您的可用积分列表为空。";
	
}
