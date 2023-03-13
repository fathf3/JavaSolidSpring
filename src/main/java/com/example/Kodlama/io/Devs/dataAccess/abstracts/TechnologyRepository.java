package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Kodlama.io.Devs.entites.concretes.LanguageTechnology;

public interface TechnologyRepository  extends JpaRepository<LanguageTechnology, Integer>{

}
