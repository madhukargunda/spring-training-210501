package study.pattern.trainingComponentScan.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address {
	
	private String pinCode;
	
	private String city;
	
	private String country;

}
