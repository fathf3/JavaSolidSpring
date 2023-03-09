package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;



import com.example.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;


public interface LanguageRepository {
	List<ProgramingLanguage> getAll() ;
	ProgramingLanguage getById(int id);
	
	void add(ProgramingLanguage language);
	void delete(int id);
	void update(ProgramingLanguage language);
}
