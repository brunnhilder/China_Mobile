package com.cms.utils;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

/**
 * 作者：王宇
 * 创建时间：2020/4/6 0006 20:30
 * 描述：返回给前台的包装数据
 */
public class AjaxResult extends HashMap<String,Object> {
    /**
     * 状态码
     */
    public static final String CODE_TAG = "code";

    /**
     * 返回内容
     */
    public static final String MSG_TAG = "msg";

    /**
     * 数据对象
     */
    public static final String dataInfo_TAG = "dataInfo";

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult() {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     */
    public AjaxResult(int code, String msg) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param dataInfo 数据对象
     */
    public AjaxResult(HttpStatus code, String msg, Object dataInfo) {
        super.put(CODE_TAG, code.value());
        super.put(MSG_TAG, msg);
        if (dataInfo!=null) {
            super.put(dataInfo_TAG, dataInfo);
        }
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static AjaxResult success() {
        return AjaxResult.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static AjaxResult success(Object dataInfo) {
        return AjaxResult.success("操作成功", dataInfo);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static AjaxResult success(String msg) {
        return AjaxResult.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param dataInfo 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(String msg, Object dataInfo) {
        return new AjaxResult(HttpStatus.OK, msg, dataInfo);
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static AjaxResult error() {
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static AjaxResult error(String msg) {
        return AjaxResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param dataInfo 数据对象
     * @return 警告消息
     */
    public static AjaxResult error(String msg, Object dataInfo) {
        return new AjaxResult(HttpStatus.INTERNAL_SERVER_ERROR, msg, dataInfo);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 警告消息
     */
    public static AjaxResult error(HttpStatus code, String msg) {
        return new AjaxResult(code, msg, null);
    }
}
