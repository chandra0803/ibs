/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.ChannelInfos
 */
package com.ibsplc.notificationhub.vo;

import java.util.List;
import java.util.Map;

public class ChannelInfos {
    private String channelType;
    private String templateID;
    private List<String> contactDetails;
    private Map<String, String> businessData;

    public String toString() {
        return "ChannelInfos [channelType=" + this.channelType + ", templateID=" + this.templateID + ", contactDetails=" + this.contactDetails + ", businessData=" + this.businessData + "]";
    }

    public String getChannelType() {
        return this.channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getTemplateID() {
        return this.templateID;
    }

    public void setTemplateID(String templateID) {
        this.templateID = templateID;
    }

    public List<String> getContactDetails() {
        return this.contactDetails;
    }

    public void setContactDetails(List<String> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Map<String, String> getBusinessData() {
        return this.businessData;
    }

    public void setBusinessData(Map<String, String> businessData) {
        this.businessData = businessData;
    }
}

