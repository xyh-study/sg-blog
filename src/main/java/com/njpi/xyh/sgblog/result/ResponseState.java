package com.njpi.xyh.sgblog.result;

/**
 * @author: xyh
 * @create: 2022/7/29 15:33
 */
public enum ResponseState {
    SUCCESS(20000, true, "操作成功"),
    REGISTER_SUCCESS(20003, true, "注册成功"),
    LOGIN_SUCCESS(20004,true ,"登录成功" ),
    FAILED(40000, false, "操作失败"),
    VALIDATE_FAILED(40001, false, "数据校验异常"),
    SYS_ERROR(40002, false, "系统繁忙,请稍后重试"),
    NOT_LOGIN(40006, false,"请先登录" ),
    PERMISSION_DENIED(40007, false, "权限不足"),
    USER_IS_EXIST(40008,false ,"用户已存在" );


    private Integer code;
    private String message;
    private Boolean success;

    ResponseState(Integer code, Boolean success, String message) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    ResponseState() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
