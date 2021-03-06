package com.cms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cms.pojo.CmsCustomerInfo;

@Mapper
public interface CmsCustomerInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cmsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_info
     *
     * @mbg.generated
     */
    int insert(CmsCustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_info
     *
     * @mbg.generated
     */
    int insertSelective(CmsCustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_info
     *
     * @mbg.generated
     */
    CmsCustomerInfo selectByPrimaryKey(Integer cmsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsCustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_customer_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsCustomerInfo record);
}