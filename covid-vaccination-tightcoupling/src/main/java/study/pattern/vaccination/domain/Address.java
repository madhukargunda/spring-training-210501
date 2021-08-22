package study.pattern.vaccination.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

	private String streetAddress;

	private String city;

	private String state;

	private String country;

	private String zipCode;
}
