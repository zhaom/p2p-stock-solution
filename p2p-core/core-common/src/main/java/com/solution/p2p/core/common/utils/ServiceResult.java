package com.solution.p2p.core.common.utils;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-3
 * Time: 下午3:33
 * To change this template use File | Settings | File Templates.
 */
public class ServiceResult<E> implements Serializable{

    private boolean isSuccess;

    private int errorCode;

    private String errorMessage;

    private E value;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
