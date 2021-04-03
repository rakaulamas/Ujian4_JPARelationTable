package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="soal")
public class Soal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_soal; 
	private long id_plotMK;
	private String namaSoal;
	private int status;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "plotMK_id", referencedColumnName ="id_plotMK")
	private List<PlotMataKuliah> plotmatakuliah = new ArrayList<PlotMataKuliah>(); 
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_pertanyaan", referencedColumnName ="id_soal")
	private List<Pertanyaan> pertanyaan = new ArrayList<Pertanyaan>(); 	
	
}
