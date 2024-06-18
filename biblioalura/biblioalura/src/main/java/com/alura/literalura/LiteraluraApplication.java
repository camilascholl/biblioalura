package com.alura.biblioalura;

import com.alura.biblioalura.principal.Principal;
import com.alura.biblioalura.repository.BookRepository;
import com.alura.biblioalura.service.BookService;
import com.alura.biblioalura.service.LanguageService;
import com.alura.biblioalura.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BiblioaluraApplication implements CommandLineRunner {
	@Autowired
	private BookService service;
	@Autowired
	private PersonService personService;
	@Autowired
	private LanguageService languageService;

	public static void main(String[] args) {
		SpringApplication.run(BiblioaluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(service, personService, languageService);
		principal.exibeMenu();
	}
}
