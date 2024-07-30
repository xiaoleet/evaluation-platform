package com.dmx.evaluationplatform.dto;

import com.dmx.evaluationplatform.config.Constant;

public class Response<T> {
    private Constant.STATUS status;
    private String message;
    private T data;
    public Response(Constant.STATUS status,String message,T data){
        this.status = status;
        this.message = message;
        this.data = data;
    }
    public Response(){

    }

    public Constant.STATUS getStatus() {
        return status;
    }

    public void setStatus(Constant.STATUS status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
