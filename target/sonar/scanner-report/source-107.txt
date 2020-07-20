/**  
 * @Title: ScoreSvcImpl.java
 * @Package com.cms.svc.impl
 * @author 田锐
 * @date 2020年7月6日
 * @version V1.0  
 */
package com.cms.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.CmsCustomerScoreMapper;
import com.cms.pojo.CmsCustomerScore;
import com.cms.svc.ScoreSvc;

/**
 * @ClassName: ScoreSvcImpl
 * @Description: 积分计划功能中，积分查询与积分商城相关的业务实现类。
 * @author 田锐
 * @date 2020年7月6日
 * @since JDK 1.8
 */
@Service
public class ScoreSvcImpl implements ScoreSvc {

	/**
	 * logger对象
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 客户积分表的mapper层对象，用于对该表的增删改查操作
	 */
	@Autowired
	private CmsCustomerScoreMapper cmsCustomerScoreMpper;

	/*
	 * (非 Javadoc)
	 * 
	 * 
	 * @param phone
	 * 
	 * @return
	 * 
	 * @see com.cms.svc.ScoreSvc#getScores(java.lang.String)
	 */
	@Override
	public List<Map<String, Float>> getScores(String phone) {
		
		// 记录查询的号码
		logger.info("phone=" + phone);

		// 从积分表中查询出所有未过期的，该手机号客户的积分数据
		List<CmsCustomerScore> scoreObjList = cmsCustomerScoreMpper.listCustomerScores(phone);
		
		// 新建一个list，它用于本方法的最终返回值
		List<Map<String, Float>> scoreList = new ArrayList<>();
		
		// 对scoreObjList中的每个对象循环一次，把积分类型和积分余额提取出来放入scoreList中
		for (CmsCustomerScore ccs : scoreObjList) {
			
			Map<String, Float> scoreMap = new HashMap<>(2);
			
			// key=积分类型type,value=积分余额
			scoreMap.put(ccs.getScoreType(), ccs.getBalance());
			scoreList.add(scoreMap);
		}

		// 记录查询的结果
		logger.info("scoreList{}", scoreList);

		return scoreList;
	}

}
