package com.cms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_refill_card
 */
public class CmsRefillCard implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.cms_rc_id
     *
     * @mbg.generated
     */
    private Integer cmsRcId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.cms_rc_create_time
     *
     * @mbg.generated
     */
    private Date cmsRcCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.card_id
     *
     * @mbg.generated
     */
    private String cardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.card_pwd
     *
     * @mbg.generated
     */
    private String cardPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.card_money
     *
     * @mbg.generated
     */
    private Float cardMoney;

    /**
     * Database Column Remarks:
     *   0??��???
     *               1???????
     *               2????????????
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.card_status
     *
     * @mbg.generated
     */
    private String cardStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.use_time
     *
     * @mbg.generated
     */
    private Date useTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_refill_card.use_rid
     *
     * @mbg.generated
     */
    private Integer useRid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_refill_card
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.cms_rc_id
     *
     * @return the value of cms_refill_card.cms_rc_id
     *
     * @mbg.generated
     */
    public Integer getCmsRcId() {
        return cmsRcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.cms_rc_id
     *
     * @param cmsRcId the value for cms_refill_card.cms_rc_id
     *
     * @mbg.generated
     */
    public void setCmsRcId(Integer cmsRcId) {
        this.cmsRcId = cmsRcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.version
     *
     * @return the value of cms_refill_card.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.version
     *
     * @param version the value for cms_refill_card.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.cms_rc_create_time
     *
     * @return the value of cms_refill_card.cms_rc_create_time
     *
     * @mbg.generated
     */
    public Date getCmsRcCreateTime() {
        return cmsRcCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.cms_rc_create_time
     *
     * @param cmsRcCreateTime the value for cms_refill_card.cms_rc_create_time
     *
     * @mbg.generated
     */
    public void setCmsRcCreateTime(Date cmsRcCreateTime) {
        this.cmsRcCreateTime = cmsRcCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.end_time
     *
     * @return the value of cms_refill_card.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.end_time
     *
     * @param endTime the value for cms_refill_card.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.card_id
     *
     * @return the value of cms_refill_card.card_id
     *
     * @mbg.generated
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.card_id
     *
     * @param cardId the value for cms_refill_card.card_id
     *
     * @mbg.generated
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.card_pwd
     *
     * @return the value of cms_refill_card.card_pwd
     *
     * @mbg.generated
     */
    public String getCardPwd() {
        return cardPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.card_pwd
     *
     * @param cardPwd the value for cms_refill_card.card_pwd
     *
     * @mbg.generated
     */
    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.card_money
     *
     * @return the value of cms_refill_card.card_money
     *
     * @mbg.generated
     */
    public Float getCardMoney() {
        return cardMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.card_money
     *
     * @param cardMoney the value for cms_refill_card.card_money
     *
     * @mbg.generated
     */
    public void setCardMoney(Float cardMoney) {
        this.cardMoney = cardMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.card_status
     *
     * @return the value of cms_refill_card.card_status
     *
     * @mbg.generated
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.card_status
     *
     * @param cardStatus the value for cms_refill_card.card_status
     *
     * @mbg.generated
     */
    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.use_time
     *
     * @return the value of cms_refill_card.use_time
     *
     * @mbg.generated
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.use_time
     *
     * @param useTime the value for cms_refill_card.use_time
     *
     * @mbg.generated
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_refill_card.use_rid
     *
     * @return the value of cms_refill_card.use_rid
     *
     * @mbg.generated
     */
    public Integer getUseRid() {
        return useRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_refill_card.use_rid
     *
     * @param useRid the value for cms_refill_card.use_rid
     *
     * @mbg.generated
     */
    public void setUseRid(Integer useRid) {
        this.useRid = useRid;
    }
}