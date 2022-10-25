package com.ibsplc.notificationhub.vo;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.WhatsAppDirectApiTemplateVO
 *  com.ibsplc.notificationhub.vo.WhatsAppLanguageVO
 *  com.ibsplc.notificationhub.vo.WhatsAppTemplateParamComponentVO
 */


import java.util.List;

public class WhatsAppDirectApiTemplateVO {
    private String name;
    private WhatsAppLanguageVO language;
    private List<WhatsAppTemplateParamComponentVO> components;

    public List<WhatsAppTemplateParamComponentVO> getComponents() {
        return this.components;
    }

    public void setComponents(List<WhatsAppTemplateParamComponentVO> components) {
        this.components = components;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsAppLanguageVO getLanguage() {
        return this.language;
    }

    public void setLanguage(WhatsAppLanguageVO language) {
        this.language = language;
    }
}

