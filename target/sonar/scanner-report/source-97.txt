package com.cms.svc.impl;

import com.cms.dto.CostDTO;
import com.cms.mapper.CmsCustomerAuthMapper;
import com.cms.mapper.CmsNoteInfoMapper;
import com.cms.pojo.CmsCustomerAuth;
import com.cms.pojo.CmsNoteInfo;
import com.cms.svc.NoteSVc;
import com.cms.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.cms.dto.NoteInfoDTO;

/**
 * 作者：王宇
 * 创建时间：2020/7/8 0008 18:07
 * 描述：短信业务类的实现
 */
@Service
public class NoteSVcImpl implements NoteSVc {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CmsNoteInfoMapper noteInfoMapper;

    @Autowired
    private CmsCustomerAuthMapper cmsCustomerAuthMapper;

    @Override
    public List<NoteInfoDTO> findByTimeAndFromId(int fromId, String startTime, String endTime) {
        List<CmsNoteInfo> cmsNoteInfos = null;
        // 判断时间是否为空值
        if (StringUtils.isEmpty(startTime) && StringUtils.isEmpty(endTime)) { //全为空的时候，查询全部
            cmsNoteInfos = noteInfoMapper.findByFromId(fromId);
        } else {
            Date dateStartTime = DateUtils.StringTranDateYMD(startTime);
            Date dateEndTime = DateUtils.StringTranDateYMD(endTime);
            cmsNoteInfos = noteInfoMapper.findByFromIdAndTime(fromId, dateStartTime, dateEndTime);
        }
//        把查询出来的短信详单放入dto中重新封装
        ArrayList<NoteInfoDTO> noteInfoDTOS = new ArrayList<NoteInfoDTO>();
        for (CmsNoteInfo noteInfo : cmsNoteInfos) {
            NoteInfoDTO noteInfoDTO = new NoteInfoDTO();
            // 查询短信发送给谁
            CmsCustomerAuth auth = cmsCustomerAuthMapper.selectByPrimaryKey(noteInfo.getToId());
            if (!StringUtils.isEmpty(auth))
                noteInfoDTO.setPhoneNum(auth.getPhoneNum());
            BeanUtils.copyProperties(noteInfo, noteInfoDTO);
            noteInfoDTO.setToTime(DateUtils.dateTranDateStandard(noteInfo.getToTime()));
            noteInfoDTO.setFromTime(DateUtils.dateTranDateStandard(noteInfo.getFromTime()));
            noteInfoDTOS.add(noteInfoDTO);
        }

        return noteInfoDTOS;
    }
}
