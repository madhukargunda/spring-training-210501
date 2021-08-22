package study.pattern.collectionBeans.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	private String firstName;

	private String lastName;

	private List<Address> address;

	private List<String> booksInterested;

	private Set<String> examScore;

	private Map<String, Integer> marks;

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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<String> getBooksInterested() {
		return booksInterested;
	}

	public void setBooksInterested(List<String> booksInterested) {
		this.booksInterested = booksInterested;
	}

	public Set<String> getExamScore() {
		return examScore;
	}

	public void setExamScore(Set<String> examScore) {
		this.examScore = examScore;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
}
