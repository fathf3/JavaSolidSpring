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

import com.example.Kodlama.io.Devs.business.abstracts.TechnologyService;
import com.example.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import com.example.Kodlama.io.Devs.entites.concretes.LanguageTechnology;

@RestController
@RequestMapping("/api/tech")
public class TechnologyController {
	
	private TechnologyService technologyService;

	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		
		this.technologyService = technologyService;
	}
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest createLanguageRequest) throws Exception 
	{
		technologyService.add(createLanguageRequest);
	}


	@PutMapping("/update/{id}")
	public void update(UpdateTechnologyRequest updateTechnologyRequest, int id) 
	{
		technologyService.update(updateTechnologyRequest, id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) 
	{
		technologyService.delete(id);
	}

	@GetMapping("/get/all")
	public List<GetAllTechnologiesResponse> getAll() 
	{
		return technologyService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public LanguageTechnology getById(@PathVariable (name = "id") int id ) 
	{
		return technologyService.getById(id);
	}
	
	
	
	
	
}
