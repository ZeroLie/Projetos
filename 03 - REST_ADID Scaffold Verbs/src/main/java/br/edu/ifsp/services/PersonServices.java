package br.edu.ifsp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.edu.ifsp.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Lie");
		person.setLastName("Akamine");
		person.setAddress("Avenida Doce Filho, 1053 - Vila Lago de Dezembro");
		person.setGender("Female");
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0; i < 10; i++ ) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}
	
	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Nome da pessoa " + i);
		person.setLastName("Sobrenome da pessoa " + i);
		person.setAddress("Um endereço qualquer " + i);
		person.setGender("Male");
		return person;
	}
}
