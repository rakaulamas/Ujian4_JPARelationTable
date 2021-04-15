package com.jpa.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relation.entity.MataKuliah;
import com.jpa.relation.entity.Pertanyaan;

public interface PertanyaanRepo extends JpaRepository<Pertanyaan, Long>{
	
	
		
}
