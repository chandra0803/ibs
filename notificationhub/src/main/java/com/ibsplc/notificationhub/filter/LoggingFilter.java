/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.filter.LoggingFilter
 *  javax.servlet.FilterChain
 *  javax.servlet.ServletException
 *  javax.servlet.ServletRequest
 *  javax.servlet.ServletResponse
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 *  org.springframework.web.filter.OncePerRequestFilter
 *  org.springframework.web.util.ContentCachingRequestWrapper
 *  org.springframework.web.util.ContentCachingResponseWrapper
 */
package com.ibsplc.notificationhub.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

@Component
public class LoggingFilter
extends OncePerRequestFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
        long startTime = System.currentTimeMillis();
        filterChain.doFilter((ServletRequest)requestWrapper, (ServletResponse)responseWrapper);
        long timeTaken = System.currentTimeMillis() - startTime;
        String requestBody = this.getStringValue(requestWrapper.getContentAsByteArray(), request.getCharacterEncoding());
        String responseBody = this.getStringValue(responseWrapper.getContentAsByteArray(), response.getCharacterEncoding());
        LOGGER.info("FINISHED PROCESSING : METHOD={}; REQUESTURI={}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIM TAKEN={}", new Object[]{request.getMethod(), request.getRequestURI(), requestBody, response.getStatus(), responseBody, timeTaken});
        responseWrapper.copyBodyToResponse();
    }

    private String getStringValue(byte[] contentAsByteArray, String characterEncoding) {
        try {
            return new String(contentAsByteArray, 0, contentAsByteArray.length, characterEncoding);
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
}

