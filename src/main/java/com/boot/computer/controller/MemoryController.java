package com.boot.computer.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.computer.model.Memory;
import com.boot.computer.service.MemoryService;

@RestController
@RequestMapping("/memory3")
public class MemoryController {
	
	@Autowired
	private MemoryService service;

//	@GetMapping("/{speed}")
	public Memory findMemoryWithSPeed(@PathVariable final int speed) {
		return service.findByMemSpeed(speed);
		System.out.println("local has added this line ");
	}
	
	@GetMapping("/all")
	public List<Memory> findAll() {
		return service.findAll() ;
	}
	
	@GetMapping("/test")
	public String  pu(@RequestHeader Map<String,String> headers) {
		String result = "hello 1";
		result = "istanbul ";
//		headers.forEach((k,v) -> System.out.println(k + " " + v));
		return result + UUID.randomUUID();
	}
	
	
}
