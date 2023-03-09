package com.example.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;

import com.example.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.example.Kodlama.io.Devs.entites.concretes.ProgramingLanguage;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;
	
	
	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgramingLanguage> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public ProgramingLanguage getById(int id) {
		
		return languageRepository.getById(id);
	}

	@Override
	public void add(ProgramingLanguage language) throws Exception {
		if(checkName(languageRepository.getAll(), language)) {
			languageRepository.add(language);
		}
		throw new Exception("noo");
	}

	@Override
	public void update(ProgramingLanguage language) {
		languageRepository.update(language);
		
	}

	@Override
	public void delete(int id) {
		
		languageRepository.delete(id);
	}
	
	
	boolean checkName(List<ProgramingLanguage> languages,ProgramingLanguage language) {
		
		for (ProgramingLanguage programingLanguage : languages) {
			if(programingLanguage.getName().equals(language.getName())) {
				return false;
			}
		}
		
		
		if(language.getName()== null || language.getName().trim() == "") {
			
			return false;
		}
		else {
			return true;
		}
		
	}

}
