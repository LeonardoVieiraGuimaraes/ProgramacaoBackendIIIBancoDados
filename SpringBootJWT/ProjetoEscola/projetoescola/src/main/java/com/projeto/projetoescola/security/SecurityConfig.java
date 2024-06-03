package com.projeto.projetoescola.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity httpSec) throws Exception {
        httpSec.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/usuarios").permitAll()
                .anyRequest().authenticated()
                .and().cors();
        httpSec.addFilterBefore(new SecurityFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}