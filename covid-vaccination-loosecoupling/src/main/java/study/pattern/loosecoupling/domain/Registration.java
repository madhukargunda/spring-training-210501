package study.pattern.loosecoupling.domain;

import java.time.LocalDate;

import study.pattern.loosecoupling.domain.clinic.Clinic;


/**
 * This class is used to register vaccine
 * 
 * @author madhukargunda
 *
 */
public class Registration {

	private Person person;

	private LocalDate date;

	private Clinic clinic;

	
	// Mandatory fields for Registration for  vaccine	
	// Constructor Injection
	public Registration(Person person, LocalDate date, Clinic clinic) {
		this.person = person;
		this.date = date;
		this.clinic = clinic;
	}
	
	// Empty constructor , javabean rule
	public Registration() {

	} 
		
	// Setter Injection
	public void setPerson(Person person) {
		this.person = person;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public Person getPerson() {
		return person;
	}
	public LocalDate getDate() {
		return date;
	}

	public Clinic getClinic() {
		return clinic;
	}

}