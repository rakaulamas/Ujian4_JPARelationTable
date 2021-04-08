package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="PlotMataKuliah")

public class PlotMataKuliah {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPlotMK;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_dosen")
	private Dosen dosen;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_matakuliah")
	private MataKuliah matakuliah;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_mahasiswa")
	private Mahasiswa mahasiswa;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_plotmatakuliah", referencedColumnName ="idPlotMK")
	private List<Soal> lstSoal = new ArrayList<Soal>(); 
	
}
