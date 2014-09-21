package domainObjects;

import java.util.GregorianCalendar;
import enumerations.Gender;
import enumerations.Status;

public class Coach extends Member {

	public Coach(
			String forename,
			String surname,
			GregorianCalendar dateOfBirth,
			Gender gender,
			Status status,
			int phoneNumber,
			String email ) {
		
		super(
			forename, 
			surname, 
			dateOfBirth,
			gender,
			status,
			phoneNumber,
			email);
		
	}
}
