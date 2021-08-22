package study.pattern.lifecycle.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean , DisposableBean {

	private String street;

	private String city;

	private String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("Setting Street");
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setting City ");
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	/*public void init() {
		System.out.println("initializing the data in Address class");
	}
	
	public void destory() {
		System.out.println("Destroying the Address class and  releasing the resources");
	} */

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet in Address class : Performing some business logic");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying the Address class object and  releasing the resources");
		
	}
}
