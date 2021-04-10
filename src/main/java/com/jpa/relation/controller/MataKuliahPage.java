package com.jpa.relation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.MataKuliah;
import com.jpa.relation.services.ModelMataKuliah;

@Controller
public class MataKuliahPage {

	@Autowired
	ModelMataKuliah modelMatkul;
	
	@GetMapping("/matkul/view")
	public String viewMatkul(Model model) {
		model.addAttribute("listMatkul",modelMatkul.getAllMataKuliah());
		return "view_matakuliah";
	}
	
	@GetMapping("/matkul/add")
	public String viewAddMatkul(Model model) {
		
		// untuk menampung data mahasiswa di halaman html nya.
		model.addAttribute("matakuliah", new MataKuliah());
		return "add_matakuliah";
	}
	
	@PostMapping("/matkul/view")
	public String addMatkul(@ModelAttribute MataKuliah matakuliah, Model model) {
		
		// untuk menampung data mahasiswa di halaman html nya.
		this.modelMatkul.addMataKuliah(matakuliah);
		model.addAttribute("listMatkul", modelMatkul.getAllMataKuliah());
		return "redirect:/matkul/view";
	}
	
	@GetMapping("/matkul/update/{id}")
	public String viewUpdateMatkul(@PathVariable String id, Model model) {
		
		MataKuliah matakuliah = modelMatkul.getMataKuliahById(id);
		// untuk menampung data mahasiswa di halaman html nya.
		model.addAttribute("matakuliah", matakuliah);
		return "add_matakuliah";
	}
	
	@GetMapping("/matkul/delete/{id}")
	public String deleteMatkul(@PathVariable String id, Model model) {
		
		MataKuliah matakuliah = modelMatkul.getMataKuliahById(id);
		// untuk menampung data mahasiswa di halaman html nya.
		
		this.modelMatkul.deleteMataKuliah(id);
		model.addAttribute("listMatkul", modelMatkul.getAllMataKuliah());
		return "view_matakuliah";
	}
	
	
}
