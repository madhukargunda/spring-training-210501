package study.pattern.autowire.domain;

public class Person {

	/**
	 * Property name should match exactly with the bean id 
	 * in xml configuration for 
	 * autowire by type
	 * 
	 */

	public Person(Address address) {
		this.address = address;
	}

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(Contact contact) {
		this.contact = contact;
	}

	private Contact contact;

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
