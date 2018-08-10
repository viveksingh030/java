package org.comviva.oops;

public class Name
{
	private String firstname;
	private String lastName;
	@Override
	public String toString() {
		return "Name [firstname=" + firstname + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}
	private String middleName;
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
