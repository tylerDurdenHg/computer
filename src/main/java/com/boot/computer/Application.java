package com.boot.computer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boot.computer.model.Memory;
import com.boot.computer.service.MemoryService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired()
	private MemoryService service;
	
	@Override
	public void run(String... args) throws Exception {
//		Memory memory = new Memory("DDR",1200);
//		service.save(memory);
//		
//		Memory memory2 = new Memory("STC",6200);
//		service.save(memory2);
		System.out.println("hg was asfa  asa tewt  ") ;
		LOG.info("NOW ok we are here  WORKING !!!");
	}

	
}
