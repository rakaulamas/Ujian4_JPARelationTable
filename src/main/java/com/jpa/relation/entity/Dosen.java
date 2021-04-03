package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="dosen")
public class Dosen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_dosen; 
	private String username;
	private String password;
	private String nama_dosen;

	//	dari Mahasiswa-Dosen
	@ManyToMany(mappedBy = "dosen")
	private Set<Mahasiswa> mahasiswa = new HashSet<Mahasiswa>();
	
	
					//Tabel Dosen - Matakuliah
	
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(
			name="Plot Mata Kuliah",
			joinColumns = { 
					
					@JoinColumn(name="dosen_id", referencedColumnName="id_dosen")},
					
			inverseJoinColumns= { 
					@JoinColumn(name = "matkul_id", referencedColumnName="id_matkul")}	)
	
		
		private Set<Dosen> dosen = new HashSet<Dosen>();
	
	
	
	
	
}
