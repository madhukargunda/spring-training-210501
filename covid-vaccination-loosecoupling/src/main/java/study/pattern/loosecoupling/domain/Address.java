package study.pattern.loosecoupling.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

	private String streetAddress;

	private String city;

	private String country;

	private String zipCode;
}
