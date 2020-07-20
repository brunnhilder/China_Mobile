/**  
 * @Title: PayChargeMsg.java
 * @Package com.cms.msg
 * @author 田锐
 * @date 2020年7月7日
 * @version V1.0  
 */
package com.cms.msg;

/**
 * @ClassName: PayChargeMsg
 * @Description: 保存在线缴纳话费业务用到的常量
 * @author 田锐
 * @date 2020年7月7日
 * @since JDK 1.8
 */
public interface PayChargeMsg {

	/**
	 * 充值卡不存在
	 */
	int CARD_NOT_EXIST = 21;
	
	/**
	 * 密码错误
	 */
	int CARD_PWD_ERROR = 22;
	
	/**
	 * 充值卡已过期
	 */
	int CARD_END_TIME = 23;
	
	/**
	 * 充值卡可用
	 */
	int CARD_CHECK_SUCCESS = 20;
	
	/**
	 * 充值卡可用
	 */
	int CARD_STATUS_VALID = 0;
	
	/**
	 * 充值卡已被使用
	 */
	int CARD_STATUS_USED = 1;
	
	/**
	 * 充值卡其它原因不可用
	 */
	int CARD_STATUS_INVALID = 2;
	
	/**
	 * 进行充值操作时，更新成功
	 */
	int REFILL_EDIT_SUCC = 30;
	
	/**
	 * 进行充值操作时，更新失败
	 */
	int REFILL_EDIT_FAIL = 31;
	
	/**
	 * 充值请求的处理状态key
	 */
	String REFILL_STATUS_KEY = "status";
	
	/**
	 * 充值失败的状态值
	 */
	String REFILL_STATUS_FAIL = "0";
	
	/**
	 * 充值成功的状态值
	 */
	String REFILL_STATUS_SUCC = "1";
	
	/**
	 * 充值成功提示消息的key
	 */
	String REFILL_SUCC_MSG_KEY = "succMsg";
	
	/**
	 * 充值成功提示消息
	 */
	String REFILL_SUCC_MSG = "充值成功！";
	
	/**
	 * 充值失败提示消息的key
	 */
	String REFILL_FAIL_MSG_KEY = "failMsg";
	
	/**
	 * phone获取失败时的提示
	 */
	String REFILL_FAIL_PNE_MSG = "充值失败，您未登录！";
	
	/**
	 * 卡号不存在导致的充值失败
	 */
	String REFILL_FAIL_CNE_MSG = "充值失败，卡号不存在！";
	
	/**
	 * 密码错误导致的充值失败
	 */
	String REFILL_FAIL_PE_MSG = "充值失败，密码错误！";
	
	/**
	 * 充值卡已过期导致的充值失败
	 */
	String REFILL_FAIL_CE_MSG = "充值失败，充值卡已过期！";
	
	/**
	 * 充值卡已使用导致的充值失败
	 */
	String REFILL_FAIL_CU_MSG = "充值失败，充值卡已被使用！";
	
	/**
	 * 充值卡其它原因不可用
	 */
	String REFILL_FAIL_CIV_MSG = "充值失败，充值卡无效！";
	
	
	/**
	 * 更新时version不一致导致的充值失败
	 */
	String REFILL_FAIL_VE_MSG = "卡号与密码无误，但充值失败，请重新尝试！";
	
	/**
	 * 卡号格式错误
	 */
	String REFILL_FAIL_CIF_MSG = "卡号格式错误！";
	
	/**
	 * 密码格式错误
	 */
	String REFILL_FAIL_CPF_MSG = "密码格式错误！";
}
