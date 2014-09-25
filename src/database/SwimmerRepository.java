package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.GregorianCalendar;

import domainObjects.Swimmer;
import enumerations.Gender;
import enumerations.Status;

public class SwimmerRepository {

	/*
	 * 
	public void addSwimmerIntoTableSwimmers(Swimmer swimmer){
		
		String forename = swimmer.getForename();
		String surname = swimmer.getSurname();
		GregorianCalendar dateOfBirth = swimmer.getDateOfBirth();
		Gender gender = swimmer.getGender();
		int phoneNumber = swimmer.getPhoneNumber();
		String email = swimmer.getEmail();
		String medicalConditions = swimmer.getMedicalConditions();
		String medication = swimmer.getMedication();
		String nextOfKinName = swimmer.getNextOfKinName();
		int nextOfKinPhoneNumber = swimmer.getNextOfKinPhoneNumber();
		String swimClub = swimmer.getSwimClubName();
		Status status = swimmer.getStatus();
		String level = swimmer.getLevel();
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");

			// add a new swimmer to the table Swimmers 
			scriptStatement = connection.createStatement();
			
			String addNewSwimmer = "INSERT INTO SWIMMERS (FORENAME, SURNAME, DATE_OF_BIRTH, GENDER, PHONE_NUMBER,"
											+ "EMAIL, MEDICAL_CONDITIONS, MEDICATION, NEXT_OF_KIN_NAME, NEXT_OF_KIN_PHONE_NUMBER,"
											+ "SWIM_CLUB, STATUS, LEVEL) VALUES ('"
											+ forename + "','"
											+ surname + "','"
											+ dateOfBirth +  "','"
											+ gender +  "','"
											+ phoneNumber +  "','"
											+ email +  "','"
											+ medicalConditions +  "','"
											+ medication +  "','"
											+ nextOfKinName +  "','"
											+ nextOfKinPhoneNumber +  "','"
											+ swimClub +  "','"
											+ status +  "','"
											+ level +  "');";
			
			scriptStatement.executeUpdate(addNewSwimmer);
						
			// close the connection and statement
			scriptStatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			System.exit(0);
		}
		System.out.println("New swimmer added.");
	}
	
	
	// for testing purposes only:
	
	//public static void main(String[] abc){
		
	//	new PerformDatabaseOperations();
	///}
	
	 * 
	 * */
	
	
}
