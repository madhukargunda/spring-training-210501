package study.pattern.pojo;



public class PersonPOJO {
	
	private String firstName;
	
	private String lastName;
	
	public AddressPOJO address;
		
	public PersonPOJO(String firstName, String lastName, AddressPOJO adresss) {
		this.firstName = firstName;
		this.lastName=lastName;
		this.address=adresss;
	}

	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	
	public AddressPOJO getAddress() {
		return address;
	}

	public void setAddress(AddressPOJO address) {
		this.address = address;
	}
}
