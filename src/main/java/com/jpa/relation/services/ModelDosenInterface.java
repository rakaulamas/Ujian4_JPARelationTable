package com.jpa.relation.services;

import java.util.List;

import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.Mahasiswa;


public interface ModelDosenInterface {

	public List<Dosen> getAllDosens();
	public Dosen getDosenByName(String name);
	public Dosen addDosen(Dosen dosen);
	public Dosen getDosenById(String id);
	public void deleteDosen(String id);
}
