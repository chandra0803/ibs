/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonProcessingException
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  com.ibsplc.notificationhub.dao.NotificationDao
 *  com.ibsplc.notificationhub.daoimplementation.NotificationDaoImpl
 *  com.ibsplc.notificationhub.vo.ChannelInfoResponseVO
 *  com.ibsplc.notificationhub.vo.NotificationRequestVO
 *  freemarker.template.TemplateException
 *  org.springframework.beans.factory.annotation.Value
 *  org.springframework.stereotype.Component
 */
package com.ibsplc.notificationhub.daoimplementation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.notificationhub.dao.NotificationDao;
import com.ibsplc.notificationhub.vo.ChannelInfoResponseVO;
import com.ibsplc.notificationhub.vo.NotificationRequestVO;
import freemarker.template.TemplateException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NotificationDaoImpl
implements NotificationDao {
    @Value(value="${notification.sql.insert}")
    private String sqlInsert;
    @Value(value="${notification.sql.update}")
    private String sqlUpdate;

    public ChannelInfoResponseVO saveReportDetails(ChannelInfoResponseVO channelInfoResponse, String status, String phnNum) throws IOException, TemplateException {
        ObjectMapper obj = new ObjectMapper();
        String resp = obj.writeValueAsString((Object)channelInfoResponse);
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String transactionDateTime = date.format(format1);
        return channelInfoResponse;
    }

    public void updateNotificationDetails(NotificationRequestVO notificationRequest, ChannelInfoResponseVO channelResponse) throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        String req = obj.writeValueAsString((Object)notificationRequest);
    }
}

