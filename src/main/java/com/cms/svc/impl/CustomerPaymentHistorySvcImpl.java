/**  
 * @Title: CustomerPaymentHistoryImpl.java
 * @Package com.cms.svc.impl
 * @author sunxiaoning
 * @date 2020年7月9日
 * @version V1.0  
 */
package com.cms.svc.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.mapper.CmsPaymentHistoryMapper;
import com.cms.pojo.CmsPaymentHistory;
import com.cms.svc.CustomerPaymentHistorySvc;

/**
 * @ClassName: CustomerPaymentHistoryImpl
 * @Description: 缴费历史信息查询类
 * @author sunxiaoning
 * @date 2020年7月9日
 * @since JDK 1.8
 */
@Service
public class CustomerPaymentHistorySvcImpl implements CustomerPaymentHistorySvc {

	@Autowired
	private CmsPaymentHistoryMapper cmsPaymentHistoryMapper;

	@Override
	public List<CmsPaymentHistory> getInfo(int ridId, Date beginTime, Date endTime) {
		
		//查询缴费历史信息
		List<CmsPaymentHistory> callInfoList = cmsPaymentHistoryMapper.getInfo(ridId,beginTime,endTime);
		
		// 返回查询结果
		return callInfoList;
		
	}	 
}
