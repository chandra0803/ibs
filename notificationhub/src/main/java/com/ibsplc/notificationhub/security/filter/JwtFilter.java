/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.security.filter.JwtFilter
 *  com.ibsplc.notificationhub.security.service.UserSecurityService
 *  com.ibsplc.notificationhub.security.util.JwtUtil
 *  javax.servlet.FilterChain
 *  javax.servlet.ServletException
 *  javax.servlet.ServletRequest
 *  javax.servlet.ServletResponse
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.security.authentication.UsernamePasswordAuthenticationToken
 *  org.springframework.security.core.Authentication
 *  org.springframework.security.core.context.SecurityContextHolder
 *  org.springframework.security.core.userdetails.UserDetails
 *  org.springframework.security.web.authentication.WebAuthenticationDetailsSource
 *  org.springframework.stereotype.Component
 *  org.springframework.web.filter.OncePerRequestFilter
 */
package com.ibsplc.notificationhub.security.filter;

import com.ibsplc.notificationhub.security.service.UserSecurityService;
import com.ibsplc.notificationhub.security.util.JwtUtil;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtFilter
extends OncePerRequestFilter {
    @Autowired
    private UserSecurityService userService;
    @Autowired
    private JwtUtil jwtUtil;

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        UserDetails userDetails;
        String authHeader = request.getHeader("Authorization");
        String userName = null;
        String token = null;
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7);
            userName = this.jwtUtil.getUsernameFromToken(token);
        }
        if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null && Boolean.TRUE.equals(this.jwtUtil.validateToken(token, userDetails = this.userService.loadUserByUsername(userName)))) {
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken((Object)userDetails, null, userDetails.getAuthorities());
            usernamePasswordAuthenticationToken.setDetails((Object)new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication((Authentication)usernamePasswordAuthenticationToken);
        }
        filterChain.doFilter((ServletRequest)request, (ServletResponse)response);
    }
}

