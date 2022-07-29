package com.njpi.xyh.sgblog.handler;

import com.njpi.xyh.sgblog.result.ResponseResult;
import com.njpi.xyh.sgblog.result.ResponseState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 全局异常处理
 * @author: xyh
 * @create: 2022/7/29 15:37
 */

@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {


    /**
     * 全局异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseResult Exception(Exception e) {
        log.error(e.getMessage());
        return new ResponseResult(ResponseState.SYS_ERROR);
    }


    /**
     * 全局数据校验异常 (类中的异常)
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseResult MethodArgumentNotValidException(MethodArgumentNotValidException e) {
        List<FieldError> fieldErrors = e.getFieldErrors();
        List<String> collect = fieldErrors.stream().map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());
        return new ResponseResult(ResponseState.VALIDATE_FAILED,collect);
    }

    /**
     * 校验参数方法中的异常
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseResult ConstraintViolationException(ConstraintViolationException e) {
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        List<String> collect = constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
        return new ResponseResult(ResponseState.VALIDATE_FAILED,collect);
    }

}
