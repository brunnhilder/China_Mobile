package com.cms.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_plan
 */
public class CmsPlan implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.cms_plan_id
     *
     * @mbg.generated
     */
    private Integer cmsPlanId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.cms_plan_rid
     *
     * @mbg.generated
     */
    private Integer cmsPlanRid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.plan_version
     *
     * @mbg.generated
     */
    private Integer planVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.plan_name
     *
     * @mbg.generated
     */
    private String planName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.plan_info
     *
     * @mbg.generated
     */
    private String planInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.plan_money
     *
     * @mbg.generated
     */
    private Float planMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.call_duration
     *
     * @mbg.generated
     */
    private Integer callDuration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.msg_number
     *
     * @mbg.generated
     */
    private Integer msgNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.nationwide_flow
     *
     * @mbg.generated
     */
    private Integer nationwideFlow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.province_flow
     *
     * @mbg.generated
     */
    private Integer provinceFlow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.cms_cp_creator
     *
     * @mbg.generated
     */
    private Integer cmsCpCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.cms_cp_updator
     *
     * @mbg.generated
     */
    private Integer cmsCpUpdator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.cms_cp_creat_time
     *
     * @mbg.generated
     */
    private Date cmsCpCreatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.cms_cp_update_time
     *
     * @mbg.generated
     */
    private Date cmsCpUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_plan.delete_sign
     *
     * @mbg.generated
     */
    private String deleteSign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_plan
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.cms_plan_id
     *
     * @return the value of cms_plan.cms_plan_id
     *
     * @mbg.generated
     */
    public Integer getCmsPlanId() {
        return cmsPlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.cms_plan_id
     *
     * @param cmsPlanId the value for cms_plan.cms_plan_id
     *
     * @mbg.generated
     */
    public void setCmsPlanId(Integer cmsPlanId) {
        this.cmsPlanId = cmsPlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.cms_plan_rid
     *
     * @return the value of cms_plan.cms_plan_rid
     *
     * @mbg.generated
     */
    public Integer getCmsPlanRid() {
        return cmsPlanRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.cms_plan_rid
     *
     * @param cmsPlanRid the value for cms_plan.cms_plan_rid
     *
     * @mbg.generated
     */
    public void setCmsPlanRid(Integer cmsPlanRid) {
        this.cmsPlanRid = cmsPlanRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.plan_version
     *
     * @return the value of cms_plan.plan_version
     *
     * @mbg.generated
     */
    public Integer getPlanVersion() {
        return planVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.plan_version
     *
     * @param planVersion the value for cms_plan.plan_version
     *
     * @mbg.generated
     */
    public void setPlanVersion(Integer planVersion) {
        this.planVersion = planVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.plan_name
     *
     * @return the value of cms_plan.plan_name
     *
     * @mbg.generated
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.plan_name
     *
     * @param planName the value for cms_plan.plan_name
     *
     * @mbg.generated
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.plan_info
     *
     * @return the value of cms_plan.plan_info
     *
     * @mbg.generated
     */
    public String getPlanInfo() {
        return planInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.plan_info
     *
     * @param planInfo the value for cms_plan.plan_info
     *
     * @mbg.generated
     */
    public void setPlanInfo(String planInfo) {
        this.planInfo = planInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.plan_money
     *
     * @return the value of cms_plan.plan_money
     *
     * @mbg.generated
     */
    public Float getPlanMoney() {
        return planMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.plan_money
     *
     * @param planMoney the value for cms_plan.plan_money
     *
     * @mbg.generated
     */
    public void setPlanMoney(Float planMoney) {
        this.planMoney = planMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.call_duration
     *
     * @return the value of cms_plan.call_duration
     *
     * @mbg.generated
     */
    public Integer getCallDuration() {
        return callDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.call_duration
     *
     * @param callDuration the value for cms_plan.call_duration
     *
     * @mbg.generated
     */
    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.msg_number
     *
     * @return the value of cms_plan.msg_number
     *
     * @mbg.generated
     */
    public Integer getMsgNumber() {
        return msgNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.msg_number
     *
     * @param msgNumber the value for cms_plan.msg_number
     *
     * @mbg.generated
     */
    public void setMsgNumber(Integer msgNumber) {
        this.msgNumber = msgNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.nationwide_flow
     *
     * @return the value of cms_plan.nationwide_flow
     *
     * @mbg.generated
     */
    public Integer getNationwideFlow() {
        return nationwideFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.nationwide_flow
     *
     * @param nationwideFlow the value for cms_plan.nationwide_flow
     *
     * @mbg.generated
     */
    public void setNationwideFlow(Integer nationwideFlow) {
        this.nationwideFlow = nationwideFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.province_flow
     *
     * @return the value of cms_plan.province_flow
     *
     * @mbg.generated
     */
    public Integer getProvinceFlow() {
        return provinceFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.province_flow
     *
     * @param provinceFlow the value for cms_plan.province_flow
     *
     * @mbg.generated
     */
    public void setProvinceFlow(Integer provinceFlow) {
        this.provinceFlow = provinceFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.version
     *
     * @return the value of cms_plan.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.version
     *
     * @param version the value for cms_plan.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.cms_cp_creator
     *
     * @return the value of cms_plan.cms_cp_creator
     *
     * @mbg.generated
     */
    public Integer getCmsCpCreator() {
        return cmsCpCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.cms_cp_creator
     *
     * @param cmsCpCreator the value for cms_plan.cms_cp_creator
     *
     * @mbg.generated
     */
    public void setCmsCpCreator(Integer cmsCpCreator) {
        this.cmsCpCreator = cmsCpCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.cms_cp_updator
     *
     * @return the value of cms_plan.cms_cp_updator
     *
     * @mbg.generated
     */
    public Integer getCmsCpUpdator() {
        return cmsCpUpdator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.cms_cp_updator
     *
     * @param cmsCpUpdator the value for cms_plan.cms_cp_updator
     *
     * @mbg.generated
     */
    public void setCmsCpUpdator(Integer cmsCpUpdator) {
        this.cmsCpUpdator = cmsCpUpdator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.cms_cp_creat_time
     *
     * @return the value of cms_plan.cms_cp_creat_time
     *
     * @mbg.generated
     */
    public Date getCmsCpCreatTime() {
        return cmsCpCreatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.cms_cp_creat_time
     *
     * @param cmsCpCreatTime the value for cms_plan.cms_cp_creat_time
     *
     * @mbg.generated
     */
    public void setCmsCpCreatTime(Date cmsCpCreatTime) {
        this.cmsCpCreatTime = cmsCpCreatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.cms_cp_update_time
     *
     * @return the value of cms_plan.cms_cp_update_time
     *
     * @mbg.generated
     */
    public Date getCmsCpUpdateTime() {
        return cmsCpUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.cms_cp_update_time
     *
     * @param cmsCpUpdateTime the value for cms_plan.cms_cp_update_time
     *
     * @mbg.generated
     */
    public void setCmsCpUpdateTime(Date cmsCpUpdateTime) {
        this.cmsCpUpdateTime = cmsCpUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_plan.delete_sign
     *
     * @return the value of cms_plan.delete_sign
     *
     * @mbg.generated
     */
    public String getDeleteSign() {
        return deleteSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_plan.delete_sign
     *
     * @param deleteSign the value for cms_plan.delete_sign
     *
     * @mbg.generated
     */
    public void setDeleteSign(String deleteSign) {
        this.deleteSign = deleteSign;
    }
}