/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.SmsTemplateVo
 */
package com.ibsplc.notificationhub.vo;

public class SmsTemplateVo {
    private String lastName;
    private String carousel;
    private String flightNumber;

    public String getLastName() {
        return this.lastName;
    }

    public SmsTemplateVo() {
    }

    public SmsTemplateVo(String lastName, String carousel, String flightNumber) {
        this.lastName = lastName;
        this.carousel = carousel;
        this.flightNumber = flightNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCarousel() {
        return this.carousel;
    }

    public void setCarousel(String carousel) {
        this.carousel = carousel;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}

