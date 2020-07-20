/**  
 * @Title: UserSvcImpl.java
 * @Package com.cms.svc.impl
 * @author 陈超
 * @date 2020年6月29日
 * @version V1.0  
 */
package com.cms.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.cms.mapper.CmsCustomerAuthMapper;
import com.cms.mapper.CmsCustomerCostMapper;
import com.cms.mapper.CmsCustomerScoreMapper;
import com.cms.mapper.CmsScoreWeightMapper;
import com.cms.pojo.CmsCustomerAuth;
import com.cms.pojo.CmsCustomerCost;
import com.cms.pojo.CmsCustomerScore;
import com.cms.pojo.CmsScoreWeight;
import com.cms.svc.ChangepwdSvc;
import com.cms.svc.CustomerdeductbalanceSvc;


/**
 * @ClassName: UserSvcImpl
 * @Description: 用户操作实现类
 * @author 陈超
 * @date 2020年6月29日
 * @since JDK 1.8
 */
@Service
public class CustomerdeductbalanceSvcImpl implements CustomerdeductbalanceSvc {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CmsCustomerCostMapper customerCostMapper;
	@Autowired
	private CmsCustomerAuthMapper customerAuthMapper;
	@Autowired
	private CmsCustomerScoreMapper cmsCustomerScoreMpper;


	// @Rollback(false)
	@Scheduled(cron="0 0 1 1 * ?")
	//@Scheduled(cron = "*/5 * * * * ?")
	private void updatedeductbalance() {
		System.out.println("11111111111111111111111111111111111111111111111");
		// 查询用户的状态存到用户表实体中
		List<CmsCustomerAuth> Versionresult = customerAuthMapper.selectBycmsVersion();
		Iterator<CmsCustomerAuth> Versioniter = Versionresult.iterator();
		CmsCustomerAuth cmsCustomerAuth = null;
		while (Versioniter.hasNext()) {
			cmsCustomerAuth = Versioniter.next();
		}
		// 查询用户的积分存到积分表实体中
		List<CmsCustomerScore> Balanceresult = cmsCustomerScoreMpper.selectBybalance();
		Iterator<CmsCustomerScore> Balanceiter = Balanceresult.iterator();
		CmsCustomerScore cmsCustomerScore = null;
		while (Balanceiter.hasNext()) {
			cmsCustomerScore = Balanceiter.next();
		}
		// 查询用户的余额存到用户表实体中
		List<CmsCustomerCost> result = customerCostMapper.selectBybalance();
		Iterator<CmsCustomerCost> iter = result.iterator();
		CmsCustomerCost cmsCustomerCost = null;
		while (iter.hasNext()) {
			cmsCustomerCost = iter.next();
			    // 用户表实体调用用户的状态0代表正常，每月扣除套餐费并兑换成相对应的积分
			if (cmsCustomerAuth.getDeleteSign().equals("0")) {
				// 用户在透支其对应的套餐额度前，正常兑换积分，用户状态不变，正常扣费
				if (cmsCustomerCost.getBalance() >= -cmsCustomerCost.getCmsPlan().getPlanMoney()) {
					cmsCustomerCost.setBalance(cmsCustomerCost.getBalance() - cmsCustomerCost.getCmsPlan().getPlanMoney());
					//System.out.println("用户的状态" + cmsCustomerAuth.getCreator());
					//System.out.println("用户的余额" + cmsCustomerCost.getBalance());
					opertor(cmsCustomerCost);
					//每月扣除的套餐费用1：1比例兑换积分
					cmsCustomerScore.setBalance(cmsCustomerScore.getBalance() + cmsCustomerCost.getCmsPlan().getPlanMoney());
					cmsCustomerScoreMpper.updateByPrimaryKey(cmsCustomerScore);
					//System.out.println("用户的积分" + cmsCustomerScore.getBalance());
				}
				// 用户在透支其对应的套餐额度后，不会兑换积分，用户状态变为停机，正常扣费
				if (cmsCustomerCost.getBalance() < -cmsCustomerCost.getCmsPlan().getPlanMoney()) {
					cmsCustomerCost.setBalance(cmsCustomerCost.getBalance() - cmsCustomerCost.getCmsPlan().getPlanMoney());
					cmsCustomerAuth.setDeleteSign("1");
					customerAuthMapper.updateByPrimaryKey(cmsCustomerAuth);
					//System.out.println("用户的状态" + cmsCustomerAuth.getCreator());
					//System.out.println("用户的余额" + cmsCustomerCost.getBalance());
					opertor(cmsCustomerCost);
				}

			}
			   // 用户表实体调用用户的状态1代表停机，每月扣除套餐费且不会兑换成相对应的积分
			if (cmsCustomerAuth.getDeleteSign().equals("1")) {
				cmsCustomerCost.setBalance(cmsCustomerCost.getBalance() - cmsCustomerCost.getCmsPlan().getPlanMoney());
				//System.out.println("用户的状态" + cmsCustomerAuth.getCreator());
				//System.out.println("用户的余额" + cmsCustomerCost.getBalance());
				opertor(cmsCustomerCost);
			}
		}
	}

	// @Transational(rollbackFor = Exception.class)
	private void opertor(CmsCustomerCost cmsCustomerCost) {
		try {
			customerCostMapper.updateByPrimaryKey(cmsCustomerCost);
		} catch (Exception c) {
			c.printStackTrace();
			logger.info("更新失败{}" + cmsCustomerCost);
			//System.out.println("失败" + cmsCustomerCost);
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
	}

}
