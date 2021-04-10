package com.jpa.relation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.Mahasiswa;
import com.jpa.relation.services.ModelDosen;

@Controller
public class DosenPage {

	@Autowired
	ModelDosen modelDosen;
	
	@GetMapping("/dosen/view")
	public String viewDosen(Model model) {
		model.addAttribute("listDosen",modelDosen.getAllDosens());
		return "view_dosen";
	}
	
	@GetMapping("/dosen/add")
	public String viewAddDosen(Model model) {
		
		// untuk menampung data mahasiswa di halaman html nya.
		model.addAttribute("dosen", new Dosen());
		return "add_dosen";
	}
	
	@PostMapping("/dosen/view")
	public String addDosen(@ModelAttribute Dosen dosen, Model model) {
		
		// untuk menampung data mahasiswa di halaman html nya.
		this.modelDosen.addDosen(dosen);
		model.addAttribute("listDosen", modelDosen.getAllDosens());
		return "redirect:/dosen/view";
	}
	
	@GetMapping("/dosen/update/{id}")
	public String viewUpdateDosen(@PathVariable String id, Model model) {
		
		Dosen dosen = modelDosen.getDosenById(id);
		// untuk menampung data mahasiswa di halaman html nya.
		model.addAttribute("dosen", dosen);
		return "add_dosen";
	}
	
	@GetMapping("/dosen/delete/{id}")
	public String deleteDosen(@PathVariable String id, Model model) {
		
		Dosen dosen = modelDosen.getDosenById(id);
		// untuk menampung data mahasiswa di halaman html nya.
		
		this.modelDosen.deleteDosen(id);
		model.addAttribute("listDosen", modelDosen.getAllDosens());
		return "view_dosen";
	}
	
}
