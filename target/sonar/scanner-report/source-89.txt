/**  
 * @Title: CustomerPaymentHistorySvc.java
 * @Package com.cms.svc
 * @author sunxiaoning
 * @date 2020年7月9日
 * @version V1.0  
 */
package com.cms.svc;

/**
 * @ClassName: CustomerPaymentHistorySvc
 * @Description:用户账户信息接口
 * @author sunxiaoning
 * @since JDK 1.8
 */
import java.util.Date;
import java.util.List;

import com.cms.pojo.CmsPaymentHistory;

public interface CustomerPaymentHistorySvc {
	
	/**
	 * 
	 * @Title: getInfo
	 * @Description:  通过ridId查询缴费历史信息
	 * @return 返回缴费历史信息
	 */
	List<CmsPaymentHistory> getInfo(int ridId, Date beginTime, Date endTime);

}
