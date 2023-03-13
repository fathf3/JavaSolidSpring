package com.example.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.example.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import com.example.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/lang")
public class LanguageController {
	
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception 
	{
		languageService.add(createLanguageRequest);
	}


	@PutMapping("/update/{id}")
	public void update(UpdateLanguageRequest language, int id) 
	{
		languageService.update(language, id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) 
	{
		languageService.delete(id);
	}

	@GetMapping("/get/all")
	public List<GetAllLanguagesResponse> getAll() 
	{
		return languageService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public ProgrammingLanguage getById(@PathVariable (name = "id") int id ) 
	{
		return languageService.getById(id);
	}
	
	
}	


