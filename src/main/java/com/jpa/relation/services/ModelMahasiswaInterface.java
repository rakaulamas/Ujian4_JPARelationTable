package com.jpa.relation.services;

import java.util.List;

import com.jpa.relation.entity.Mahasiswa;


 public interface ModelMahasiswaInterface {

		public List<Mahasiswa> getAllMahasiswa();
		public Mahasiswa getMahasiswaByName(String name);
		
		public Mahasiswa addMahasiswa(Mahasiswa mahasiswa);
		
}
