package com.example.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Kodlama.io.Devs.business.abstracts.TechnologyService;
import com.example.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import com.example.Kodlama.io.Devs.entites.concretes.LanguageTechnology;

@Service
public class TechnologyManager  implements TechnologyService{
	
	private TechnologyRepository repository;

	public TechnologyManager(TechnologyRepository repository) {
		
		this.repository = repository;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<LanguageTechnology> technologies = repository.findAll();
		List<GetAllTechnologiesResponse> technologiesResponses = new ArrayList<GetAllTechnologiesResponse>();
		for (LanguageTechnology technology: technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			technologiesResponses.add(responseItem);
	
			
		}
		return technologiesResponses;
	
	}

	@Override
	public void add(CreateTechnologyRequest technologyRequest) throws Exception {
		LanguageTechnology technology = new LanguageTechnology();
		technology.setName(technologyRequest.getName());

		if (checkName(technologyRequest.getName())) {

			repository.save(technologyRequest);
		} else {
			throw new Exception("NOOOOOOOOOOOOOOOOO");
		}
		
	}
	
	@Override
	public void update(UpdateTechnologyRequest technologyRequest, int id) {
		LanguageTechnology technology = repository.findById(id);
		if (technology.getName().equals(technologyRequest.getName())) {
			System.out.println("Ayni isimde var");
		}

		technology.setName(technologyRequest.getName());
		this.repository.save(technology);

	}
	
	@Override
	public void delete(int id) {
		repository.deleteById(id);
		
	}
	
	@Override
	public LanguageTechnology getById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	
	
	boolean checkName(String name) {
		List<LanguageTechnology> technologies = repository.findAll();
		for (LanguageTechnology technology : technologies) {
			if (technology.getName().equals(name)) {
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
