package study.pattern.beans;

import java.io.Serializable;

public class PersonBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private AddressBean address;

	// manadatory
	public PersonBean() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AddressBean getAddress() {
		return address;
	}

	public void setAddress(AddressBean address) {
		this.address = address;
	}

}
