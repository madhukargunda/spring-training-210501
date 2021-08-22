package study.pattern.springtrainingexample1.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
	
	Person(){
		System.out.println("Creation of the person class");
	}
	
	private String firstName;
	
	private String lastName;
	
	private Address address;
}
