/**  
 * @Title: CustomerAuthSvc.java
 * @Package com.cms.svc
 * @author sunxiaoning
 * @date 2020年7月3日
 * @version V1.0  
 */
package com.cms.svc;

/**
 * @ClassName: CustomerAuthSvc
 * @Description:登录认证接口
 * @author sunxiaoning
 * @since JDK 1.8
 */
public interface CustomerAuthSvc {
	/**
	 * 
	 * @Title: validateUser
	 * @Description:  通过用户名和密码验证用户是否可以登录
	 * @return 0手机号或密码错误；1,可正常登录； 2,注销或冻结
	 */
	public int validateUser(String phoneNum, String password);
	/**
	 * 
	 * @Title: validateUser
	 * @Description:  通过手机号查询手机号的唯一标志ridId
	 * @return 手机号码的ridId
	 */
	public int getRidId(String phoneNum);
	
}
