package com.jpa.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.Mahasiswa;

public interface DosenRepo extends JpaRepository<Dosen, Long>{
	public Dosen findByNamaDosen(String name);
	public Dosen findByIdDosen(Long id);
}
