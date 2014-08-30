package domainObjects;

import java.util.GregorianCalendar;

import enumerations.Gender;
import enumerations.Status;

public class Trainer extends Member {

	public Trainer(
			String forename,
			String surname,
			GregorianCalendar dateOfBirth,
			int age,
			Gender gender,
			Status status,
			int phoneNumber,
			String email
			)
	{
		super(forename, surname, dateOfBirth, age, gender, status, phoneNumber, email);
		
	}
	
}
