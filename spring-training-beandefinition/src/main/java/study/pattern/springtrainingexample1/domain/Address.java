package study.pattern.springtrainingexample1.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
	
	Address(){
		System.out.println("Creation of the Address class");
	}

	private String streetAddress;

	private String city;

	private String country;

	private String zipCode;
}
