﻿/**  
 * @Title: ChangepwdSvc.java
 * @Package com.cms.svc
 * @author 陈超
 * @date 2020年7月8日
 * @version V1.0  
 */
package com.cms.svc;



import com.cms.pojo.CmsCustomerAuth;

/**
 * @ClassName: ChangepwdSvc
 * @Description: 修改密码功能中修改密码的业务接口。
 * @author 陈超
 * @date 2020年7月8日
 * @since JDK 1.8
 */

public interface ChangepwdSvc {
	
	/**
	 * 
	 * @Title: updateChangepwd
	 * @Description: 根据客户的电话号码以及提交的新密码，修改该客户的服务密码
	 * @param phoneNum，password
	 * @return
	 */
	public int updateChangepwd(String phoneNum, String password,String oldpassword);
	
	
	
}