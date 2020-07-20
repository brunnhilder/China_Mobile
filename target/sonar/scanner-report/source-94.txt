/**  
 * @Title: CustomerCallSvcImpl.java
 * @Package com.cms.svc.impl
 * @author 田锐
 * @date 2020年7月7日
 * @version V1.0  
 */
package com.cms.svc.impl;

import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.mapper.CmsCallInfoMapper;
import com.cms.pojo.CallInfoWithPhone;
import com.cms.svc.CustomerCallSvc;

/**
 * @ClassName: CustomerCallSvcImpl
 * @Description: 客户通话记录相关功能的业务接口的实现类
 * @author 田锐
 * @date 2020年7月7日
 * @since JDK 1.8
 */
@Service
public class CustomerCallSvcImpl implements CustomerCallSvc {

	/**
	 * logger对象
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 客户通话记录表的mapper层对象，用于对该表的增删改查操作
	 */
	@Autowired
	private CmsCallInfoMapper cmsCallInfoMapper;

	/*
	 * (非 Javadoc)
	 * 
	 * 
	 * @param phone
	 * @param beginTime
	 * @param endTime
	 * @return
	 * @see com.cms.svc.CustomerCallSvc#getCallHistory(java.lang.String, java.util.Date, java.util.Date)
	 */
	@Override
	public List<CallInfoWithPhone> getCallHistory(String phone, Date beginTime, Date endTime) {

		// 记录查询的号码和日期
		logger.info("phone=" + phone + ",beginTime=" + beginTime + ",endTime=" + endTime);

		// 查询符合条件的通话记录
		List<CallInfoWithPhone> callInfoList = cmsCallInfoMapper.listByPhoneAndTime(phone, beginTime, endTime);
			
		// 记录查询结果
		logger.info("callInfoList{}", callInfoList);

		// 返回查询结果
		return callInfoList;
	}

}
