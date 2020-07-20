package com.cms.svc.impl;

import com.cms.mapper.CmsCustomerInfoMapper;
import com.cms.pojo.CmsCustomerInfo;
import com.cms.svc.CmsCustomerInfoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 作者：王宇
 * 创建时间：2020/7/12 0012 15:05
 * 描述：客户信息servcie
 */
@Service
public class CmsCustomerInfoSvcImpl implements CmsCustomerInfoSvc {

    @Autowired
    private CmsCustomerInfoMapper cmsCustomerInfoMapper;

    @Override
    public CmsCustomerInfo findById(Integer id) {
        if (!StringUtils.isEmpty(id))
            return cmsCustomerInfoMapper.selectByPrimaryKey(id);
        else
            return null;
    }
}
