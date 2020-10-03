package com.boot.computer.configuration;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

	@Bean
	public ResourceBundle getResourceBundle() {
		return ResourceBundle.getBundle("messages") ;
	}
}
