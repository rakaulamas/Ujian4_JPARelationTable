package com.jpa.relation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.Mahasiswa;
import com.jpa.relation.repo.DosenRepo;

@Service
public class ModelDosen implements ModelDosenInterface {

	@Autowired
	DosenRepo dosenRepo;

	@Override
	public List<Dosen> getAllDosens() {
		return (List<Dosen>) this.dosenRepo.findAll();
	}

	@Override
	public Dosen getDosenByName(String name) {
		return this.dosenRepo.findByNamaDosen(name);
	}

	@Override
	public Dosen addDosen(Dosen dosen) {
		// TODO Auto-generated method stub
		return this.dosenRepo.save(dosen);
	}

	@Override
	public Dosen getDosenById(String id) {
		// TODO Auto-generated method stub
		
		return ((Dosen) this.dosenRepo.findByIdDosen(Long.parseLong(id)));
	}

	@Override
	public void deleteDosen(String id) {
		// TODO Auto-generated method stub
		this.dosenRepo.deleteById(Long.parseLong(id));
		
	}
	

	

	

	
	
}