package com.portfolio.InvestmentJournalUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@EnableZuulProxy
@SpringBootApplication
@EnableOAuth2Sso
public class InvestmentJournalUiApplication extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
	      http
          .logout().logoutSuccessUrl("/").and()
          .authorizeRequests().antMatchers("/index.html", "/app.html", "/")
          .permitAll().anyRequest().authenticated().and()
          .csrf()
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
	}

	public static void main(String[] args) {
		SpringApplication.run(InvestmentJournalUiApplication.class, args);
	}
}
