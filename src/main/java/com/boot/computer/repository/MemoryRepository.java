package com.boot.computer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.computer.model.Memory;

public interface MemoryRepository extends JpaRepository<Memory, Long>{
	
	public Memory findByMemSpeed(int speed);
}
