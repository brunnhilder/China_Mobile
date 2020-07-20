package com.cms.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：王宇
 * 创建时间：2020/7/8 0008 18:31
 * 描述：时间工具类
 */
public class DateUtils {
    /**
     * 把string类型的时间转化成date类型
     * @param date 传入的string类型时间
     * @return
     */
    public static Date StringTranDateYMD(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
             date1 = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }

    /**
     * 把date类型的时间转化成string类型
     * @param date
     * @return
     */
    public static String DateYMDTranString(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(date);
        return format;
    }

    /**
     * 把字符串的年 月 时间转换成当月时间
     * 例如year：2020 month:7
     * 转化成:
     * 起始时间:2020-7-01
     * 结束时间:2020-8-01
     * @param year
     * @param month
     * @return
     */
    public static YearAndMonthTran getStartTimeAndEndTime(String year,String month){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuilder startTime = new StringBuilder();
        StringBuilder endTime = new StringBuilder();
        // 1.开始时间拼接
        startTime = startTime.append(year).append("-").append(month).append("-").append("01 ").append("00:00:00");
        System.out.println(startTime);
        // 2.结束时间拼接
        // 2.1如果结束时间等于12月
        if (month.equals("12")){
            endTime = endTime.append(String.valueOf(Integer.valueOf(year)+1)).append("-").append("1").append("-").append("01 ").append("00:00:00");
            System.out.println(endTime);
        }else {
            // 结束时间不等于12月
            endTime = endTime.append(year).append("-").append(String.valueOf(Integer.valueOf(month)+1)).append("-").append("01 ").append("00:00:00");
            System.out.println("endtime"+endTime);
        }
        Date startTime1 = null;
        Date endtTime1 = null;
        try {
             startTime1 = dateFormat.parse(startTime.toString());
             endtTime1 = dateFormat.parse(endTime.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new YearAndMonthTran(startTime1,endtTime1);
    }

    /**
     * 把date类型的时间转化成标准的时间类型
     * @param date
     * @return
     */
    public static String dateTranDateStandard(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = dateFormat.format(date);
        Date standDate = null;
        try {
             standDate = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return s;
    }


}
