package com.dmx.evaluationplatform.model.domain;

public class Result {
    String message;
    boolean isError;

    public Result (boolean isError,String message){
        this.isError = isError;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(Boolean error) {
        isError = error;
    }
}
