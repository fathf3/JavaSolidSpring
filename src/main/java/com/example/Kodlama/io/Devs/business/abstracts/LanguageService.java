package com.example.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.example.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;

public interface LanguageService {
	
	List<ProgramingLanguage> getAll();
	ProgramingLanguage getById(int id);
	void add(ProgramingLanguage language) throws Exception;
	void update(ProgramingLanguage language);
	void delete(int id);
}	
