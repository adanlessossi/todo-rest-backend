/**
 * 
 */
package com.businessdecision.rest.security.basic;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Configuration for Basic Authorization.
 * 
 * @author bernard.adanlessossi
 *
 */
//@Configuration
//@EnableWebSecurity
public class SpringSecurityBasicAuth {//extends WebSecurityConfigurerAdapter {

//	Adapted from
//	{@ link WebSecurityConfigurerAdapter}

//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest()
//				.authenticated().and().httpBasic();
//	}
}
