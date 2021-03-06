
package com.jpa.relation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.relation.entity.Mahasiswa;
import com.jpa.relation.repo.MahasiswaRepo;


 @Service
 
public class ModelMahasiswa implements ModelMahasiswaInterface {

	@Autowired
	MahasiswaRepo mahasiswaRepo;

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		// TODO Auto-generated method stub
		return (List<Mahasiswa>) this.mahasiswaRepo.findAll();
	}

	@Override
	public Mahasiswa getMahasiswaByName(String name) {
		// TODO Auto-generated method stub
		return this.mahasiswaRepo.findByNamaMahasiswa(name);
	}

	@Override
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		return this.mahasiswaRepo.save(mahasiswa);
	}

	@Override
	public Mahasiswa getMahasiswaById(String id) {
		// TODO Auto-generated method stub
		
		return ((Mahasiswa) this.mahasiswaRepo.findByIdMahasiswa(Long.parseLong(id)));
	}

	@Override
	public void deleteMahasiswa(String id) {
		// TODO Auto-generated method stub
		this.mahasiswaRepo.deleteById(Long.parseLong(id));
		
	}

	

	

	

	

	
}

