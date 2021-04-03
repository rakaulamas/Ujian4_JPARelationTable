package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="matkul")
public class MataKuliah {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_matkul;
	private String nama_matkul;
	
	
//	dari tabel Mahasiswa-Matkul
	@ManyToMany(mappedBy = "matkul")
	private List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
	
	
//	dari tabel Dosen-Matkul
	@ManyToMany(mappedBy = "matkul")
	private List<Dosen> dosen = new ArrayList<Dosen>();
	
	
}
