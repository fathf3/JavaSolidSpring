package com.example.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.example.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.example.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {

		List<ProgrammingLanguage> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();
		for (ProgrammingLanguage language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponse.add(responseItem);
		}
		return languagesResponse;
	}

	@Override
	public void add(CreateLanguageRequest languageRequest) throws Exception {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setName(languageRequest.getName());

		if (checkName(languageRequest.getName())) {

			languageRepository.save(language);
		} else {
			throw new Exception("NOOOOOOOOOOOOOOOOO");
		}
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return languageRepository.findById(id);
	}

	@Override
	public void delete(int id) {

		languageRepository.deleteById(id);

	}

	@Override
	public void update(UpdateLanguageRequest languageRequest, int id) {
		ProgrammingLanguage language = languageRepository.findById(id);
		if (language.getName().equals(languageRequest.getName())) {
			System.out.println("Ayni isimde var");
		}

		language.setName(languageRequest.getName());
		this.languageRepository.save(language);

	}

	boolean checkName(String name) {
		List<ProgrammingLanguage> languages = languageRepository.findAll();
		for (ProgrammingLanguage language : languages) {
			if (language.getName().equals(name)) {
				return false;
			}
		}

		if (name == null || name.trim() == "") {

			return false;
		} else {
			return true;
		}

	}

}
