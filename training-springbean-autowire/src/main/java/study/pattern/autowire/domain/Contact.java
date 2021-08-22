package study.pattern.autowire.domain;

public class Contact {

	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + "]";
	}
}
