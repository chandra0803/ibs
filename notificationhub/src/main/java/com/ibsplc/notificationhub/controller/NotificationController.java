/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.controller.NotificationController
 *  com.ibsplc.notificationhub.security.service.UserSecurityService
 *  com.ibsplc.notificationhub.security.util.JwtUtil
 *  com.ibsplc.notificationhub.service.NotificationService
 *  com.ibsplc.notificationhub.vo.JwtAuthResponse
 *  com.ibsplc.notificationhub.vo.NotificationRequestVO
 *  com.ibsplc.notificationhub.vo.NotificationResponseVO
 *  javax.servlet.http.HttpServletRequest
 *  javax.validation.Valid
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.http.ResponseEntity
 *  org.springframework.security.authentication.AuthenticationManager
 *  org.springframework.security.authentication.BadCredentialsException
 *  org.springframework.security.authentication.UsernamePasswordAuthenticationToken
 *  org.springframework.security.core.Authentication
 *  org.springframework.security.core.userdetails.UserDetails
 *  org.springframework.validation.BindingResult
 *  org.springframework.validation.annotation.Validated
 *  org.springframework.web.bind.annotation.PostMapping
 *  org.springframework.web.bind.annotation.RequestBody
 *  org.springframework.web.bind.annotation.RequestMapping
 *  org.springframework.web.bind.annotation.RestController
 */
package com.ibsplc.notificationhub.controller;

import com.ibsplc.notificationhub.security.service.UserSecurityService;
import com.ibsplc.notificationhub.security.util.JwtUtil;
import com.ibsplc.notificationhub.service.NotificationService;
import com.ibsplc.notificationhub.vo.JwtAuthResponse;
import com.ibsplc.notificationhub.vo.NotificationRequestVO;
import com.ibsplc.notificationhub.vo.NotificationResponseVO;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/notificationhub") 
public class NotificationController {
	 private static final Logger logger = LoggerFactory.getLogger(NotificationController.class);
	    
    @Autowired
    private NotificationService notificationService;
    @Autowired
    NotificationResponseVO notificationResponseVO;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserSecurityService userDetailsService;
    @Autowired
    private JwtUtil jwtUtil;
   
    @GetMapping("/hello")
    public String hello() {
    	return "hello";
	   
   }
    @RequestMapping("/")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
    
   //@PostMapping("/auth")
   @PostMapping(value="/auth")
   // @RequestMapping(path="/auth", method=RequestMethod.POST)
    public ResponseEntity<Object> createAuthToken(HttpServletRequest request) throws Exception {
	   logger.info("########## Notification Hub Auth Controller");
        try {
            this.authenticationManager.authenticate((Authentication)new UsernamePasswordAuthenticationToken((Object)request.getHeader("x-auth-channel"), (Object)request.getHeader("x-auth-token")));
        }
        catch (BadCredentialsException ex) {
            throw new Exception("Incorrect userName or Password ", ex);
        }
        catch (Exception exc) {
        	logger.error("Exception occured during authentication ");
            exc.printStackTrace();
        }finally{
        	logger.error("Exception occured during createAuthToken ");
        }
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(request.getHeader("x-auth-channel"));
        logger.info("userDetails :"+userDetails);
        String token = this.jwtUtil.generateToken(userDetails);
        logger.info("TOKEN :"+token);
        return  ResponseEntity.ok((Object)new JwtAuthResponse(token));
    }

    @PostMapping(value={"/sendNotification"})
    public NotificationResponseVO sendNotification(@RequestBody @Valid NotificationRequestVO notificationRequest, BindingResult result) {
    	logger.info("inside controller");
        try {
            this.notificationResponseVO = this.notificationService.sendNotification(notificationRequest);
            notificationRequest = this.notificationService.encryptPersonalData(notificationRequest);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return this.notificationResponseVO;
    }
}

