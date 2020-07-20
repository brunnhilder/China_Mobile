package com.cms.action;

import com.cms.dto.NoteInfoDTO;
import com.cms.msg.NoteMsg;
import com.cms.pojo.CmsNoteInfo;
import com.cms.svc.impl.NoteSVcImpl;
import com.cms.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：王宇
 * 创建时间：2020/7/7 0007 8:10
 * 描述：短信action
 */
@Controller
@RequestMapping("/note")
public class NoteInfoAction {

    @Autowired
    private NoteSVcImpl noteSVc;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("noteInfo");
        return view;
    }

    /**
     * 查询短信详单
     * @param id 发送人的id
     * @param startTime 起始时间
     * @param endTime 结束时间
     * @return
     */
    @GetMapping("/getnote")
    @ResponseBody
    public AjaxResult getNoteInfo(@RequestParam(value = "id") Integer id,
                                  @RequestParam(value = "startTime",required = false) String startTime,
                                  @RequestParam(value = "endTime",required = false) String endTime){

            List<NoteInfoDTO> cmsNoteInfoList = noteSVc.findByTimeAndFromId(id, startTime, endTime);
        return AjaxResult.success(NoteMsg.QUERY_SUCCESS,cmsNoteInfoList);
    }

}
