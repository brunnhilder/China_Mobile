package com.cms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_product_purchase_history
 */
public class CmsProductPurchaseHistory implements Serializable {
    /**
     * Database Column Remarks:
     *   ????
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_product_purchase_history.cms_pph_id
     *
     * @mbg.generated
     */
    private Integer cmsPphId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_product_purchase_history.cms_pph_creat_time
     *
     * @mbg.generated
     */
    private Date cmsPphCreatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_product_purchase_history.product_id
     *
     * @mbg.generated
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_product_purchase_history.cms_pph_rid
     *
     * @mbg.generated
     */
    private Integer cmsPphRid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_product_purchase_history.purchase_number
     *
     * @mbg.generated
     */
    private Integer purchaseNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_product_purchase_history.cost_score
     *
     * @mbg.generated
     */
    private Float costScore;

    /**
     * Database Column Remarks:
     *   0??��????
     *               1???????
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_product_purchase_history.is_deliver
     *
     * @mbg.generated
     */
    private String isDeliver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_product_purchase_history
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_product_purchase_history.cms_pph_id
     *
     * @return the value of cms_product_purchase_history.cms_pph_id
     *
     * @mbg.generated
     */
    public Integer getCmsPphId() {
        return cmsPphId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_product_purchase_history.cms_pph_id
     *
     * @param cmsPphId the value for cms_product_purchase_history.cms_pph_id
     *
     * @mbg.generated
     */
    public void setCmsPphId(Integer cmsPphId) {
        this.cmsPphId = cmsPphId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_product_purchase_history.cms_pph_creat_time
     *
     * @return the value of cms_product_purchase_history.cms_pph_creat_time
     *
     * @mbg.generated
     */
    public Date getCmsPphCreatTime() {
        return cmsPphCreatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_product_purchase_history.cms_pph_creat_time
     *
     * @param cmsPphCreatTime the value for cms_product_purchase_history.cms_pph_creat_time
     *
     * @mbg.generated
     */
    public void setCmsPphCreatTime(Date cmsPphCreatTime) {
        this.cmsPphCreatTime = cmsPphCreatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_product_purchase_history.product_id
     *
     * @return the value of cms_product_purchase_history.product_id
     *
     * @mbg.generated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_product_purchase_history.product_id
     *
     * @param productId the value for cms_product_purchase_history.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_product_purchase_history.cms_pph_rid
     *
     * @return the value of cms_product_purchase_history.cms_pph_rid
     *
     * @mbg.generated
     */
    public Integer getCmsPphRid() {
        return cmsPphRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_product_purchase_history.cms_pph_rid
     *
     * @param cmsPphRid the value for cms_product_purchase_history.cms_pph_rid
     *
     * @mbg.generated
     */
    public void setCmsPphRid(Integer cmsPphRid) {
        this.cmsPphRid = cmsPphRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_product_purchase_history.purchase_number
     *
     * @return the value of cms_product_purchase_history.purchase_number
     *
     * @mbg.generated
     */
    public Integer getPurchaseNumber() {
        return purchaseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_product_purchase_history.purchase_number
     *
     * @param purchaseNumber the value for cms_product_purchase_history.purchase_number
     *
     * @mbg.generated
     */
    public void setPurchaseNumber(Integer purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_product_purchase_history.cost_score
     *
     * @return the value of cms_product_purchase_history.cost_score
     *
     * @mbg.generated
     */
    public Float getCostScore() {
        return costScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_product_purchase_history.cost_score
     *
     * @param costScore the value for cms_product_purchase_history.cost_score
     *
     * @mbg.generated
     */
    public void setCostScore(Float costScore) {
        this.costScore = costScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_product_purchase_history.is_deliver
     *
     * @return the value of cms_product_purchase_history.is_deliver
     *
     * @mbg.generated
     */
    public String getIsDeliver() {
        return isDeliver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_product_purchase_history.is_deliver
     *
     * @param isDeliver the value for cms_product_purchase_history.is_deliver
     *
     * @mbg.generated
     */
    public void setIsDeliver(String isDeliver) {
        this.isDeliver = isDeliver;
    }
}