package domainObjects;

import java.util.GregorianCalendar;

import enumerations.Gender;
import enumerations.Status;

public class NextOfKin extends Member {

	private String nextOfKinName;
	private int nextOfKinPhoneNumber;
	
	public NextOfKin(
			String forename,
			String surname,
			GregorianCalendar dateOfBirth,
			int age,
			Gender gender,
			Status status,
			int phoneNumber,
			String email,
			String nextOfKinName,
			int nextOfKinPhoneNumber)
	{
		super(forename, surname, dateOfBirth, age, gender, status, phoneNumber, email);
		this.nextOfKinName = nextOfKinName;
		this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
	}
	
	public String getNextOfKinName() {
		return nextOfKinName;
	}
	public void setNextOfKinName(String nextOfKinName) {
		this.nextOfKinName = nextOfKinName;
	}
	public int getNextOfKinPhoneNumber() {
		return nextOfKinPhoneNumber;
	}
	public void setNextOfKinPhoneNumber(int nextOfKinPhoneNumber) {
		this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
	}

	@Override
	public String toString() {
		return "NextOfKin [nextOfKinName=" + nextOfKinName
				+ ", nextOfKinPhoneNumber=" + nextOfKinPhoneNumber + "]";
	}
	
	
	
}
