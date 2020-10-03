package com.boot.computer.service;

import java.util.List;

import com.boot.computer.model.Memory;

public interface MemoryService {

	public Memory findById(Long id);
	
	public Memory findByMemSpeed(int speed) ;
	
	public void save(Memory memory);
	
	public List<Memory> findAll();
}
