package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import com.example.library.security.MyCorsFilter;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
	@Bean
	public FilterRegistrationBean myFilter() {
	FilterRegistrationBean registration = new FilterRegistrationBean();
	MyCorsFilter myFilter = new MyCorsFilter();
	registration.setFilter(myFilter);
	registration.addUrlPatterns("/*");
	registration.setOrder(-1000);
	return registration;
	}

}
