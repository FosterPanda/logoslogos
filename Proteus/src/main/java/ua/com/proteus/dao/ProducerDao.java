package ua.com.proteus.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.proteus.entity.Producer;

public interface ProducerDao extends JpaRepository<Producer, Integer>, JpaSpecificationExecutor<Producer> {
	
	Producer findByCodeName(String codeName);
}
