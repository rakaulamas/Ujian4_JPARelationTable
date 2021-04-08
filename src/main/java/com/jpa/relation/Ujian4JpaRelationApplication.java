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
import com.jpa.relation.entity.Nilai;
import com.jpa.relation.entity.Pertanyaan;
import com.jpa.relation.entity.PlotMataKuliah;
import com.jpa.relation.entity.Soal;
import com.jpa.relation.repo.AdminRepo;
import com.jpa.relation.repo.DosenRepo;
import com.jpa.relation.repo.MahasiswaRepo;
import com.jpa.relation.repo.MataKuliahRepo;
import com.jpa.relation.repo.PlotMataKuliahRepo;
import com.jpa.relation.repo.SoalRepo;


@SpringBootApplication
public class Ujian4JpaRelationApplication implements CommandLineRunner {

	@Autowired
	private PlotMataKuliahRepo plotMK;
	
	@Autowired
	private SoalRepo soalRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Ujian4JpaRelationApplication.class, args);
	}

			
		@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				
			
			
			
/*			PlotMataKuliah plotMK = new PlotMataKuliah();
				
				
			Mahasiswa mahasiswa = new Mahasiswa();
			mahasiswa.setNamaMahasiswa("Diki");
			mahasiswa.setJenisKelamin("Pria");
			mahasiswa.setNim("02");
			mahasiswa.setPassword("dikibulin");
			plotMK.setMahasiswa(mahasiswa);
			
			Dosen dosen = new Dosen();
			dosen.setNamaDosen("Roby");
			dosen.setUsername("roby");
			dosen.setPassword("chan");
			plotMK.setDosen(dosen);
			
			
			MataKuliah matakuliah = new MataKuliah();
			matakuliah.setNamaMatkul("Hardware");
			plotMK.setMatakuliah(matakuliah);
			
			List<Soal> lstSoal = new ArrayList<Soal>();
			
			Soal soal1 = new Soal();
			soal1.setNamaSoal("Soal Quiz 1");
			soal1.setStatus(1);
			
			Nilai nilai = new Nilai();
			nilai.setNilai("100");
			soal1.setNilai(nilai);
			
			Pertanyaan pertanyaan1 = new Pertanyaan();
			pertanyaan1.setPertanyaan("Siapakah Dewa Kipas?");
			pertanyaan1.setJawaban1("Robot");
			pertanyaan1.setJawaban2("Utuy");
			pertanyaan1.setJawaban3("Dadang");
			pertanyaan1.setJawaban4("Salah Semua");
			pertanyaan1.setJawabanBenar("3");
			pertanyaan1.setStatusGambar("https://akcdn.detik.net.id/community/media/visual/2021/03/19/dadang-subur-dewa-kipas_169.jpeg?w=700&q=80");
			
			List<Pertanyaan> lstPertanyaan = new ArrayList<Pertanyaan>();
			lstPertanyaan.add(pertanyaan1);
			soal1.setLstPertanyaan(lstPertanyaan);
			
		
			lstSoal.add(soal1);
			
			plotMK.setLstSoal(lstSoal);
			this.plotMK.save(plotMK);
			
			
			Soal soalx = this.soalRepo.findByNamaSoal("Soal Quiz 1");
			System.out.println(soalx.getNamaSoal());
	*/

		}
}

