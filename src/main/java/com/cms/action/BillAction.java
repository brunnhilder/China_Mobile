package com.cms.action;

import com.cms.dto.CostDTO;
import com.cms.msg.NoteMsg;
import com.cms.svc.impl.CostSvcImpl;
import com.cms.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2020/7/9 0009 17:09
 * 描述：账单action
 */
@Controller
@RequestMapping("/bill")
public class BillAction {

    @Autowired
    private CostSvcImpl costSvc;

    /**
     * 月账单首页部分
     * @return
     */
    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("bill/monthBill");
    }

    /**
     * 查询月账单
     * @param phone 手机号
     * @param year 年份
     * @param month 月份
     * @return
     */
    @GetMapping("/cost")
    @ResponseBody
    public AjaxResult monthBill(@RequestParam("phone") String phone,
                                @RequestParam("year") String year,
                                @RequestParam("month") String month){
        List<CostDTO> monthBill = costSvc.findMonthBill(phone, year, month);
        return AjaxResult.success(NoteMsg.QUERY_SUCCESS,monthBill);
    }
}
