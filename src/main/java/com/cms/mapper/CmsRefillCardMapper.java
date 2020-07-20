package com.cms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cms.pojo.CmsRefillCard;

@Mapper
public interface CmsRefillCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_refill_card
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cmsRcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_refill_card
     *
     * @mbg.generated
     */
    int insert(CmsRefillCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_refill_card
     *
     * @mbg.generated
     */
    int insertSelective(CmsRefillCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_refill_card
     *
     * @mbg.generated
     */
    CmsRefillCard selectByPrimaryKey(Integer cmsRcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_refill_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsRefillCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_refill_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsRefillCard record);
    
    /**
     * 
     * @Title: getByCardId
     * @Description: 根据卡号查询充值卡
     * @param cardId
     * @return
     */
    CmsRefillCard getByCardId(String cardId);
    
    /**
     * 
     * @Title: editByCardId
     * @Description: 更改充值卡为已使用
     * @param record
     * @return
     */
    int editByCardId(CmsRefillCard record);
}