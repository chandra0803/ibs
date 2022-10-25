package com.ibsplc.notificationhub.serviceimplementation;
/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.dao.NotificationDao
 *  com.ibsplc.notificationhub.security.AesEncryptor
 *  com.ibsplc.notificationhub.service.NotificationService
 *  com.ibsplc.notificationhub.serviceimplementation.NotificationServiceImpl
 *  com.ibsplc.notificationhub.vo.ChannelInfoResponseVO
 *  com.ibsplc.notificationhub.vo.ChannelInfos
 *  com.ibsplc.notificationhub.vo.NotificationRequestVO
 *  com.ibsplc.notificationhub.vo.NotificationResponseVO
 *  com.ibsplc.notificationhub.vo.SmsNotificationRequestVO
 *  com.ibsplc.notificationhub.vo.WhatsAppDirectApiTemplateVO
 *  com.ibsplc.notificationhub.vo.WhatsAppLanguageVO
 *  com.ibsplc.notificationhub.vo.WhatsAppNotificationDirectRequestVO
 *  com.ibsplc.notificationhub.vo.WhatsAppRequestTemplateParamVO
 *  com.ibsplc.notificationhub.vo.WhatsAppTemplateParamComponentVO
 *  freemarker.core.InvalidReferenceException
 *  freemarker.template.Configuration
 *  freemarker.template.TemplateException
 *  freemarker.template.TemplateNotFoundException
 *  org.json.simple.JSONArray
 *  org.json.simple.JSONObject
 *  org.json.simple.parser.JSONParser
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Value
 *  org.springframework.http.HttpEntity
 *  org.springframework.http.HttpHeaders
 *  org.springframework.http.HttpMethod
 *  org.springframework.http.MediaType
 *  org.springframework.http.ResponseEntity
 *  org.springframework.stereotype.Service
 *  org.springframework.util.MultiValueMap
 *  org.springframework.web.client.RestTemplate
 */


import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.ibsplc.notificationhub.dao.NotificationDao;
import com.ibsplc.notificationhub.security.AesEncryptor;
import com.ibsplc.notificationhub.service.NotificationService;
import com.ibsplc.notificationhub.vo.ChannelInfoResponseVO;
import com.ibsplc.notificationhub.vo.ChannelInfos;
import com.ibsplc.notificationhub.vo.NotificationRequestVO;
import com.ibsplc.notificationhub.vo.NotificationResponseVO;
import com.ibsplc.notificationhub.vo.SmsNotificationRequestVO;
import com.ibsplc.notificationhub.vo.WhatsAppDirectApiTemplateVO;
import com.ibsplc.notificationhub.vo.WhatsAppLanguageVO;
import com.ibsplc.notificationhub.vo.WhatsAppNotificationDirectRequestVO;
import com.ibsplc.notificationhub.vo.WhatsAppRequestTemplateParamVO;
import com.ibsplc.notificationhub.vo.WhatsAppTemplateParamComponentVO;

import freemarker.core.InvalidReferenceException;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationDao notificationDao;
    @Value(value="${app.bulkSms.url}")
    private String bulkSmsUrl;
    @Value(value="${app.whatsApp.url}")
    private String whatsAppUrl;
    @Value(value="${app.bulkSms.userName}")
    private String userName;
    @Value(value="${app.bulkSms.passWord}")
    private String passWord;
    @Value(value="${app.bulkSms.encoding}")
    private String encoding;
    @Value(value="${app.notification.sms.defaultTemplate: bulk-sms-default.ftl}")
    private String msgTemplate;
    @Value(value="${app.notification.sms.templates}")
    private String[] msgTemplateArray;
    @Value(value="${app.notification.whatsapp.defaultTemplate: clicktell-wtsup-default.ftl}")
    private String whatsappTemplate;
    @Value(value="${app.notification.whatsapp.templates}")
    private String[] whatsappTemplateArray;
    @Value(value="${app.clickatell.url}")
    private String clickatellUrl;
    @Value(value="${app.clickatell.api-key}")
    private String apikey;
    @Value(value="${app.notification.sms.defaultTemplatePath}")
    private String smsTemplateDefaultPath;
    @Value(value="${app.notification.validLanguages}")
    private String[] languageArray;
    @Value(value="${app.notification.whatsapp.defaultTemplatePath}")
    private String whatsappTemplatePath;
    @Value(value="${app.notification.whatsapp.defaultTemplateKeyList}")
    private String[] defaultTemplateKeyList;
    @Value(value="${app.whatsApp.authKey}")
    private String whatsAppAuth;
    String whatsapp = "whatsapp";
    @Autowired
    NotificationResponseVO notificationResponseVO;
    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationServiceImpl.class);

    /*
     * Unable to fully structure code
     */
    public NotificationResponseVO sendNotification(NotificationRequestVO notificationRequest) throws IOException, TemplateException {
        NotificationServiceImpl.LOGGER.info("Entering the executable method");
        this.notificationResponseVO = new NotificationResponseVO();
        List<ChannelInfoResponseVO> channelInfoResponse = new ArrayList<ChannelInfoResponseVO>();
        String smsContent = "";
        ChannelInfoResponseVO channelResponseVo;
		try {
           String language = notificationRequest.getLanguage();
          Iterator<ChannelInfos>  channelInfoIterator = notificationRequest.getChannelInfos().iterator();
            if (language == null || this.validatelanguage(language)) {
            	com.ibsplc.notificationhub.vo.ChannelInfoResponseVO  channelResponseVo1= this.prepareResponse("", Boolean.valueOf(false), "", "Invalid language");
            channelInfoResponse.add(channelResponseVo1);
            NotificationServiceImpl.LOGGER.error("Invalid language");
            notificationResponseVO.setChannelInfoResponseVO(channelInfoResponse);
            //return notificationResponseVO;
            
            // 1 sources

            
                ChannelInfos channelInfos = (ChannelInfos)channelInfoIterator.next();
                if (!channelInfos.getChannelType().isEmpty() && (channelInfos.getChannelType().equalsIgnoreCase("sms") || channelInfos.getChannelType().equalsIgnoreCase(this.whatsapp))) {
                    ChannelInfoResponseVO channelResponseVo11=null;
					if (channelInfos.getChannelType().equalsIgnoreCase("SMS")) {
                        String smsTempPath = this.smsTemplateDefaultPath;
                        Configuration cfg = new Configuration();
                        cfg.setClassForTemplateLoading(this.getClass(), smsTempPath);
                        cfg.setDefaultEncoding("UTF-8");
                        if (channelInfos.getTemplateID() != null) {
                            if (this.validateTemplate(channelInfos.getTemplateID(), channelInfos.getChannelType())) {
                                this.msgTemplate = channelInfos.getTemplateID();
                            } else {
                                channelResponseVo11 = this.prepareResponse("sms", Boolean.valueOf(false), "", "Invalid templateID");
                                channelInfoResponse.add(channelResponseVo11);
                                NotificationServiceImpl.LOGGER.error("invalid templateID");
                                notificationResponseVO.setChannelInfoResponseVO(channelInfoResponse);
                            }
                        }
                        StringBuilder bld = new StringBuilder();
                        if (!this.msgTemplate.contains(".ftl")) {
                            bld.append(this.msgTemplate);
                        }
                        Template smsTemplate = cfg.getTemplate(this.msgTemplate);
                        HashMap<String, String> templateData = new HashMap<String, String>();
                        Set<String> businessDataMapKeys = channelInfos.getBusinessData().keySet();
                        for (String key : businessDataMapKeys) {
                            templateData.put((String)key, channelInfos.getBusinessData().get(key));
                        }
                        Object key = null;
                        Object var16_27 = null;
                        try {
                            StringWriter out = new StringWriter();
                            try {
                                smsTemplate.process(templateData, (Writer)out);
                                smsContent = out.getBuffer().toString();
                            }
                            finally {
                                if (out != null) {
                                    out.close();
                                }
                            }
                        }
                        catch (Throwable var16_28) {
                            if (key == null) {
                                key = var16_28;
                            } else if (key != var16_28) {
                                ((Throwable) key).addSuppressed(var16_28);
                            }
                           // throw key;
                        }
                        SmsNotificationRequestVO smsNotificationRequestVO = new SmsNotificationRequestVO();
                        smsNotificationRequestVO.setBody(smsContent);
                        NotificationServiceImpl.LOGGER.info("smsContent={}", (String)smsContent);
                        smsNotificationRequestVO.setEncoding(this.encoding);
                        if (!channelInfos.getContactDetails().isEmpty()) {
                            channelInfos.getContactDetails().stream().forEach((Consumer<String>)LambdaMetafactory.altMetafactory(null, null, null, "(Ljava/lang/Object;)V; lambda$0(com.ibsplc.notificationhub.vo.SmsNotificationRequestVO ,java.util.List, java.lang.String, (Ljava/lang/String;)V)((NotificationServiceImpl)this, (SmsNotificationRequestVO)smsNotificationRequestVO, channelInfoResponse"));
                        } else {
                            channelResponseVo11 = this.prepareResponse("sms", Boolean.valueOf(false), "", "Contact details can not be empty");
                            channelInfoResponse.add(channelResponseVo11);
                            NotificationServiceImpl.LOGGER.error("Contact Details cannot be empty");
                        }
                        notificationRequest = this.encryptPersonalData(notificationRequest);
                        notificationResponseVO.setChannelInfoResponseVO(channelInfoResponse);
                        NotificationServiceImpl.LOGGER.info("Notification request---");
                        NotificationServiceImpl.LOGGER.info(notificationRequest.toString());
                        NotificationServiceImpl.LOGGER.info("Notification response---");
                        NotificationServiceImpl.LOGGER.info(notificationResponseVO.toString());
                    }
                    if (!channelInfos.getChannelType().equalsIgnoreCase("WHATSAPP")) //continue;
                    if (channelInfos.getTemplateID() != null) {
                        if (this.validateTemplate(channelInfos.getTemplateID(), channelInfos.getChannelType())) {
                            this.whatsappTemplate = channelInfos.getTemplateID();
                        } else {
                            channelResponseVo11 = this.prepareResponse(this.whatsapp, Boolean.valueOf(false), "", "Invalid templateID");
                            channelInfoResponse.add(channelResponseVo11);
                            NotificationServiceImpl.LOGGER.error("invalid templateID");
                            notificationResponseVO.setChannelInfoResponseVO(channelInfoResponse);
                        }
                    }
                    WhatsAppNotificationDirectRequestVO whatsAppNotificationDirectRequestVO = new WhatsAppNotificationDirectRequestVO();
                    whatsAppNotificationDirectRequestVO.setMessaging_product(this.whatsapp);
                    whatsAppNotificationDirectRequestVO.setType("template");
                    WhatsAppDirectApiTemplateVO whatsAppDirectApiTemplateVO = new WhatsAppDirectApiTemplateVO();
                    WhatsAppLanguageVO whatsAppLanguageVO = new WhatsAppLanguageVO();
                    if (language != null) {
                        whatsAppLanguageVO.setCode(language);
                    } else {
                        whatsAppLanguageVO.setCode("en_US");
                    }
                    whatsAppDirectApiTemplateVO.setLanguage(whatsAppLanguageVO);
                    whatsAppDirectApiTemplateVO.setName(this.whatsappTemplate);
                    WhatsAppTemplateParamComponentVO whatsAppTemplateParamComponentVO = new WhatsAppTemplateParamComponentVO();
                    whatsAppTemplateParamComponentVO.setType("body");
                    ArrayList<WhatsAppRequestTemplateParamVO> paramList = new ArrayList<WhatsAppRequestTemplateParamVO>();
                    String[] var16_27 = this.defaultTemplateKeyList;
                    int smsNotificationRequestVO = this.defaultTemplateKeyList.length;
                    int keyIterator = 0;
                    while (keyIterator < smsNotificationRequestVO) {
                        String key = var16_27[keyIterator];
                        WhatsAppRequestTemplateParamVO whatsAppRequestTemplateParam = new WhatsAppRequestTemplateParamVO();
                        whatsAppRequestTemplateParam.setType("text");
                        whatsAppRequestTemplateParam.setText((String)channelInfos.getBusinessData().get(key));
                        paramList.add(whatsAppRequestTemplateParam);
                        ++keyIterator;
                    }
                    whatsAppTemplateParamComponentVO.setParameters(paramList);
                    ArrayList<WhatsAppTemplateParamComponentVO> componentList = new ArrayList<WhatsAppTemplateParamComponentVO>();
                    componentList.add(whatsAppTemplateParamComponentVO);
                    whatsAppDirectApiTemplateVO.setComponents(componentList);
                    whatsAppNotificationDirectRequestVO.setTemplate(whatsAppDirectApiTemplateVO);
                    if (!channelInfos.getContactDetails().isEmpty()) {
                        for (String number : channelInfos.getContactDetails()) {
                            whatsAppNotificationDirectRequestVO.setTo(number);
                            channelInfoResponse.add(this.sendWhatsapp(whatsAppNotificationDirectRequestVO));
                        }
                    } else {
                        channelResponseVo11 = this.prepareResponse(this.whatsapp, Boolean.valueOf(false), "", " Contact details can not be empty");
                        channelInfoResponse.add(channelResponseVo11);
                        NotificationServiceImpl.LOGGER.error("Contact details cannot be empty");
                    }
                    notificationResponseVO.setChannelInfoResponseVO(channelInfoResponse);
                   // continue;
                }
                ChannelInfoResponseVO channelResponseVo11 = this.prepareResponse("", Boolean.valueOf(false), "", "Invalid channelType");
                channelInfoResponse.add(channelResponseVo11);
                NotificationServiceImpl.LOGGER.error("Invalid channelType");
                notificationResponseVO.setChannelInfoResponseVO(channelInfoResponse);

                // 4 sources

            }while (channelInfoIterator.hasNext()) {
            

            // 1 sources

        }}
        catch (TemplateNotFoundException tnfEx) {
            channelResponseVo = this.prepareResponse("", Boolean.valueOf(false), "", "Template not found");
            channelInfoResponse.add(channelResponseVo);
            NotificationServiceImpl.LOGGER.error("Template Not found{}", (Object)tnfEx.getMessage());
            notificationResponseVO.setChannelInfoResponseVO(channelInfoResponse);
        }
        catch (Exception ex) {
            channelResponseVo = this.prepareResponse("", Boolean.valueOf(false), "", ex.getMessage());
            channelInfoResponse.add(channelResponseVo);
            notificationResponseVO.setChannelInfoResponseVO(channelInfoResponse);
        }
        return notificationResponseVO;
    }

    public ChannelInfoResponseVO sendSms(SmsNotificationRequestVO smsNotificationRequestVO) {
        LOGGER.debug("Entering the sms executable method");
        ChannelInfoResponseVO channelInfoResponseVO = new ChannelInfoResponseVO();
        RestTemplate restTemplate = new RestTemplate();
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.setBasicAuth("Airlink_iFlight", "iFl1ght#");
            HttpEntity entity = new HttpEntity((Object)smsNotificationRequestVO, (MultiValueMap)headers);
            ResponseEntity response = restTemplate.exchange(this.bulkSmsUrl, HttpMethod.POST, entity, String.class, new Object[0]);
            String body = (String)response.getBody();
            if (response.getStatusCodeValue() == 201) {
                JSONParser parser = new JSONParser();
                JSONArray parsedResponse = (JSONArray)parser.parse((String)response.getBody());
                JSONObject obj = (JSONObject)parsedResponse.get(0);
                channelInfoResponseVO.setReferenceId((String)obj.get((Object)"id"));
                channelInfoResponseVO.setChannelType("sms");
                channelInfoResponseVO.setSuccess(true);
            } else {
                channelInfoResponseVO.setChannelType("sms");
                channelInfoResponseVO.setSuccess(false);
                channelInfoResponseVO.setErrorInfo("BulkSms api Error");
                LOGGER.error("Bulksms api error");
            }
            LOGGER.info("message sent through sms successfully");
        }
        catch (Exception e) {
            e.printStackTrace();
            channelInfoResponseVO.setChannelType("sms");
            channelInfoResponseVO.setSuccess(false);
            channelInfoResponseVO.setErrorInfo("Exception occured while accessing bulkSms api");
            LOGGER.error("Exception occured while acessing bulksms api{}", (Object)e.getMessage());
        }
        return channelInfoResponseVO;
    }

    public ChannelInfoResponseVO sendWhatsapp(WhatsAppNotificationDirectRequestVO whatsAppNotificationDirectRequest) {
        LOGGER.debug("Entering the whatsapp executable method");
        ChannelInfoResponseVO channelInfoResponseVO = new ChannelInfoResponseVO();
        RestTemplate restTemplate = new RestTemplate();
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.setBearerAuth(this.whatsAppAuth);
            HttpEntity entity = new HttpEntity((Object)whatsAppNotificationDirectRequest, (MultiValueMap)headers);
            ResponseEntity response = restTemplate.exchange(this.whatsAppUrl, HttpMethod.POST, entity, String.class, new Object[0]);
            if (response.getStatusCodeValue() == 200) {
                JSONParser parser = new JSONParser();
                JSONObject parsedResponse = (JSONObject)parser.parse((String)response.getBody());
                List responseList = (List)parsedResponse.get((Object)"messages");
                JSONObject listParser = (JSONObject)responseList.get(0);
                channelInfoResponseVO.setReferenceId((String)listParser.get((Object)"id"));
                channelInfoResponseVO.setChannelType(this.whatsapp);
                channelInfoResponseVO.setSuccess(true);
                LOGGER.info("message sent to whatsapp successfully");
            } else {
                channelInfoResponseVO.setChannelType(this.whatsapp);
                channelInfoResponseVO.setSuccess(false);
                channelInfoResponseVO.setErrorInfo("Clickatell api Error");
                LOGGER.error("clickatell api errror");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            channelInfoResponseVO.setChannelType(this.whatsapp);
            channelInfoResponseVO.setSuccess(false);
            channelInfoResponseVO.setErrorInfo("Error occured while trying to send message in whatsApp");
            LOGGER.error("Error Occured while trying to send message in whatsApp{}", (Object)e.getMessage());
        }
        return channelInfoResponseVO;
    }

    public ChannelInfoResponseVO prepareResponse(String channelType, Boolean success, String referenceId, String errorInfo) {
        ChannelInfoResponseVO channelInfoResponseVO = new ChannelInfoResponseVO();
        channelInfoResponseVO.setChannelType(channelType);
        channelInfoResponseVO.setSuccess(success.booleanValue());
        channelInfoResponseVO.setReferenceId(referenceId);
        channelInfoResponseVO.setErrorInfo(errorInfo);
        return channelInfoResponseVO;
    }

    public boolean validatelanguage(String language) {
        boolean valid = false;
        String[] stringArray = this.languageArray;
        int n = this.languageArray.length;
        int n2 = 0;
        while (n2 < n) {
            String languages = stringArray[n2];
            if (languages.equals(language)) {
                valid = true;
                break;
            }
            ++n2;
        }
        return valid;
    }

    public boolean validateTemplate(String template, String channel) {
        boolean valid;
        block4: {
            block5: {
                LOGGER.trace("Entering the method validateTemplate");
                LOGGER.debug("Authenticating suitable template");
                valid = false;
                if (!channel.equalsIgnoreCase("sms")) break block5;
                String[] stringArray = this.msgTemplateArray;
                int n = this.msgTemplateArray.length;
                int n2 = 0;
                while (n2 < n) {
                    String templates = stringArray[n2];
                    LOGGER.warn("we are testing message template with springboot{}", (Object)template);
                    if (template.equals(templates)) {
                        valid = true;
                        break block4;
                    }
                    LOGGER.info("Template for sms validated Succesfully{}", (Object)template);
                    ++n2;
                }
                break block4;
            }
            if (!channel.equalsIgnoreCase(this.whatsapp)) break block4;
            LOGGER.warn("we are testing whatsapp template with springboot{}", (Object)template);
            String[] stringArray = this.whatsappTemplateArray;
            int n = this.whatsappTemplateArray.length;
            int n3 = 0;
            while (n3 < n) {
                String templates = stringArray[n3];
                if (template.equals(templates)) {
                    valid = true;
                    break;
                }
                ++n3;
            }
        }
        return valid;
    }

    public boolean validateMobileNumber(String number) {
        int numberLength = number.length();
        LOGGER.trace("Entering the method validateMobileNumber");
        LOGGER.debug("Authenticating user's phoneNumber");
        if (numberLength > 10 && numberLength < 15) {
            String pattern = "(0/91)?[7-9][0-9]{" + (numberLength - 1) + "}";
            Pattern ptrn = Pattern.compile(pattern);
            Matcher match = ptrn.matcher(number);
            LOGGER.warn("we are testing phoneNumber with springboot{}", (Object)number);
            LOGGER.info("PhoneNumber validated Succesfully{}", (Object)number);
            return match.find() && match.group().equals(number);
        }
        LOGGER.error("PhoneNumber did not match the criteria");
        return false;
    }

    public NotificationRequestVO encryptPersonalData(NotificationRequestVO notificationRequest) {
        List<String> encryptNumList = new ArrayList<String>();
        try {
            encryptNumList = ((ChannelInfos)notificationRequest.getChannelInfos().get(0)).getContactDetails().stream().map(AesEncryptor::encrypt).collect(Collectors.toList());
        }
        catch (Exception e) {
            LOGGER.error("***------Encryption error-----***");
        }
        ((ChannelInfos)notificationRequest.getChannelInfos().get(0)).setContactDetails(encryptNumList);
        return notificationRequest;
    }

    public void saveReportDetails(ChannelInfoResponseVO channelResponse, String num) {
        try {
            if (channelResponse.getSuccess()) {
                this.notificationDao.saveReportDetails(channelResponse, "Success", num);
            } else {
                this.notificationDao.saveReportDetails(channelResponse, "failed", num);
            }
        }
        catch (Exception ex) {
            LOGGER.error("***------Error occured while db insertion-----*** ");
            ex.printStackTrace();
        }
    }

    public void updateNotificationDetails(NotificationRequestVO notificationRequest, NotificationResponseVO notificationResponse) {
    }

    private /* synthetic */ void lambda$0(SmsNotificationRequestVO smsNotificationRequestVO, List list, String number) {
        smsNotificationRequestVO.setTo(number);
        String encryptedNum = AesEncryptor.encrypt((String)number);
        ChannelInfoResponseVO channelResponseVo = this.sendSms(smsNotificationRequestVO);
        list.add(channelResponseVo);
    }

	
	

	}

