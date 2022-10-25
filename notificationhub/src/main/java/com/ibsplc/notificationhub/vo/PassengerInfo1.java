package com.ibsplc.notificationhub.vo;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.Channel1
 *  com.ibsplc.notificationhub.vo.PassengerInfo1
 *  javax.validation.constraints.NotBlank
 *  javax.validation.constraints.NotEmpty
 *  javax.validation.constraints.Size
 */


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PassengerInfo1 {
    @NotEmpty(message="Surname cannot be Empty")
    private @NotEmpty(message="Surname cannot be Empty") String surName;
    @NotBlank(message="phonenumber cannot be empty")
    @Size(min=10, max=15, message="Phone number should be greater than 10 and less than 15")
    private @NotBlank(message="phonenumber cannot be empty") @Size(min=10, max=15, message="Phone number should be greater than 10 and less than 15") String phoneNumber;
    private Channel1 channel;

    public String toString() {
        return "PassengerInfo [surName=" + this.surName + ", phoneNumber=" + this.phoneNumber + ", channel=" + this.channel + "]";
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Channel1 getChannel() {
        return this.channel;
    }

    public void setChannel(Channel1 channel) {
        this.channel = channel;
    }

    public PassengerInfo1(@NotEmpty(message="surname cannot be Empty") @NotEmpty(message="surname cannot be Empty") String surName, @NotBlank(message="phonenumber cannot be empty") @Size(min=10, max=15, message="phone number should be greater than 10 and less than 15") @NotBlank(message="phonenumber cannot be empty") @Size(min=10, max=15, message="phone number should be greater than 10 and less than 15") String phoneNumber, Channel1 channel) {
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.channel = channel;
    }

    public PassengerInfo1() {
    }
}

