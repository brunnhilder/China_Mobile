package com.cms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_score_product
 */
public class CmsScoreProduct implements Serializable {
    /**
     * Database Column Remarks:
     *   ????
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.cms_sp_id
     *
     * @mbg.generated
     */
    private Integer cmsSpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.product_name
     *
     * @mbg.generated
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.product_info
     *
     * @mbg.generated
     */
    private String productInfo;

    /**
     * Database Column Remarks:
     *   ?????????????-????????????=?????????????????
     *               ??????-1?????????????????
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.product_time_limit
     *
     * @mbg.generated
     */
    private Integer productTimeLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.product_score
     *
     * @mbg.generated
     */
    private Float productScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.score_type
     *
     * @mbg.generated
     */
    private String scoreType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.product_overdue_time
     *
     * @mbg.generated
     */
    private Date productOverdueTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.cms_sp_creator
     *
     * @mbg.generated
     */
    private Integer cmsSpCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.cms_sp_updator
     *
     * @mbg.generated
     */
    private Integer cmsSpUpdator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.cms_sp_creat_time
     *
     * @mbg.generated
     */
    private Date cmsSpCreatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.cms_sp_update_time
     *
     * @mbg.generated
     */
    private Date cmsSpUpdateTime;

    /**
     * Database Column Remarks:
     *   0??��???
     *               1???????
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_score_product.delete_sign
     *
     * @mbg.generated
     */
    private String deleteSign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_score_product
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.cms_sp_id
     *
     * @return the value of cms_score_product.cms_sp_id
     *
     * @mbg.generated
     */
    public Integer getCmsSpId() {
        return cmsSpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.cms_sp_id
     *
     * @param cmsSpId the value for cms_score_product.cms_sp_id
     *
     * @mbg.generated
     */
    public void setCmsSpId(Integer cmsSpId) {
        this.cmsSpId = cmsSpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.product_name
     *
     * @return the value of cms_score_product.product_name
     *
     * @mbg.generated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.product_name
     *
     * @param productName the value for cms_score_product.product_name
     *
     * @mbg.generated
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.product_info
     *
     * @return the value of cms_score_product.product_info
     *
     * @mbg.generated
     */
    public String getProductInfo() {
        return productInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.product_info
     *
     * @param productInfo the value for cms_score_product.product_info
     *
     * @mbg.generated
     */
    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.product_time_limit
     *
     * @return the value of cms_score_product.product_time_limit
     *
     * @mbg.generated
     */
    public Integer getProductTimeLimit() {
        return productTimeLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.product_time_limit
     *
     * @param productTimeLimit the value for cms_score_product.product_time_limit
     *
     * @mbg.generated
     */
    public void setProductTimeLimit(Integer productTimeLimit) {
        this.productTimeLimit = productTimeLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.product_score
     *
     * @return the value of cms_score_product.product_score
     *
     * @mbg.generated
     */
    public Float getProductScore() {
        return productScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.product_score
     *
     * @param productScore the value for cms_score_product.product_score
     *
     * @mbg.generated
     */
    public void setProductScore(Float productScore) {
        this.productScore = productScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.score_type
     *
     * @return the value of cms_score_product.score_type
     *
     * @mbg.generated
     */
    public String getScoreType() {
        return scoreType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.score_type
     *
     * @param scoreType the value for cms_score_product.score_type
     *
     * @mbg.generated
     */
    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.product_overdue_time
     *
     * @return the value of cms_score_product.product_overdue_time
     *
     * @mbg.generated
     */
    public Date getProductOverdueTime() {
        return productOverdueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.product_overdue_time
     *
     * @param productOverdueTime the value for cms_score_product.product_overdue_time
     *
     * @mbg.generated
     */
    public void setProductOverdueTime(Date productOverdueTime) {
        this.productOverdueTime = productOverdueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.version
     *
     * @return the value of cms_score_product.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.version
     *
     * @param version the value for cms_score_product.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.cms_sp_creator
     *
     * @return the value of cms_score_product.cms_sp_creator
     *
     * @mbg.generated
     */
    public Integer getCmsSpCreator() {
        return cmsSpCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.cms_sp_creator
     *
     * @param cmsSpCreator the value for cms_score_product.cms_sp_creator
     *
     * @mbg.generated
     */
    public void setCmsSpCreator(Integer cmsSpCreator) {
        this.cmsSpCreator = cmsSpCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.cms_sp_updator
     *
     * @return the value of cms_score_product.cms_sp_updator
     *
     * @mbg.generated
     */
    public Integer getCmsSpUpdator() {
        return cmsSpUpdator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.cms_sp_updator
     *
     * @param cmsSpUpdator the value for cms_score_product.cms_sp_updator
     *
     * @mbg.generated
     */
    public void setCmsSpUpdator(Integer cmsSpUpdator) {
        this.cmsSpUpdator = cmsSpUpdator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.cms_sp_creat_time
     *
     * @return the value of cms_score_product.cms_sp_creat_time
     *
     * @mbg.generated
     */
    public Date getCmsSpCreatTime() {
        return cmsSpCreatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.cms_sp_creat_time
     *
     * @param cmsSpCreatTime the value for cms_score_product.cms_sp_creat_time
     *
     * @mbg.generated
     */
    public void setCmsSpCreatTime(Date cmsSpCreatTime) {
        this.cmsSpCreatTime = cmsSpCreatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.cms_sp_update_time
     *
     * @return the value of cms_score_product.cms_sp_update_time
     *
     * @mbg.generated
     */
    public Date getCmsSpUpdateTime() {
        return cmsSpUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.cms_sp_update_time
     *
     * @param cmsSpUpdateTime the value for cms_score_product.cms_sp_update_time
     *
     * @mbg.generated
     */
    public void setCmsSpUpdateTime(Date cmsSpUpdateTime) {
        this.cmsSpUpdateTime = cmsSpUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_score_product.delete_sign
     *
     * @return the value of cms_score_product.delete_sign
     *
     * @mbg.generated
     */
    public String getDeleteSign() {
        return deleteSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_score_product.delete_sign
     *
     * @param deleteSign the value for cms_score_product.delete_sign
     *
     * @mbg.generated
     */
    public void setDeleteSign(String deleteSign) {
        this.deleteSign = deleteSign;
    }
}