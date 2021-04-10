package com.jpa.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.MataKuliah;

public interface MataKuliahRepo extends JpaRepository<MataKuliah, Long> {
	public MataKuliah findByNamaMatkul(String name);
	public MataKuliah findByIdMatkul(Long id);
}
