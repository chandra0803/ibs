/*
 * Decompiled with CFR 0.151.
 * 
 * Could not load the following classes:
 *  com.ibsplc.notificationhub.security.SecurityConfig
 *  com.ibsplc.notificationhub.security.filter.JwtFilter
 *  com.ibsplc.notificationhub.security.service.UserSecurityService
 *  javax.servlet.Filter
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Bean
 *  org.springframework.security.authentication.AuthenticationManager
 *  org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
 *  org.springframework.security.config.annotation.web.builders.HttpSecurity
 *  org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
 *  org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
 *  org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer$AuthorizedUrl
 *  org.springframework.security.config.http.SessionCreationPolicy
 *  org.springframework.security.core.userdetails.UserDetailsService
 *  org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
 */
package com.ibsplc.notificationhub.security;

import com.ibsplc.notificationhub.security.filter.JwtFilter;
import com.ibsplc.notificationhub.security.service.UserSecurityService;
import javax.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig
extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserSecurityService userService;
    @Autowired
    private JwtFilter jwtfilter;

    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    protected void configure(AuthenticationManagerBuilder authentication) throws Exception {
        authentication.userDetailsService((UserDetailsService)this.userService);
    }

    protected void configure(HttpSecurity httpSecurity) throws Exception {
        ((HttpSecurity)((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)((HttpSecurity)httpSecurity.csrf().disable()).authorizeRequests().antMatchers(new String[]{"/notificationhub/auth"})).permitAll().anyRequest()).authenticated().and()).sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        httpSecurity.addFilterBefore((Filter)this.jwtfilter, UsernamePasswordAuthenticationFilter.class);
    }
}

