package com.cms.mapper;

import com.cms.BaseTests;
import com.cms.pojo.CmsPlan;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * 作者：王宇
 * 创建时间：2020/7/10 0010 21:44
 * 描述：套餐表mapper测试
 */
public class CmsPlanMapperTest extends BaseTests {

    @Autowired
    private CmsPlanMapper cmsPlanMapper;

    @Test
    public void selectByPrimaryKey() {
        CmsPlan plan = cmsPlanMapper.selectByPrimaryKey(11);
    }
}