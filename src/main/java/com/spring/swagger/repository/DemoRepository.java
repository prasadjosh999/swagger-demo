package com.spring.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.swagger.entity.Demo;

@Repository
public interface DemoRepository extends JpaRepository<Long, Demo>{
	
	

}
