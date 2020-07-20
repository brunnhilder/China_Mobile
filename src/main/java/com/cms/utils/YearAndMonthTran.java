package com.cms.utils;

import java.util.Date;

/**
 * 作者：王宇
 * 创建时间：2020/7/11 0011 8:21
 * 描述：年月转换成开始时间，结束时间实体类
 */
public class YearAndMonthTran {

    private Date startTime;

    private Date endTime;

    public YearAndMonthTran(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
