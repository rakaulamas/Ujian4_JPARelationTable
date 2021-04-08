package com.jpa.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.relation.entity.Mahasiswa;

public interface MahasiswaRepo extends JpaRepository<Mahasiswa, Long>{
		
	public Mahasiswa findByNamaMahasiswa(String name);
	
	public Mahasiswa findByIdMahasiswa(Long id);
}
