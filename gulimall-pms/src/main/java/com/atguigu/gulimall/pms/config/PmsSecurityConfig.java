package com.atguigu.gulimall.pms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author hezhiqiang
 * @TCH163job.com
 * @date 2019/8/1 21:13
 */
@EnableWebSecurity
@Configuration
public class PmsSecurityConfig  extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //
        // super.configure(http);
        http.authorizeRequests().antMatchers("/**").permitAll();

        http.csrf().disable();
    }
}
