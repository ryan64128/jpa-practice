package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.model.Person;
import com.example.demo.model.PersonAddressDto;
import com.example.demo.repo.AddressRepo;
import com.example.demo.repo.PersonRepo;

@RestController
public class PersonController {
	@Autowired
	private PersonRepo repo;
	@Autowired
	private AddressRepo addressRepo;
	
	@GetMapping("/")
	public List<Person> getPersons() {
		List<Person> personsList = repo.findAll();
		System.out.println("Person = " + personsList.size());
		return personsList;
	}
	
	@PostMapping("/")
	public Person addPerson(@RequestBody PersonAddressDto personAddressDto) {
		Address address = personAddressDto.getAddress();
		Person person = personAddressDto.getPerson();
		address.setPerson(person);
		person = repo.save(person);
		addressRepo.save(address);
		return person;
	}
}
