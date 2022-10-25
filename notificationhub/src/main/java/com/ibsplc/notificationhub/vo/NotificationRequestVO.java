package com.ibsplc.notificationhub.vo;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.ChannelInfos
 *  com.ibsplc.notificationhub.vo.NotificationRequestVO
 *  org.springframework.stereotype.Component
 */


import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class NotificationRequestVO {
    private String companyCode;
    private String businessType;
    private String language;
    private List<ChannelInfos> channelInfos;

    public String toString() {
        return "NotificationRequestVO [companyCode=" + this.companyCode + ", businessType=" + this.businessType + ", language=" + this.language + ", channelInfos=" + this.channelInfos + "]";
    }

    public List<ChannelInfos> getChannelInfos() {
        return this.channelInfos;
    }

    public void setChannelInfos(List<ChannelInfos> channelInfos) {
        this.channelInfos = channelInfos;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

