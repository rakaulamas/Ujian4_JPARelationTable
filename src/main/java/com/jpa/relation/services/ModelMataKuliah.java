package com.jpa.relation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.MataKuliah;
import com.jpa.relation.repo.MataKuliahRepo;

@Service
public class ModelMataKuliah implements ModelMatakuliahInterface {
	
	@Autowired
	MataKuliahRepo matkulRepo;

	@Override
	public List<MataKuliah> getAllMataKuliah() {
		return (List<MataKuliah>) this.matkulRepo.findAll();
	}

	@Override
	public MataKuliah getMataKuliahByName(String name) {
		return this.matkulRepo.findByNamaMatkul(name);
	}

	@Override
	public MataKuliah addMataKuliah(MataKuliah matakuliah) {
		return this.matkulRepo.save(matakuliah);
	}

	@Override
	public MataKuliah getMataKuliahById(String id) {
		return ((MataKuliah) this.matkulRepo.findByIdMatkul(Long.parseLong(id)));
	}

	@Override
	public void deleteMataKuliah(String id) {
		this.matkulRepo.deleteById(Long.parseLong(id));
	}
	

}
