
package com.jpa.relation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.relation.repo.MahasiswaRepo;
import com.jpa.relation.services.ModelMahasiswa;

@Controller
public class HomePage {

	
	
	
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		
		return "index";
	}
	
	
		
}
