package com.example.Kodlama.io.Devs.entites.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="technologies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LanguageTechnology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "technology_id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	
	@ManyToOne
	@JoinColumn(name="language_id")
	public ProgrammingLanguage programmingLanguage;
	
}
