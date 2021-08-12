package com.Santana.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Santana.languages.models.Language;
import com.Santana.languages.services.LanguageService;

@Controller
public class LanguageController {
//	--------------------MemberVariables-------------------------//
	private final LanguageService languageService;
	
//	--------------------MemberVariables End---------------------//
	
//	Constructor (initializing)
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
//	-------------------Routes----------------------------------//
	
	@GetMapping("/languages")
	public String dashboard(@ModelAttribute("language") Language language, Model model) {
		List<Language> languages = languageService.getAll();
		model.addAttribute("langs", languages);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String newLang(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		this.languageService.insertNew(language);
		return"redirect:/languages";
	}
	
	@GetMapping("/languages/{id}")
	public String view(@PathVariable("id") Long id, Model model) {
		Language l = this.languageService.getLanguageById(id);
		model.addAttribute("singleLang", l);
		return "view.jsp";
	}
	
	@GetMapping ("/languages/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		this.languageService.delete(id);
		return"redirect:/languages";
	}
	
	@GetMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id,Model model ) {
		Language l = this.languageService.getLanguageById(id);
		model.addAttribute("language", l);
		return "edit.jsp";
	}
	
	@PostMapping("/languages/{id}")
	public String update(@PathVariable("id") Long id,@Valid @ModelAttribute ("language") Language language ,BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		this.languageService.update(language);
		return "redirect:/languages";
	}
	
}
