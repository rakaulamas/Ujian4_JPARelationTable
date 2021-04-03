package com.jpa.relation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="pertanyaan")
public class Pertanyaan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_pertanyaan; 
	private long id_soal;
	private String pertanyaan;
	private String jawaban1;
	private String jawaban2;
	private String jawabanBenar;
	private int statusGambar;
}
