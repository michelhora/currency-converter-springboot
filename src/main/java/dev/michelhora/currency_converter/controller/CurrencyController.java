package dev.michelhora.currency_converter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dev.michelhora.currency_converter.dao.CurrencyDAO;
import dev.michelhora.currency_converter.model.CurrencyConverter;

@Controller
public class CurrencyController {
	
	@Autowired
	private CurrencyDAO dao;
	
	public CurrencyController() {
		dao = new CurrencyDAO();
	}

	@GetMapping("/greeting")
	  public String greetingForm(Model model) {
	    model.addAttribute("greeting", new CurrencyConverter());
	    return "greeting";
	  }
	
	 @PostMapping("/greeting")
	  public String greetingSubmit(@ModelAttribute CurrencyConverter greeting, Model model) {
	    model.addAttribute("greeting", greeting);
	    model.addAttribute("converted", dao.converter(greeting));
	   
	   
	    
	    return "result";
	  }
}
