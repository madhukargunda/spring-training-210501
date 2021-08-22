package study.pattern.trainingComponentScan.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Person {
	
	private String firstName;
	
	private String lastName;
	
}
