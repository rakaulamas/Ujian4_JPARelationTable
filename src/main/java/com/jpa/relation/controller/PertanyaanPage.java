package com.jpa.relation.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.relation.entity.MataKuliah;
import com.jpa.relation.entity.Pertanyaan;
import com.jpa.relation.services.ModelPertanyaan;
import com.jpa.relation.utility.FileUtility;


@Controller
public class PertanyaanPage {

	@Autowired
	ModelPertanyaan modelPertanyaan;
	
	private final String UPLOAD_DIR = "./src/main/resources/static/uploads/";
	
	@GetMapping("/pertanyaan/view")
	public String viewPertanyaan(Model model) {
		model.addAttribute("listPertanyaan",modelPertanyaan.getAllPertanyaan());
		return "view_pertanyaan";
	}
	
	@GetMapping("/pertanyaan/add")
	public String viewAddPertanyaan(Model model) {
		
		// untuk menampung data mahasiswa di halaman html nya.
		model.addAttribute("pertanyaan", new Pertanyaan());
		return "add_pertanyaan";
	}
	
	@PostMapping("/pertanyaan/view")
	public String addPertanyaan(@RequestParam(value = "file")MultipartFile file,@ModelAttribute Pertanyaan pertanyaan, Model model) { 
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		System.out.println(file.getOriginalFilename());
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            Path path = Paths.get(UPLOAD_DIR + fileName);
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
	 
        pertanyaan.setStatusGambar("/uploads/" + fileName);
        this.modelPertanyaan.addPertanyaan(pertanyaan);

		model.addAttribute("pertanyaan", new Pertanyaan());
		return "redirect:/pertanyaan/view";
	  }
	
		
	@GetMapping("/pertanyaan/update/{id}")
	public String viewUpdatePertanyaan(@PathVariable String id, Model model) {
		
		Pertanyaan pertanyaan = modelPertanyaan.cariPertanyaan(id);
		// untuk menampung data mahasiswa di halaman html nya.
		model.addAttribute("pertanyaan", pertanyaan);
		return "add_pertanyaan";
	}
	
	@GetMapping("/pertanyaan/delete/{id}")
	public String deletePertanyaan(@PathVariable String id, Model model) {
		
		this.modelPertanyaan.deletePertanyaan(id);
		
		return "view_pertanyaan";
	}
	
	
}
