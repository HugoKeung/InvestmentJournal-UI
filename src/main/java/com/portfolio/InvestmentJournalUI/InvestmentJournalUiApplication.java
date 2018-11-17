package com.portfolio.InvestmentJournalUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;

//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@EnableZuulProxy
@SpringBootApplication

public class InvestmentJournalUiApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(InvestmentJournalUiApplication.class, args);
	}

}
