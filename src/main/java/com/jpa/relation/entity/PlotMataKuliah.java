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
@Table(name="plot mata kuliah")
public class PlotMataKuliah {
	@Id
	private long plotMK_id; 
	private long dosen_id;
	private long npm;
	private long mahasiswa_id;


}
