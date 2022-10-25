package com.ibsplc.notificationhub.vo;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.ibsplc.notificationhub.vo.ChannelInfoResponseVO
 */


import com.fasterxml.jackson.annotation.JsonIgnore;

public class ChannelInfoResponseVO {
    private String channelType;
    private boolean success;
    private String referenceId;
    private String errorInfo;
    @JsonIgnore
    private int id;

    public String toString() {
        return "ChannelInfoResponseVO [channelType=" + this.channelType + ", success=" + this.success + ", referenceId=" + this.referenceId + ", errorInfo=" + this.errorInfo + "]";
    }
    public String getChannelType() {
        return this.channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReferenceId() {
        return this.referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getErrorInfo() {
        return this.errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    } 
   

}

