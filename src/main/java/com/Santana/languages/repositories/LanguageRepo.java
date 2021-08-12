package com.Santana.languages.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Santana.languages.models.Language;

@Repository
public interface LanguageRepo extends CrudRepository<Language, Long>{

}
