package com.boot.computer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.computer.model.Memory;
import com.boot.computer.repository.MemoryRepository;

@Service
public class MemoryServiceImpl implements MemoryService {

	@Autowired
	private MemoryRepository repo;
	
	@Override
	public Memory findById(Long id) {
		Optional<Memory> found = repo.findById(id);
		return found.get();
	}

	@Override
	public Memory findByMemSpeed(int speed) {
		return repo.findByMemSpeed(speed);
	}

	@Override
	public void save(Memory memory) {
		repo.save(memory) ;
	}
	
	public List<Memory> findAll() {
		return repo.findAll();
	}

}
