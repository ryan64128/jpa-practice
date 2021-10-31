package com.example.demo;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Address;
import com.example.demo.model.Person;

@SpringBootTest
class JpaPracticeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testWhenParentSavedThenChildSaved(){
		//Person person = new Person("Ryan", "Roberts", 38);
		//Address address = new Address(77, "High Street", "Torrington", "CT", "06790");
		//person.setAddress(Arrays.asList(address));
	}

}
