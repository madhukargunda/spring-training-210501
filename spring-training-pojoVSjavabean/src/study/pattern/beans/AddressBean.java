package study.pattern.beans;

public class AddressBean {
	
	AddressBean(){
	}
	
	private boolean areYouStayngThisAddress;
	
	public boolean isAreYouStaingThisAddress() {
		return areYouStayngThisAddress;
	}

	public void setAreYouStaingThisAddress(boolean areYouStaingThisAddress) {
		this.areYouStayngThisAddress = areYouStaingThisAddress;
	}
	
	
	private String city;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
			
	private String zipode;
	
	public String getZipode() {
		return zipode;
	}

	public void setZipode(String zipode) {
		this.zipode = zipode;
	}
	
	
	private String country;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
