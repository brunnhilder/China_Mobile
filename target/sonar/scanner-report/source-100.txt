/**  
 * @Title: PhoneChargeSvcImpl.java
 * @Package com.cms.svc.impl
 * @author 田锐
 * @date 2020年7月7日
 * @version V1.0  
 */
package com.cms.svc.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cms.mapper.CmsCustomerCostMapper;
import com.cms.mapper.CmsRefillCardMapper;
import com.cms.msg.PayChargeMsg;
import com.cms.pojo.CmsCustomerCost;
import com.cms.pojo.CmsRefillCard;
import com.cms.svc.PhoneChargeSvc;

/**
 * @ClassName: PhoneChargeSvcImpl
 * @Description: 客户手机话费功能的业务层接口的实现类
 * @author 田锐
 * @date 2020年7月7日
 * @since JDK 1.8
 */
@Service
public class PhoneChargeSvcImpl implements PhoneChargeSvc {

	/**
	 * logger对象
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 移动充值卡表的mapper类
	 */
	@Autowired
	private CmsRefillCardMapper cmsRefillCardMapper;

	/**
	 * 客户消费表的mapper类
	 */
	@Autowired
	private CmsCustomerCostMapper cmsCustomerCostMapper;

	/*
	 * (非 Javadoc)
	 * 
	 * 
	 * @param cardId
	 * 
	 * @param cardPwd
	 * 
	 * @param phone
	 * 
	 * @return
	 * 
	 * @see com.cms.svc.PhoneChargeSvc#payChargeByCard(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public int payChargeByCard(String cardId, String cardPwd, String phone) {

		// 查询客户消费信息
		CmsCustomerCost custCost = cmsCustomerCostMapper.getByPhone(phone);

		// 查询充值卡信息
		CmsRefillCard cardInfo = cmsRefillCardMapper.getByCardId(cardId);

		// 设置更新者和更新时间
		Date nowDate = new Date();
		custCost.setCmsCcUpdateTime(nowDate);
		custCost.setCmsCcUpdator(custCost.getCmsCcId());

		// 设置话费余额
		custCost.setBalance(custCost.getBalance() + cardInfo.getCardMoney());

		// 更新客户消费信息
		int cccNum = cmsCustomerCostMapper.editBalanceById(custCost);

		// 更新失败，返回提示
		if (cccNum < 1) {
			return PayChargeMsg.REFILL_EDIT_FAIL;
		}

		// 更新成功，继续业务
		
		// 设置充值卡为已使用
		cardInfo.setCardStatus(String.valueOf(PayChargeMsg.CARD_STATUS_USED));
		cardInfo.setUseTime(nowDate);
		cardInfo.setUseRid(custCost.getCmsCcId());

		// 更新充值卡信息
		int crcNum = cmsRefillCardMapper.editByCardId(cardInfo);

		// 更新失败，主动抛出异常，回滚
		if (crcNum < 1) {
			throw new RuntimeException("主动抛出异常，回滚");
		}
		
		// 充值成功
		return PayChargeMsg.REFILL_EDIT_SUCC;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * 
	 * @param cardId
	 * 
	 * @param cardPwd
	 * 
	 * @return
	 * 
	 * @see com.cms.svc.PhoneChargeSvc#checkRefillCard(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	@Transactional
	public int checkRefillCard(String cardId, String cardPwd) {

		logger.info("cardId=" + cardId + ",pwd=" + cardPwd);
		
		// 查询充值卡
		CmsRefillCard cardInfo = cmsRefillCardMapper.getByCardId(cardId);
		
		// 充值卡卡号不存在
		if (cardInfo == null) {
			return PayChargeMsg.CARD_NOT_EXIST;
		}

		// 密码错误
		if (!cardPwd.equals(cardInfo.getCardPwd())) {
			return PayChargeMsg.CARD_PWD_ERROR;
		}

		// 检查充值卡状态
		int cardStatus = Integer.valueOf(cardInfo.getCardStatus());

		// 充值卡已被使用
		if (cardStatus == PayChargeMsg.CARD_STATUS_USED) {
			return PayChargeMsg.CARD_STATUS_USED;
		}

		// 其它原因不可用
		if (cardStatus == PayChargeMsg.CARD_STATUS_INVALID) {
			return PayChargeMsg.CARD_STATUS_INVALID;
		}

		// 检查充值卡是否已过期
		if (new Date().after(cardInfo.getEndTime())) {
			return PayChargeMsg.CARD_END_TIME;
		}

		// 充值卡可用
		return PayChargeMsg.CARD_CHECK_SUCCESS;
	}

}
