/**  
 * @Title: CallInfoWithPhone.java
 * @Package com.cms.pojo
 * @author 田锐
 * @date 2020年7月8日
 * @version V1.0  
 */
package com.cms.pojo;

/**
 * @ClassName: CallInfoWithPhone
 * @Description: 为了帮助查询通话记录，而创建的pojo类，属性中添加了通话双方的手机号
 * @author 田锐
 * @date 2020年7月8日
 * @since JDK 1.8
 */
public class CallInfoWithPhone extends CmsCallInfo {

	/**
	 * 拨打方手机号
	 */
	private String fromPhone;

	/**
	 * 接收方手机号
	 */
	private String toPhone;

	/**
	 * @return fromPhone
	 */
	public String getFromPhone() {
		return fromPhone;
	}

	/**
	 * @param fromPhone the fromPhone to set
	 */
	public void setFromPhone(String fromPhone) {
		this.fromPhone = fromPhone;
	}

	/**
	 * @return toPhone
	 */
	public String getToPhone() {
		return toPhone;
	}

	/**
	 * @param toPhone the toPhone to set
	 */
	public void setToPhone(String toPhone) {
		this.toPhone = toPhone;
	}

}
