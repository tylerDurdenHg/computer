package com.boot.computer.controller;

import java.util.Locale;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageBundle")
public class MessageBundleConroller {

	private static final Logger LOGGER = LoggerFactory.getLogger(MessageBundleConroller.class) ;
	
	@Autowired
	private ResourceBundle bundle;
	
	@GetMapping
	public String getMessage() {
		LOGGER.info("===****=====", Locale.getDefault());
		return bundle.getString("userName") ;
	}
	
}
