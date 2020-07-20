package com.cms.svc.impl;

import com.cms.BaseTests;
import com.cms.dto.CostDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 作者：王宇
 * 创建时间：2020/7/11 0011 8:01
 * 描述：
 */
public class CostSvcImplTest extends BaseTests {

    @Autowired
    private CostSvcImpl costSvc;
    @Test
    public void findMonthBill() {
        List<CostDTO> bill = costSvc.findMonthBill("18240119083", "2020", "6");
        System.out.println(1);
    }
}