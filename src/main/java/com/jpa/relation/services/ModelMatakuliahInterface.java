package com.jpa.relation.services;

import java.util.List;

import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.MataKuliah;

public interface ModelMatakuliahInterface {
	
	public List<MataKuliah> getAllMataKuliah();
	public MataKuliah getMataKuliahByName(String name);
	public MataKuliah addMataKuliah(MataKuliah matakuliah);
	public MataKuliah getMataKuliahById(String id);
	public void deleteMataKuliah(String id);
}
