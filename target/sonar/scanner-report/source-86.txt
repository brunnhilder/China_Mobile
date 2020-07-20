/**  
 * @Title: CustomerCallSvc.java
 * @Package com.cms.svc
 * @author 田锐
 * @date 2020年7月7日
 * @version V1.0  
 */
package com.cms.svc;

import java.util.Date;
import java.util.List;
import com.cms.pojo.CallInfoWithPhone;

/**
 * @ClassName: CustomerCallSvc
 * @Description: 客户通话记录相关功能的业务类接口
 * @author 田锐
 * @date 2020年7月7日
 * @since JDK 1.8
 */
public interface CustomerCallSvc {

	/**
	 * 
	 * @Title: getCallHistory
	 * @Description: 根据客户的手机号和查询时间，查询符合条件的所有通话记录。
	 * @param phone
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	List<CallInfoWithPhone> getCallHistory(String phone, Date beginTime, Date endTime);
}
