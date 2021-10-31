package com.example.demo.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import com.example.demo.model.Person;

@Data
@RequiredArgsConstructor
public class PersonAddressDto {
	// Person Fields
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@NonNull
	private int age;
	// Address Fields
	@NonNull
	private int streetNumber;
	@NonNull
	private String streetAddress;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private String zipcode;
	
	public Person getPerson() {
		return new Person(firstName, lastName, age);
	}
	
	public Address getAddress() {
		return new Address(streetNumber, streetAddress, city, state, zipcode);
	}
}
