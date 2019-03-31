package com.example.demo.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static org.hibernate.criterion.Restrictions.and;

@Configuration
@EnableWebSecurity
public class SesurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/api/users/signup").permitAll()
                    .and()
                .formLogin()
                .loginPage("/login");
    }
}
