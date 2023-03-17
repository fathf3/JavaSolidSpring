package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.example.Kodlama.io.Devs.entites.concretes.LanguageTechnology;

public interface TechnologyRepository  extends JpaRepository<LanguageTechnology, Integer>{
	
	void save(CreateTechnologyRequest createTechnologyRequest);
	LanguageTechnology findById(int id);
}
