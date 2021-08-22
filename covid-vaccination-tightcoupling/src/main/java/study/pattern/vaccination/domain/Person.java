package study.pattern.vaccination.domain;

import lombok.Data;

@Data
public class Person {
		
	public Person(String firstName, String lastName , Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	private String firstName;

	private String lastName;
		
	private Address address;
	
}
