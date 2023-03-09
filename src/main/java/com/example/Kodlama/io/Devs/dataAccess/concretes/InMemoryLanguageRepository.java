package com.example.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.example.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<ProgramingLanguage> languages;
	
	
	public InMemoryLanguageRepository() 
	{
		languages = new ArrayList<ProgramingLanguage>();
		languages.add(new ProgramingLanguage(0, "Java"));
		languages.add(new ProgramingLanguage(1, "C#"));
		languages.add(new ProgramingLanguage(2, "Pyhton"));
		languages.add(new ProgramingLanguage(3, "Php"));
	}
	

	@Override
	public List<ProgramingLanguage> getAll() {
		return languages;
	}

	@Override
	public ProgramingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return languages.get(id);
	}

	@Override
	public void add(ProgramingLanguage language) {
		languages.add(language);
		
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
		
	}

	@Override
	public void update(ProgramingLanguage language) {
		languages.set(language.getId(), language);
		
	}

}
