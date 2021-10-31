package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@NonNull
	private int age;
	
	@JsonIgnore
	@OneToMany(mappedBy="person", fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	List<Address> address;
	
}
