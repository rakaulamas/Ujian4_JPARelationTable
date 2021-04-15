package com.jpa.relation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.relation.entity.MataKuliah;
import com.jpa.relation.entity.Pertanyaan;
import com.jpa.relation.repo.PertanyaanRepo;

@Service
public class ModelPertanyaan implements ModelPertanyaanInterface {

	@Autowired
	PertanyaanRepo pertanyaanRepo;

	@Override
	public List<Pertanyaan> getAllPertanyaan() {
		
		return (List<Pertanyaan>) this.pertanyaanRepo.findAll();
	}


	@Override
	public Pertanyaan addPertanyaan(Pertanyaan pertanyaan) {
		
		return this.pertanyaanRepo.save(pertanyaan);
	}

	

	@Override
	public void deletePertanyaan(String id) {
		this.pertanyaanRepo.deleteById(Long.parseLong(id));
		
	}


	@Override
	public Pertanyaan cariPertanyaan(String id) {
		// TODO Auto-generated method stub
		return this.pertanyaanRepo.findById(Long.parseLong(id)).get();
	}
	
	
}
