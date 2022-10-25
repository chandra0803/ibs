/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonProcessingException
 *  com.ibsplc.notificationhub.dao.NotificationDao
 *  com.ibsplc.notificationhub.vo.ChannelInfoResponseVO
 *  com.ibsplc.notificationhub.vo.NotificationRequestVO
 *  freemarker.template.TemplateException
 */
package com.ibsplc.notificationhub.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ibsplc.notificationhub.vo.ChannelInfoResponseVO;
import com.ibsplc.notificationhub.vo.NotificationRequestVO;
import freemarker.template.TemplateException;
import java.io.IOException;

public interface NotificationDao {
    public ChannelInfoResponseVO saveReportDetails(ChannelInfoResponseVO var1, String var2, String var3) throws IOException, TemplateException;

    public void updateNotificationDetails(NotificationRequestVO var1, ChannelInfoResponseVO var2) throws JsonProcessingException;
}

