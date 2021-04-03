package com.jpa.relation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.relation.entity.Admin;
import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.Mahasiswa;
import com.jpa.relation.entity.MataKuliah;
import com.jpa.relation.repo.AdminRepo;
import com.jpa.relation.repo.DosenRepo;
import com.jpa.relation.repo.MahasiswaRepo;
import com.jpa.relation.repo.MataKuliahRepo;


@SpringBootApplication
public class Ujian4JpaRelationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Ujian4JpaRelationApplication.class, args);
	}

	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	MahasiswaRepo mhsRepo;
	
	@Autowired
	DosenRepo dosenRepo;
	
	@Autowired
	MataKuliahRepo matkulRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
/*		Admin admin1 = new Admin("Raka","12345678");
		Admin admin2 = new Admin ("Bakti","87654321");
		List<Admin> listadmin = new ArrayList<Admin>();
		listadmin.add(admin1);
		listadmin.add(admin2);
		this.adminRepo.saveAll(listadmin);
		
			Data2 Administrator
*/		
		
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNim(123);
		mahasiswa.setPassword("qwerty");
		mahasiswa.setJenis_kelamin("Laki-laki");
		mahasiswa.setNama_mahasiswa("Budi");
		
		Dosen dosen = new Dosen();
		dosen.setId_dosen(01);
		dosen.setUsername("dadang");
		dosen.setPassword("keluargaituutama");
		dosen.setPassword("thedunk");
		dosen.setNama_dosen("Dadang Surdadang");
		
		Dosen dosen1 = new Dosen();
		dosen1.setId_dosen(02);
		dosen1.setUsername("dudung");
		dosen1.setPassword("aselolejos");
		dosen1.setPassword("asep");
		dosen1.setNama_dosen("Dudung Kasbor");
		
		MataKuliah matakuliah = new MataKuliah();
		matakuliah.setId_matkul(01);
		matakuliah.setNama_matkul("Matematika Dasar");
		
		MataKuliah matakuliah1 = new MataKuliah();
		matakuliah1.setId_matkul(101);
		matakuliah1.setNama_matkul("Sistem Telekomunikasi");
		
		
		
		List<Dosen> listdosen = new ArrayList<Dosen>();
		listdosen.add(dosen);
		listdosen.add(dosen1);
		mahasiswa.setDosen(listdosen);
		
		
		List<Mahasiswa> listmahasiswa = new ArrayList<Mahasiswa>();
		listmahasiswa.add(mahasiswa);
		dosen.setMahasiswa(listmahasiswa);
		dosen1.setMahasiswa(listmahasiswa);
		
		
		List<MataKuliah> listmatakuliah = new ArrayList<MataKuliah>();
		listmatakuliah.add(matakuliah);
		listmatakuliah.add(matakuliah1);
		matakuliah.setMahasiswa(listmahasiswa);
		
		
		
		this.mhsRepo.saveAll(listmahasiswa);
		this.dosenRepo.saveAll(listdosen);
		this.matkulRepo.saveAll(listmatakuliah);
		
		
	}

}
