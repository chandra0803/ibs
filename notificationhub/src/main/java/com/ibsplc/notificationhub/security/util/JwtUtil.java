/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.security.util.JwtUtil
 *  io.jsonwebtoken.Claims
 *  io.jsonwebtoken.Jwts
 *  io.jsonwebtoken.SignatureAlgorithm
 *  org.springframework.beans.factory.annotation.Value
 *  org.springframework.security.core.userdetails.UserDetails
 *  org.springframework.stereotype.Component
 */
package com.ibsplc.notificationhub.security.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil
implements Serializable {
    private static final long serialVersionUID = -2550185165626007488L;
    public static final long JWT_TOKEN_VALIDITY = 60L;
    @Value(value="${notification.jwt.secret}")
    private String secret;

    public String getUsernameFromToken(String token) {
        return (String)this.getClaimFromToken(token, Claims::getSubject);
    }

    public Date getExpirationDateFromToken(String token) {
        return (Date)this.getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        Claims claims = this.getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return (Claims)Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        Date expiration = this.getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    public String generateToken(UserDetails userDetails) {
        HashMap claims = new HashMap();
        return this.doGenerateToken(claims, userDetails.getUsername());
    }

    private String doGenerateToken(Map<String, Object> claims, String subject) {
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis() + 60000L)).signWith(SignatureAlgorithm.HS256, this.secret).compact();
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        String username = this.getUsernameFromToken(token);
        if (username.equals(userDetails.getUsername()) && !this.isTokenExpired(token).booleanValue()) {
            return true;
        }
        return false;
    }
}

