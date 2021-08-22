/**
 * 
 */
package study.pattern.springbasicconcepts;

/**
 * @author madhukargunda
 *
 */
public class Person {
	
	
	private String firstName;
	
	private String lastName;
	
	private Address address;
	
	Person(String firstName , String lastName , Address address){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	
	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

}
