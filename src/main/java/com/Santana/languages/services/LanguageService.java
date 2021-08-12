package com.Santana.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Santana.languages.models.Language;
import com.Santana.languages.repositories.LanguageRepo;

@Service
public class LanguageService {
//-------------------------------------------------------------MemberVariable start--------------------------------------------------------------//
private final LanguageRepo languageRepo;

//-------------------------------------------------------------MemberVariable end----------------------------------------------------------------//
	
//	Constructor
	public LanguageService (LanguageRepo languageRepo) {
		this.languageRepo = languageRepo;
	}
	
//	-----------------------------------------------------------Methods----------------------------------------------------------------------------//
	public List<Language> getAll(){
		return (List<Language>)languageRepo.findAll();
	}
	
	public Language getLanguageById(Long id) {
		return this.languageRepo.findById(id).orElse(null);
	}
	
	public Language insertNew(Language newEntry) {
		return this.languageRepo.save(newEntry);
	}
	
	public Language update(Language updateEntry) {
		return this.languageRepo.save(updateEntry);
	}
	
	public void delete(Long id) {
		this.languageRepo.deleteById(id);
	}
}
