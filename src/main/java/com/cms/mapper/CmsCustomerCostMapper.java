package com.cms.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cms.pojo.CmsCustomerCost;

@Mapper
public interface CmsCustomerCostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_cost
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cmsCcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_cost
     *
     * @mbg.generated
     */
    int insert(CmsCustomerCost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_cost
     *
     * @mbg.generated
     */
    int insertSelective(CmsCustomerCost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_cost
     *
     * @mbg.generated
     */
    CmsCustomerCost selectByPrimaryKey(Integer cmsCcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_cost
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsCustomerCost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_cost
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsCustomerCost record);
    
    
    
    void updateBybalance();
    /**
     * 
     * @Title: getBalance
     * @Description: 通过ridId查询余额
     * @param cmsCcRid
     * @return
     */
	float getBalance(int cmsCcRid);
	
	/**
	 * 
	 * @Title: getByPhone
	 * @Description: 根据客户手机号查询消费表数据
	 * @param phone
	 * @return
	 */
	CmsCustomerCost getByPhone(String phone);
	List<CmsCustomerCost> selectBybalance();
	/**
	 * 
	 * @Title: editBalanceById
	 * @Description: 修改话费余额，版本号一致时才修改
	 * @param record
	 * @return
	 */
	
	int editBalanceById(CmsCustomerCost record);
}