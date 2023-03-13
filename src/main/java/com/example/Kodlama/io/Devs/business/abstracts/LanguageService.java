package com.example.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.example.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.example.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import com.example.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;


public interface LanguageService {
	
	List<GetAllLanguagesResponse> getAll();
	ProgrammingLanguage getById(int id);
	void add(CreateLanguageRequest languageRequest) throws Exception;
	void delete(int id);
	void update(UpdateLanguageRequest languageRequest,int id);
	
	
}	
