package com.jpa.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relation.entity.Soal;

public interface SoalRepo extends JpaRepository<Soal, Long>{

		public Soal findByNamaSoal(String nama);
}
