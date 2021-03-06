package ua.com.proteus.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.proteus.entity.Memory;

public interface MemoryDao extends JpaRepository<Memory, Integer>, JpaSpecificationExecutor<Memory> {
	
	Memory findByType(String type);
}
