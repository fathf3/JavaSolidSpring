package com.example.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.example.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import com.example.Kodlama.io.Devs.entites.concretes.LanguageTechnology;

public interface TechnologyService {
	
	List<GetAllTechnologiesResponse> getAll();
	void add(CreateTechnologyRequest technologyRequest) throws Exception;
	void delete(int id);
	void update(UpdateTechnologyRequest technologyRequest,int id);
	LanguageTechnology getById(int id);
	
}
