package com.ibsplc.notificationhub.service;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.service.NotificationService
 *  com.ibsplc.notificationhub.vo.NotificationRequestVO
 *  com.ibsplc.notificationhub.vo.NotificationResponseVO
 *  freemarker.template.TemplateException
 */


import java.io.IOException;

import com.ibsplc.notificationhub.vo.NotificationRequestVO;
import com.ibsplc.notificationhub.vo.NotificationResponseVO;

import freemarker.template.TemplateException;

public interface NotificationService {
	
    public NotificationResponseVO sendNotification(NotificationRequestVO var1) throws IOException, TemplateException;

    public NotificationRequestVO encryptPersonalData(NotificationRequestVO var1);

    public void updateNotificationDetails(NotificationRequestVO var1, NotificationResponseVO var2);
}

