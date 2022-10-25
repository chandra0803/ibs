package com.ibsplc.notificationhub.vo;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.WhatsAppDirectApiTemplateVO
 *  com.ibsplc.notificationhub.vo.WhatsAppNotificationDirectRequestVO
 */



public class WhatsAppNotificationDirectRequestVO {
    private String messaging_product;
    private String to;
    private String type;
    private WhatsAppDirectApiTemplateVO template;

    public String getMessaging_product() {
        return this.messaging_product;
    }

    public void setMessaging_product(String messaging_product) {
        this.messaging_product = messaging_product;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WhatsAppDirectApiTemplateVO getTemplate() {
        return this.template;
    }

    public void setTemplate(WhatsAppDirectApiTemplateVO template) {
        this.template = template;
    }
}

