package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
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
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Person person;
	
	
}
