package com.cms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cms.pojo.CmsProductPurchaseHistory;

@Mapper
public interface CmsProductPurchaseHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_product_purchase_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cmsPphId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_product_purchase_history
     *
     * @mbg.generated
     */
    int insert(CmsProductPurchaseHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_product_purchase_history
     *
     * @mbg.generated
     */
    int insertSelective(CmsProductPurchaseHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_product_purchase_history
     *
     * @mbg.generated
     */
    CmsProductPurchaseHistory selectByPrimaryKey(Integer cmsPphId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_product_purchase_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsProductPurchaseHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_product_purchase_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsProductPurchaseHistory record);
}