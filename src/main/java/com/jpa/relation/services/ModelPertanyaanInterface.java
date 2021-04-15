package com.jpa.relation.services;

import java.util.List;

import com.jpa.relation.entity.MataKuliah;
import com.jpa.relation.entity.Pertanyaan;

public interface ModelPertanyaanInterface {

	public List<Pertanyaan> getAllPertanyaan();
	
	public Pertanyaan addPertanyaan (Pertanyaan pertanyaan);
	
	public void deletePertanyaan(String id);
	
	public Pertanyaan cariPertanyaan(String id);
}
