package com.ibsplc.notificationhub.vo;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.vo.ChannelInfoResponseVO
 *  com.ibsplc.notificationhub.vo.NotificationResponseVO
 *  org.springframework.stereotype.Component
 */


import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class NotificationResponseVO {
    private List<ChannelInfoResponseVO> ChannelInfoResponseVO;

    public String toString() {
        return "NotificationResponseVO [ChannelInfoResponseVO=" + this.ChannelInfoResponseVO + "]";
    }

    public List<ChannelInfoResponseVO> getChannelInfoResponseVO() {
        return this.ChannelInfoResponseVO;
    }

    public void setChannelInfoResponseVO(List<ChannelInfoResponseVO> channelInfoResponseVO) {
        this.ChannelInfoResponseVO = channelInfoResponseVO;
    }
}

