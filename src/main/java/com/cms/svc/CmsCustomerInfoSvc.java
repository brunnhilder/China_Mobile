package com.cms.svc;

import com.cms.pojo.CmsCustomerInfo;
import org.springframework.stereotype.Service;

/**
 * 作者：王宇
 * 创建时间：2020/7/12 0012 15:03
 * 描述：客户信息service
 */
@Service
public interface CmsCustomerInfoSvc {

    /**
     * 根据客户编号查询客户的详情信息
     * @param id 客户编号
     * @return 客户详情信息
     */
    public CmsCustomerInfo findById(Integer id);
}
