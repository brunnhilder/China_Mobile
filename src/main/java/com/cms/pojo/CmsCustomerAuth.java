package com.cms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_customer_auth
 */
public class CmsCustomerAuth implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.cms_auth_id
     *
     * @mbg.generated
     */
    private Integer cmsAuthId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.cms_auth_rid
     *
     * @mbg.generated
     */
    private Integer cmsAuthRid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.phone_num
     *
     * @mbg.generated
     */
    private String phoneNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.creator
     *
     * @mbg.generated
     */
    private Integer creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.updator
     *
     * @mbg.generated
     */
    private Integer updator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   0??????
     *               1?????
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_customer_auth.delete_sign
     *
     * @mbg.generated
     */
    private String deleteSign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_customer_auth
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.cms_auth_id
     *
     * @return the value of cms_customer_auth.cms_auth_id
     *
     * @mbg.generated
     */
    public Integer getCmsAuthId() {
        return cmsAuthId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.cms_auth_id
     *
     * @param cmsAuthId the value for cms_customer_auth.cms_auth_id
     *
     * @mbg.generated
     */
    public void setCmsAuthId(Integer cmsAuthId) {
        this.cmsAuthId = cmsAuthId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.cms_auth_rid
     *
     * @return the value of cms_customer_auth.cms_auth_rid
     *
     * @mbg.generated
     */
    public Integer getCmsAuthRid() {
        return cmsAuthRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.cms_auth_rid
     *
     * @param cmsAuthRid the value for cms_customer_auth.cms_auth_rid
     *
     * @mbg.generated
     */
    public void setCmsAuthRid(Integer cmsAuthRid) {
        this.cmsAuthRid = cmsAuthRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.phone_num
     *
     * @return the value of cms_customer_auth.phone_num
     *
     * @mbg.generated
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.phone_num
     *
     * @param phoneNum the value for cms_customer_auth.phone_num
     *
     * @mbg.generated
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.password
     *
     * @return the value of cms_customer_auth.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.password
     *
     * @param password the value for cms_customer_auth.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.version
     *
     * @return the value of cms_customer_auth.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.version
     *
     * @param version the value for cms_customer_auth.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.creator
     *
     * @return the value of cms_customer_auth.creator
     *
     * @mbg.generated
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.creator
     *
     * @param creator the value for cms_customer_auth.creator
     *
     * @mbg.generated
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.updator
     *
     * @return the value of cms_customer_auth.updator
     *
     * @mbg.generated
     */
    public Integer getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.updator
     *
     * @param updator the value for cms_customer_auth.updator
     *
     * @mbg.generated
     */
    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.create_time
     *
     * @return the value of cms_customer_auth.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.create_time
     *
     * @param createTime the value for cms_customer_auth.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.update_time
     *
     * @return the value of cms_customer_auth.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.update_time
     *
     * @param updateTime the value for cms_customer_auth.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_customer_auth.delete_sign
     *
     * @return the value of cms_customer_auth.delete_sign
     *
     * @mbg.generated
     */
    public String getDeleteSign() {
        return deleteSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_customer_auth.delete_sign
     *
     * @param deleteSign the value for cms_customer_auth.delete_sign
     *
     * @mbg.generated
     */
    public void setDeleteSign(String deleteSign) {
        this.deleteSign = deleteSign;
    }
}