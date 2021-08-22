package study.pattern.vaccination;

import java.time.LocalDate;
import java.time.Month;

import study.pattern.vaccination.domain.Address;
import study.pattern.vaccination.domain.Person;
import study.pattern.vaccination.domain.Registration;

public class VaccinationDemoApplication {

	public static void main(String[] args) {
		
		// Step 0: Creation of the Person Object , Address 
		Person johnDoe = new Person("John" ,"Doe" ,new Address("112345-23","Singapore","","541191","SINGAPORE")); // We Developer
		
		// Step 1 : Registration 
		System.out.println("Person Registration done for vaccination ");
		Registration registration = new Registration(johnDoe,LocalDate.of(2021, Month.MAY, 30));
		
		// Step 2: Get the Details
		System.out.println("Registration confirmed  {} on {} :"+registration.getPerson().getFirstName() + " - " + registration.getPerson().getLastName() + " " +registration.getDate());
		
	}
}
