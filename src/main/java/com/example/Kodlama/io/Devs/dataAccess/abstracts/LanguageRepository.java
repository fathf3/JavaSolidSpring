package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.example.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;


public interface LanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {

	void save(CreateLanguageRequest languageRequest);
	ProgrammingLanguage findById(int id);
	
}
