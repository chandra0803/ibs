/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.Channel1
 */
package com.ibsplc.notificationhub.vo;

public class Channel1 {
    private boolean sms;
    private boolean whatsapp;

    public String toString() {
        return "Channel [sms=" + this.sms + ", whatsapp=" + this.whatsapp + "]";
    }

    public boolean isSms() {
        return this.sms;
    }

    public void setSms(boolean sms) {
        this.sms = sms;
    }

    public boolean isWhatsapp() {
        return this.whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }
}

