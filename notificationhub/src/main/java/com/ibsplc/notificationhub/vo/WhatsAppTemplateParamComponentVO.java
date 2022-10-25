package com.ibsplc.notificationhub.vo;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.WhatsAppRequestTemplateParamVO
 *  com.ibsplc.notificationhub.vo.WhatsAppTemplateParamComponentVO
 */


import java.util.List;

public class WhatsAppTemplateParamComponentVO {
    private String type;
    private List<WhatsAppRequestTemplateParamVO> parameters;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<WhatsAppRequestTemplateParamVO> getParameters() {
        return this.parameters;
    }

    public void setParameters(List<WhatsAppRequestTemplateParamVO> parameters) {
        this.parameters = parameters;
    }
}

