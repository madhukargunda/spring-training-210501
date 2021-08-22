package study.pattern.vaccination.domain;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import study.pattern.vaccination.domain.clinic.RaffelClinic;

@Data
public class Registration {
	
	public Registration(Person person, LocalDate date) {
		this.person = person;
		this.date = date;
		this.rafflesClinic = new RaffelClinic(); // Tight coupling
	}
	
	private Person person;
	
	@Getter
	private RaffelClinic rafflesClinic;  
	
	private LocalDate date;

}