package domainObjects;


import java.util.Calendar;
import java.util.GregorianCalendar;
import enumerations.Gender;
import enumerations.Status;


public abstract class Member {

	
	private static int id = 0;
	public String forename;
	public String surname;
	public GregorianCalendar dateOfBirth;
	public int age;
	public Gender gender;
	public Status status;
	public int phoneNumber;
	public String email;
	
	
	public Member(
			String forename,
			String surname,
			GregorianCalendar dateOfBirth,
			Gender gender,
			Status status,
			int phoneNumber,
			String email) {
		
		id++;
		this.forename = forename;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.status = status;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
		this.age = this.calculateAge(
							this.dateOfBirth.YEAR);
	}
	
	
	public int calculateAge(int yearInDateOfBirth){
		
		return (new GregorianCalendar()).get(Calendar.YEAR) - yearInDateOfBirth;
	}
	
	/*
	 * to be removed later...
	 * 
	public int calculateAgeTwo(int yearToday, int yearInDateOfBirth){
		
		return yearToday - yearInDateOfBirth;
	}
	
	
	public int calculateAge(){
		  
		  Calendar calendar = new GregorianCalendar();
		  this.age = calendar.get(Calendar.YEAR) - this.dateOfBirth.YEAR;
		  
		  return this.age;
	}*/
	

	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Member [forename=" + forename + ", surname=" + surname
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", gender="
				+ gender + ", status=" + status + ", phoneNumber="
				+ phoneNumber + ", email=" + email + "]";
	}
}