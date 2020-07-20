package com.cms.svc.impl;

import com.cms.dto.CostDTO;
import com.cms.mapper.CmsCustomerCostMapper;
import com.cms.mapper.CmsNoteInfoMapper;
import com.cms.mapper.CmsPlanMapper;
import com.cms.msg.CostMsg;
import com.cms.msg.NoteMsg;
import com.cms.pojo.CmsCustomerCost;
import com.cms.pojo.CmsNoteInfo;
import com.cms.pojo.CmsPlan;
import com.cms.svc.CostSvc;
import com.cms.utils.ConvertEncodingFormat;
import com.cms.utils.DateUtils;
import com.cms.utils.YearAndMonthTran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2020/7/11 0011 7:30
 * 描述：消费service
 */
@Service
public class CostSvcImpl implements CostSvc {
    @Autowired
    private CmsPlanMapper cmsPlanMapper;

    @Autowired
    private CmsCustomerCostMapper cmsCustomerCostMapper;

    @Autowired
    private CmsNoteInfoMapper cmsNoteInfoMapper;

    /**
     *月账单查询
     * @param phone
     * @param year 哪年
     * @param month 哪月
     * @return
     */
    @Override
    public List<CostDTO> findMonthBill(String phone,String year, String month) {
        // 总的免费短信条数
        Integer noteFreeCount = 0;
        // 总钱数
        float countMoney = 0;
        ArrayList<CostDTO> costDTOS = new ArrayList<>();
//        1. 查询套餐费用
        // 1.1查询客户消费表
        CmsCustomerCost cmsCustomerCost = cmsCustomerCostMapper.getByPhone(phone);
        // 1.2根据套餐编号查询套餐
        Integer planId = cmsCustomerCost.getCmsCcPlanId();
        // 如果有套餐
        if (!StringUtils.isEmpty(planId)){
            CostDTO costDTO = new CostDTO();
            CmsPlan cmsPlan = cmsPlanMapper.selectByPrimaryKey(planId);
            costDTO.setCostName(cmsPlan.getPlanName());
            costDTO.setPrice(cmsPlan.getPlanMoney());
            costDTO.setReduceMoney(CostMsg.REDUCE_MONEY);
            // 免费的短信条数
            noteFreeCount = cmsPlan.getMsgNumber();
            // 总计
            countMoney += cmsPlan.getPlanMoney();
            // 把查询出来的套餐放入list中
            costDTOS.add(costDTO);
        }
//        2.查询短信费用
        //2.1 把年和月转化成开始时间和结束时间
        YearAndMonthTran yearAndMonthTran = DateUtils.getStartTimeAndEndTime(year, month);
        //2.2根据电话号和时间查询短信的发送总条数
        Integer count = cmsNoteInfoMapper.findCountByPhoneAndTime(phone, yearAndMonthTran.getStartTime(), yearAndMonthTran.getEndTime());
        //2.3计算短信费用
        CostDTO note = new CostDTO();
        if (noteFreeCount.compareTo(count) >= 0) { // 免费的条数多于总数
            // 费用设为0
            note.setPrice((float) 0);
        } else {// 免费的短信条数用完了
            count = count - noteFreeCount;
            // 计算费用 todo 因为数据库中，没有每条短信的价格，所以写在了接口中
            float noteMoney = count* NoteMsg.NOTE_PRICE;
            // 计算总费用
            countMoney += noteMoney;
            note.setPrice(noteMoney);
        }
        // 出现了编码问题，转换一下
        note.setCostName(ConvertEncodingFormat.convertEncodingFormat(NoteMsg.NOTE_NAME,"GBK","UTF-8"));
        note.setReduceMoney((float) 0);
        // 把短信费用设置到月账单中
        costDTOS.add(note);

        //        把总计加daolist中
        CostDTO costDTO = new CostDTO();
        costDTO.setCostName(ConvertEncodingFormat.convertEncodingFormat(NoteMsg.COUNT_MONEY,"GBK","UTF-8"));
//        costDTO.setCostName(NoteMsg.COUNT_MONEY);
        costDTO.setPrice(countMoney);
        costDTO.setReduceMoney(0f);
        costDTOS.add(costDTO);

        // todo 通话费用没有算，数据库中没有相关通话费用字段，逻辑和短信费用差不多
        return costDTOS;

    }
}
