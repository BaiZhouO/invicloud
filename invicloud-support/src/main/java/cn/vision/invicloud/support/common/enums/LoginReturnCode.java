package cn.vision.invicloud.support.common.enums;


import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Map;

/**
 * @Author: Hattori
 * @Date: 2018/7/4 4:31
 * @Description:
 */
public enum LoginReturnCode implements Serializable {
    USER_NOT_EXIST(10000, "该账号不存在!"),
    WRONG_PASSWORD(10001, "您输入的密码不正确!"),
    REGISTER_CODE_ERROR(10002, "验证码错误!"),
    USER_LOCK(10003, "该账号已被冻结!");

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    private LoginReturnCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        JSONObject object = new JSONObject();
        object.put("code",code);
        object.put("message",message);
        System.out.println(object.toString());
        return object.toString();
    }

}