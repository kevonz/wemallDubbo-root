package com.wemallDubbo.common;

import org.apache.commons.lang.StringUtils;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;

/**
 * Created by fengzy
 *
 */
public class Result<T> implements Serializable {
    private static final String SUCCESS="请求成功";
    private static final String FAILURE="请求失败";
    /**
     * 接口调用成功，不需要返回对象
     */
    public static <T> Result<T> newSuccess(){
        Result<T> result = new Result<T>();
        result.setMessage(SUCCESS);
        result.setResult(true);
        result.setCode(ResponceCode.SUCCESS);
        return result;
    }

    /**
     * 接口调用成功，有返回对象
     */
    public static <T> Result<T> newSuccess(T object) {
        Result<T> result = new Result<T>();
        result.setObject(object);
        result.setResult(true);
        result.setMessage(SUCCESS);
        result.setCode(ResponceCode.SUCCESS);
        return result;
    }
    /**
     * 接口调用成功，有返回对象
     */
    public static <T> Result<T> newSuccess(int code,T object) {
        Result<T> result = new Result<T>();
        result.setObject(object);
        result.setResult(true);
        result.setCode(code);
        result.setMessage(SUCCESS);
        return result;
    }

    /**
     * 接口调用失败，使用默认参数
     * code:-1
     * message:@app_failure
     */
    public static <T> Result<T> newFailure(){
        return newFailure(false,ResponceCode.EXCEPTION,FAILURE,null);
    }
    /**
     * 接口调用失败，自定义错误码
     */
    public static <T> Result<T> newFailure(int code){
        return newFailure(false,code,FAILURE,null);
    }
    /**
     * 接口调用失败，自定义错误提示信息
     */
    public static <T> Result<T> newFailure(String message){
        return newFailure(false,ResponceCode.EXCEPTION,message,null);
    }

    /**
     * 接口调用失败，有错误码和描述，没有返回对象
     */
    public static <T> Result<T> newFailure(int code, String message){
        return newFailure(false,code,message,null);
    }

    /**
     * 接口调用失败，有错误码和描述，没有返回对象
     */
    public static <T> Result<T> newFailure(Boolean result,int code, String message,Exception exception){
        if (StringUtils.isBlank(message)){
            message = FAILURE;
        }
        Result<T> resultInfo = new Result<T>();
        resultInfo.setCode(code!=0 ? code : -1);
        resultInfo.setMessage(message);
        resultInfo.setResult(result);
        return resultInfo;
    }
    /**
     * 转换或复制错误结果
     */
    public static <T> Result<T> newFailure(Result<?> failure){
        Result<T> result = new Result<T>();
        result.setCode(failure.getCode()!=0 ? failure.getCode() : -1);
        result.setResult(failure.getResult());
        result.setMessage(failure.getMessage());
        result.setException(failure.getException());
        return result;
    }

    /**
     * 接口调用失败，返回异常信息
     */
    public static <T> Result<T> newException(Exception e){
        Result<T> result = new Result<T>();
        result.setCode(-1);
        result.setException(e);
        result.setMessage(e.getMessage());
        return result;
    }

    /**
     * 默认是成功
     * convention over configuration
     */
    private int code;//默认为0没有业务意义 -1为失败 可以返回正数表示不同的接口业务
    private T object;//内部对象
    private Boolean result=true;//默认是成功
    private String message;//提示信息
    private Throwable exception;

    /** 判断返回结果是否成功 */
    public boolean success() {
        return code == 0;
    }
    /** 判断返回结果是否有结果对象 */
    public boolean hasObject() {
        return code==0 && object!=null;
    }
    /** 判断返回结果是否有异常 */
    public boolean hasException() {
        return exception != null;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public T getObject() {
        return object;
    }
    public void setObject(T object) {
        this.object = object;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Result");
        if(object!=null) result.append("<"+object.getClass().getSimpleName()+">");
        result.append(": {code="+code);
        if(object!=null) result.append(", object="+object);
        if(result!=null) result.append(", result="+result);
        if(message!=null) result.append(", message="+message);
        if(exception!=null) {
            StringWriter stringWriter = new StringWriter();
            exception.printStackTrace(new PrintWriter(stringWriter));
            result.append(", exception="+stringWriter.toString());
        }
        result.append(" }");
        return result.toString();
    }
}

