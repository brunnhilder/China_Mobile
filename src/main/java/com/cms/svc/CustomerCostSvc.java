/**  
 * @Title: CustomerCostSvc.java
 * @Package com.cms.svc
 * @author sunxiaoing
 * @date 2020年7月8日
 * @version V1.0  
 */
package com.cms.svc;

/**
 * @ClassName: CustomerCostSvc
 * @Description:用户账户信息接口
 * @author sunxiaoning
 * @since JDK 1.8
 */
public interface CustomerCostSvc {

	/**
	 * 
	 * @Title: getBalance
	 * @Description:  通过ridId查询手机话费余额
	 * @return 返回余额
	 */
	public float balance(int cmsCcRid);
	
}
