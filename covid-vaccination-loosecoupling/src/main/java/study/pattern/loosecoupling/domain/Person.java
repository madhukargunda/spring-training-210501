package study.pattern.loosecoupling.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
		
	private String firstName;

	private String lastName;
		
	private Address address;
	
}
