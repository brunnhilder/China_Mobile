/**  
 * @Title: CustomerCostSvcImpl.java
 * @Package com.cms.svc.impl
 * @author sunxiaoning
 * @date 2020年7月8日
 * @version V1.0  
 */
package com.cms.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.CmsCustomerCostMapper;

import com.cms.svc.CustomerCostSvc;

/**
 * @ClassName: CustomerCostSvcImpl
 * @Description: 余额查询实现类
 * @author sunxiaoning
 * @date 2020年7月8日
 * @since JDK 1.8
 */
@Service
public class CustomerCostSvcImpl implements CustomerCostSvc {

	@Autowired
	private CmsCustomerCostMapper customerCostMapper;

	@Override
	public float balance(int cmsCcRid) {
		return customerCostMapper.getBalance(cmsCcRid);
	}
}
