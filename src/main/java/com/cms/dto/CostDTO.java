package com.cms.dto;

/**
 * 作者：王宇
 * 创建时间：2020/7/10 0010 19:54
 * 描述：账单费用dto
 */
public class CostDTO {
    /**
     * 消费名称
     */
    private String costName;


    /**
     * 套餐价格
     */
    private Float price;

    /**
     * 消费名称介绍
     */
    private String introduction;

    /**
     * 减免多少钱
     */
    private Float reduceMoney;

    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getReduceMoney() {
        return reduceMoney;
    }

    public void setReduceMoney(Float reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
