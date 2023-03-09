package com.example.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;

@RestController
@RequestMapping("/api/lang")
public class LanguageController {
	
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody ProgramingLanguage language) throws Exception 
	{
		languageService.add(language);
	}


	@PutMapping("/update")
	public void update(@RequestBody ProgramingLanguage language) 
	{
		languageService.update(language);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) 
	{
		languageService.delete(id);
	}

	@GetMapping("/get/all")
	public List<ProgramingLanguage> getAll() 
	{
		return languageService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public ProgramingLanguage getById(@PathVariable (name = "id") int id ) 
	{
		return languageService.getById(id);
	}
	
	
}	


