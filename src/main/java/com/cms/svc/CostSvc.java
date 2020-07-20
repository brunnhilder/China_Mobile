package com.cms.svc;

import com.cms.dto.CostDTO;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2020/7/10 0010 19:49
 * 描述：消费查svc接口
 */
public interface CostSvc {
    /**
     * 月账单查询(根据手机号和年月查询)
     * @param year 哪年
     * @param month 哪月
     * @return 月账单详情list
     */
    public List<CostDTO> findMonthBill(String phone,String year,String month);
}
