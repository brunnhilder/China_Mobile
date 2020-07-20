package com.cms.svc;

import com.cms.pojo.CmsNoteInfo;

import java.util.List;
import com.cms.dto.NoteInfoDTO;
/**
 * 作者：王宇
 * 创建时间：2020/7/8 0008 18:01
 * 描述：短信相关的service层
 */
public interface NoteSVc {

    /**
     * 按条件查找短信详单
     * @param fromId 发送方id
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    List<NoteInfoDTO> findByTimeAndFromId(int fromId,String startTime,String endTime);

}
