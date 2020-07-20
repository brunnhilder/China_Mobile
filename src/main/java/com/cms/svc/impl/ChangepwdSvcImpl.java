/**  
 * @Title: UserSvcImpl.java
 * @Package com.cms.svc.impl
 * @author daluosi
 * @date 2020年6月29日
 * @version V1.0  
 */
package com.cms.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cms.mapper.CmsCustomerAuthMapper;
import com.cms.pojo.CmsCustomerAuth;
import com.cms.pojo.CmsCustomerScore;
import com.cms.svc.ChangepwdSvc;


/**
 * @ClassName: UserSvcImpl
 * @Description: 用户操作实现类
 * @author daluosi
 * @date 2020年6月29日
 * @since JDK 1.8
 */
@Service
public class ChangepwdSvcImpl implements ChangepwdSvc {

	@Autowired
	private CmsCustomerAuthMapper customerAuthMapper;

	@Override
	//@Rollback(false)
	public int updateChangepwd(String phoneNum, String password,String oldpassword) {
		System.out.println("输入的新密码"+password);
		CmsCustomerAuth cmsCustomerAuth = customerAuthMapper.selectBycmsAuth(phoneNum);
		String oldpwd = cmsCustomerAuth.getPassword();
		if (oldpwd.equals(oldpassword)) {
			cmsCustomerAuth.setPassword(password);
			customerAuthMapper.updateByPrimaryKey(cmsCustomerAuth);
			return 1;
		}
		return 0;
	}

	
	

	
	  
	  
	 
}
