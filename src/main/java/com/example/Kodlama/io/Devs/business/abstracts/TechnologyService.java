package com.example.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.example.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;

public interface TechnologyService {
	
	List<GetAllTechnologiesResponse> getAll();
	void add(CreateTechnologyRequest technologyRequest);
	
}
