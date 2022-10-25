/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.JwtAuthResponse
 */
package com.ibsplc.notificationhub.vo;

public class JwtAuthResponse {
    private String token;

    public JwtAuthResponse(String jwttoken) {
        this.token = jwttoken;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

