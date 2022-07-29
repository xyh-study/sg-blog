package com.njpi.xyh.sgblog.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

/**
 * @author: xyh
 * @create: 2022/7/29 15:31
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL) // 只会返回不为空的字段
public class ResponseResult {
    private Boolean success;
    private Integer code;
    private String message;
    private Object data;


    public ResponseResult(Boolean success, Integer code, String message, Object data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseResult(ResponseState responseState) {
        this.success = responseState.getSuccess();
        this.code = responseState.getCode();
        this.message = responseState.getMessage();
        this.data = null;
    }

    public ResponseResult(ResponseState responseState,Object data) {
        this.success = responseState.getSuccess();
        this.code = responseState.getCode();
        this.message = responseState.getMessage();
        this.data = data;
    }




    public static ResponseResult success() {
        return new ResponseResult(ResponseState.SUCCESS);
    }

    public static ResponseResult success(Object data) {
        ResponseResult responseResult = new ResponseResult(ResponseState.SUCCESS);
        responseResult.setData(data);
        return responseResult;
    }


    public static ResponseResult failed() {
        return new ResponseResult(ResponseState.FAILED);
    }

    public static ResponseResult failed(Object data) {
        ResponseResult responseResult = new ResponseResult(ResponseState.FAILED);
        responseResult.setData(data);
        return responseResult;
    }


    public static ResponseResult failed(String message) {
        ResponseResult responseResult = new ResponseResult(ResponseState.FAILED);
        responseResult.setMessage(message);
        return responseResult;
    }

}