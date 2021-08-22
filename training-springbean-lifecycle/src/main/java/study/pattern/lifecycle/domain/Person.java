package study.pattern.lifecycle.domain;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean , DisposableBean {
	
	private String firstName;
	
	private String lastName;
	
	private Address address;
	
	private Map<String,String> initializedata = new HashMap<String,String>();
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Address ");
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Setting First Name");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("setting lastName");
		this.lastName = lastName;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		address.getCountry();
		System.out.println("AfterProperties Set : Initializing the bean in Person class");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy the Person class object and Releasing the resources");
		
	}
		
	/*public void init() {
		System.out.println("Initializing the data after done with setting all oproperties");
		
		System.out.println("Getting the Vaccination Details using firstName , lastName and Address details");
	}
	
	public void destory() {
		System.out.println("Destroy the Person class objet and Releasing the resources");
	}*/
	
}
