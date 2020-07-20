package com.cms.utils;
import java.io.UnsupportedEncodingException;
/**
 * 作者：王宇
 * 创建时间：2020/7/11 0011 18:17
 * 描述：编码之间相互转换
 */

public class ConvertEncodingFormat {

    /**
     * 将一段错误解码的字符串重新解码
     * @param str 要解决的字符串
     * @param formatFrom 本身编码
     * @param FormatTo 要转化成的编码
     * @return
     */
    public static String convertEncodingFormat(String str, String formatFrom, String FormatTo) {
        String result = null;
        if (!(str == null || str.length() == 0)) {
            try {
                result = new String(str.getBytes(formatFrom), FormatTo);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}