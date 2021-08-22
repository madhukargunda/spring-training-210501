package study.pattern.springbeanannotations.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Override
	public String toString() {
		return "Person [address=" + address + ", contact=" + contact + ", fdAccount=" + fdAccount + ", savingAccount="
				+ savingAccount + "]";
	}

	private Address address;
	
	private Contact contact;
	
	private FixedDepoistAccount fdAccount;
	
	private SavingAccount savingAccount;
	
	public Contact getContact() {
		return contact;
	}

	@Autowired
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public FixedDepoistAccount getFdAccount() {
		return fdAccount;
	}

	@Autowired
	public void setFdAccount(FixedDepoistAccount fdAccount) {
		this.fdAccount = fdAccount;
	}

	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	@Autowired
	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
}
