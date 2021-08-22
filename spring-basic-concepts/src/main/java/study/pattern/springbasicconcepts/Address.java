package study.pattern.springbasicconcepts;

public class Address {
	
	
	Address (){
		System.out.println("Address Object ccreated");
	}
	
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		System.out.println("Setter for Countrt invoked");
		this.country = country;
	}
}
