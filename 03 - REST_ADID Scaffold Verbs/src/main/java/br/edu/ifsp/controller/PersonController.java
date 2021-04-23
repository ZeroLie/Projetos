package br.edu.ifsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.model.Person;
import br.edu.ifsp.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	// private PersonServices person = new PersonServices();
	@Autowired
	private PersonServices services;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll() {
		return services.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)	

	public Person findById(@PathVariable("id") String id) {
		return services.findById(id);
	}
}