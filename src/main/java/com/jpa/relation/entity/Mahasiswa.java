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
@Table(name="mahasiswa")
public class Mahasiswa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long nim; 
	private String password;
	private String jenis_kelamin;
	private String nama_mahasiswa;
	public void setDosen(List<Dosen> listdosen) {
		// TODO Auto-generated method stub
		
	}
	public void setMatakuliah(List<MataKuliah> listmatakuliah) {
		// TODO Auto-generated method stub
		
	}
	
/*							Tabel Mahasiswa - Dosen
 
 
  	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(
			name="PlotMataKuliah",
			joinColumns = { 
					
					@JoinColumn(name="npm", referencedColumnName="nim")},
					
			inverseJoinColumns= { 
					@JoinColumn(name = "dosen_id", referencedColumnName="id_dosen")}	)
	
		
		private Set<Dosen> dosen = new HashSet<Dosen>();


	
/*						//Tabel Mahasiswa - Matkul
	
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(
			name="PlotMataKuliah",
			joinColumns = { 
					
					@JoinColumn(name="npm", referencedColumnName="nim")},
					
			inverseJoinColumns= { 
					@JoinColumn(name = "matkul_id", referencedColumnName="id_matkul")}	)
	
		
		private Set<MataKuliah> matakuliah = new HashSet<MataKuliah>();

	*/
}
