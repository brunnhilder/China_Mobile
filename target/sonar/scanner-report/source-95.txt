/**  
 * @Title: CustomerAuthSvcImpl.java
 * @Package com.cms.svc.impl
 * @author sunxiaoning
 * @date 2020年7月3日
 * @version V1.0  
 */
package com.cms.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.CmsCustomerAuthMapper;
import com.cms.pojo.CmsCustomerAuth;

import com.cms.svc.CustomerAuthSvc;

/**
 * @ClassName: CustomerAuthSvcImpl
 * @Description: 用户登录实现类
 * @author sunxiaoning
 * @date 2020年7月3日
 * @since JDK 1.8
 */
@Service
public class CustomerAuthSvcImpl implements CustomerAuthSvc {

	@Autowired
	private CmsCustomerAuthMapper customerAuthMapper;

	@Override
	public int validateUser(String phoneNum, String password) {
		CmsCustomerAuth record = new CmsCustomerAuth();
		record.setPhoneNum(phoneNum);
		record.setPassword(password);
		String status = customerAuthMapper.selectByIDAndPwd(record);

		if (status == null) {
			return 0;
		}
		if (status != null && status.equals("0")) {
			return 1;
		}

		return 2;
	}

	@Override
	public int getRidId(String phoneNum) {
		return customerAuthMapper.getRidId(phoneNum);
	}	 
}
