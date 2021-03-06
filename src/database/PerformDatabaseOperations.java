package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import domainObjects.Swimmer;
import enumerations.Gender;
import enumerations.Status;


public class PerformDatabaseOperations {

	static String idEnteredByCustomer;
	
	public PerformDatabaseOperations(){
		dropTableSwimmers();
		createTableSwimmers();
		populateTableSwimmers();
		viewSwimmers();
	}
	
	public void dropTableSwimmers(){
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");

			// drop table Swimmer 
			scriptStatement = connection.createStatement();
			
			String dropTableSwimmers = "DROP TABLE IF EXISTS SWIMMERS;";
			
			scriptStatement.executeUpdate(dropTableSwimmers);
			
			// close the connection and statement
			scriptStatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table Swimmers dropped.");
		
	}
	
	public void createTableSwimmers(){
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");

			// create table Swimmer 
			scriptStatement = connection.createStatement();
			
			String createTableSwimmers = "CREATE TABLE SWIMMERS " +
										"(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
										"FORENAME TEXT NOT NULL," +
										"SURNAME TEXT NOT NULL," +
										"DATE_OF_BIRTH DATE NOT NULL," +
										"GENDER TEXT NOT NULL,"+
										"STATUS TEXT NOT NULL,"+
										"PHONE_NUMBER TEXT NOT NULL,"+
										"EMAIL TEXT NOT NULL,"+
										"MEDICAL_CONDITIONS TEXT NOT NULL,"+
										"MEDICATION TEXT NOT NULL,"+
										"SWIM_CLUB_NAME TEXT NOT NULL," + 
										"LEVEL TEXT NOT NULL,"	+ 
										"NEXT_OF_KIN_NAME TEXT NOT NULL," +
										"NEXT_OF_KIN_PHONE_NUMBER TEXT NOT NULL)";
			
			
			scriptStatement.executeUpdate(createTableSwimmers);
			
			
			// close the connection and statement
			scriptStatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table Swimmers created.");
		
	}
		
		
	public void populateTableSwimmers(){
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");

			// populate table Swimmers 
			scriptStatement = connection.createStatement();
			
			String populateTableSwimmers = "INSERT INTO SWIMMERS (FORENAME, SURNAME, DATE_OF_BIRTH, GENDER, STATUS, PHONE_NUMBER,"
											+ "EMAIL, MEDICAL_CONDITIONS, MEDICATION, "
											+ "SWIM_CLUB_NAME, LEVEL, NEXT_OF_KIN_NAME, NEXT_OF_KIN_PHONE_NUMBER) VALUES "
											+ "('Michael', 'Phelps', '1984-06-30', 'male', 'active', '0909090', "
											+ "'michael.phelps@gmail.com', 'asthma', 'Seratin inhaler',"
											+ "'Baltimore Swimming Club', 'Pro', 'Debbie Phelps', '01819993') ;";
			
			String populateTableSwimmers2 = "INSERT INTO SWIMMERS (FORENAME, SURNAME, DATE_OF_BIRTH, GENDER, STATUS, PHONE_NUMBER,"
											+ "EMAIL, MEDICAL_CONDITIONS, MEDICATION, "
											+ "SWIM_CLUB_NAME, LEVEL, NEXT_OF_KIN_NAME, NEXT_OF_KIN_PHONE_NUMBER) VALUES "
											+ "('Jessica', 'Hardy', '1985-02-21', 'female', 'active', '0903229090', "
											+ "'jessica.hardy@gmail.com', 'none', 'n/a',"
											+ "'California Swimming Club', 'Pro', 'Dominik Meichtry', '011119993') ;";
			
			String populateTableSwimmers3 = "INSERT INTO SWIMMERS (FORENAME, SURNAME, DATE_OF_BIRTH, GENDER, STATUS, PHONE_NUMBER,"
											+ "EMAIL, MEDICAL_CONDITIONS, MEDICATION, "
											+ "SWIM_CLUB_NAME, LEVEL, NEXT_OF_KIN_NAME, NEXT_OF_KIN_PHONE_NUMBER) VALUES "
											+ "('Otylia', 'J�drzejczak', '1983-12-13', 'female', 'active', '600123123', "
											+ "'j.jedrzejczak@gmail.com', 'none', 'n/a',"
											+ "'Ruda �l�ska', 'Pro', 'Pawe� S�omi�ski', '601987123') ;";

			String populateTableSwimmers4 = "INSERT INTO SWIMMERS (FORENAME, SURNAME, DATE_OF_BIRTH, GENDER, STATUS, PHONE_NUMBER,"
											+ "EMAIL, MEDICAL_CONDITIONS, MEDICATION, "
											+ "SWIM_CLUB_NAME, LEVEL, NEXT_OF_KIN_NAME, NEXT_OF_KIN_PHONE_NUMBER) VALUES "
											+ "('Marta', 'Doberschuetz', '1983-12-21', 'female', 'active', '600123123', "
											+ "'marta@marta.ie', 'none', 'n/a',"
											+ "'Pozna�', 'Pro-Ama', 'null', '353877260959') ;";

			String populateTableSwimmers5 = "INSERT INTO SWIMMERS (FORENAME, SURNAME, DATE_OF_BIRTH, GENDER, STATUS, PHONE_NUMBER,"
											+ "EMAIL, MEDICAL_CONDITIONS, MEDICATION, "
											+ "SWIM_CLUB_NAME, LEVEL, NEXT_OF_KIN_NAME, NEXT_OF_KIN_PHONE_NUMBER) VALUES "
											+ "('Pawe�', 'Korzeniowski', '1988-01-13', 'male', 'inactive', '600555123', "
											+ "'p.korzeniowskik@gmail.com', 'none', 'n/a',"
											+ "'Warszawa', 'Pro', 'n/a', 'n/a') ;";

			/*String forename,
			String surname,
			GregorianCalendar dateOfBirth,
			Gender gender,
			Status status,
			int phoneNumber,
			String email,
			String medicalConditions,
			String medication,
			String swimClubName,
			String level,
			String nextOfKinName,
			int nextOfKinPhoneNumber*/
		
			scriptStatement.executeUpdate(populateTableSwimmers);
			scriptStatement.executeUpdate(populateTableSwimmers2);
			scriptStatement.executeUpdate(populateTableSwimmers3);
			scriptStatement.executeUpdate(populateTableSwimmers4);
			scriptStatement.executeUpdate(populateTableSwimmers5);
			
			// close the connection and statement
			scriptStatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table Swimmers populated.");
	}
	
	
	public void viewSwimmers(){
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");
			
			scriptStatement = connection.createStatement();
			
			ResultSet result = scriptStatement.executeQuery("SELECT * FROM SWIMMERS;");
			
			while (result.next()){
				int ID = result.getInt("ID");
				String forename = result.getString("FORENAME");
				String surname = result.getString("SURNAME");
				String dateOfBirth = result.getString("DATE_OF_BIRTH");
				String gender = result.getString("GENDER");
				String phoneNumber = result.getString("PHONE_NUMBER");
				String email = result.getString("EMAIL");
				String medicalConditions = result.getString("MEDICAL_CONDITIONS");
				String medication = result.getString("MEDICATION");
				String nextOfKinName = result.getString("NEXT_OF_KIN_NAME");
				String nextOfKinPhoneNumber = result.getString("NEXT_OF_KIN_PHONE_NUMBER");
				String swimClub = result.getString("SWIM_CLUB_NAME");
				String status = result.getString("STATUS");
				String level = result.getString("LEVEL");
				
				JTextArea allSwimmers = new JTextArea();
				allSwimmers.append("Forename: " + forename);
				allSwimmers.append("\nSurname: " + surname);
				allSwimmers.append("\nDate of birth: " + dateOfBirth);
				allSwimmers.append("\nGender: " + gender);
				allSwimmers.append("\nPhone number: " + phoneNumber);
				allSwimmers.append("\nEmail: " + email);
				allSwimmers.append("\nMedical conditions: " + medicalConditions);
				allSwimmers.append("\nMedication: " + medication);
				allSwimmers.append("\nNext of kin' name: " + nextOfKinName);
				allSwimmers.append("\nNext of kin's phone number: " + nextOfKinPhoneNumber);
				allSwimmers.append("\nSwim club: " + swimClub);
				allSwimmers.append("\nStatus" + status);
				allSwimmers.append("\nLevel: " + level);
				JOptionPane.showMessageDialog(null, allSwimmers);

				
				System.out.println("ID = " + ID);
				System.out.println("FORENAME = "+ forename);
				System.out.println("SURNAME = "+ surname);
				System.out.println("DATE_OF_BIRTH = " + dateOfBirth);
				System.out.println("GENDER = "+ gender);
				System.out.println("PHONE_NUMBER = "+ phoneNumber);
				System.out.println("EMAIL = "+ email);
				System.out.println("MEDICAL_CONDITIONS = "+ medicalConditions);
				System.out.println("MEDICATION = "+ medication);
				System.out.println("NEXT_OF_KIN_NAME = "+ nextOfKinName);
				System.out.println("NEXT_OF_KIN_PHONE_NUMBER = "+ nextOfKinPhoneNumber);
				System.out.println("SWIM_CLUB_NAME = "+ swimClub);
				System.out.println("STATUS = "+ status);
				System.out.println("LEVEL = "+ level);
			}
					
			result.close();
			scriptStatement.close();
			connection.close();
			
		} catch ( Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			//System.exit(0);
		}
		System.out.println("The above is a list of all swimmers in the database.");
		
	}
	
	
	public  void retrieveSwimmerFromDatabase()	{
		
		// ask for the surname
		idEnteredByCustomer = JOptionPane.showInputDialog(null, "Swimmer's id: ");
		
		Connection connection = null;
		Statement scriptStatement = null;
		
				
		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");
			
			// retrieve specified swimmer's details
			// swimmer is specified by their surname
			scriptStatement = connection.createStatement();
			String retrieveSwimmerFromDatabase = "SELECT * FROM SWIMMERS WHERE ID='" + idEnteredByCustomer + "'; ";
			ResultSet result = scriptStatement.executeQuery(retrieveSwimmerFromDatabase);
			
				
			while (result.next()){
				int ID = result.getInt("ID");
				String forename = result.getString("FORENAME");
				String surname = result.getString("SURNAME");
				Date dateOfBirth = result.getDate("DATE_OF_BIRTH");
				String gender = result.getString("GENDER");
				String phoneNumber = result.getString("PHONE_NUMBER");
				String email = result.getString("EMAIL");
				String medicalConditions = result.getString("MEDICAL_CONDITIONS");
				String medication = result.getString("MEDICATION");
				String nextOfKinName = result.getString("NEXT_OF_KIN_NAME");
				String nextOfKinPhoneNumber = result.getString("NEXT_OF_KIN_PHONE_NUMBER");
				String swimClub = result.getString("SWIM_CLUB");
				String status = result.getString("STATUS");
				String level = result.getString("LEVEL");
				
				// parse string to date
				//Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
				/* 
				// insert the data pulled from db into the text fields
				AmendSwimmerFrame.forenameTextField.setText(forename);
				AmendSwimmerFrame.surnameTextField.setText(surname);
				AmendSwimmerFrame.dateOfBirthChosen.setDate(dateOfBirth);		
				AmendSwimmerFrame.genderComboBox.setSelectedItem(gender);
				AmendSwimmerFrame.phoneNumberTextField.setText(phoneNumber);
				AmendSwimmerFrame.emailTextField.setText(email);
				AmendSwimmerFrame.medicalConditionsTextArea.setText(medicalConditions);
				AmendSwimmerFrame.medicalConditionsTextArea.setText(medication);
				AmendSwimmerFrame.nextOfKinNameTextField.setText(nextOfKinName);
				AmendSwimmerFrame.nextOfKinPhoneNumberTextField.setText(nextOfKinPhoneNumber);
				AmendSwimmerFrame.swimClubNameComboBox.setSelectedItem(swimClub);
				AmendSwimmerFrame.statusComboBox.setSelectedItem(status);
				AmendSwimmerFrame.swimmerLevelComboBox.setSelectedItem(level);*/
				
				
				//JOptionPane.showMessageDialog(null, "Please amend Swimmer's details.");
				
			}
				
			System.out.println("bla");
			
			result.close();
			scriptStatement.close();
			connection.close();

					
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
		
		}
		
		
	}
	
	/*
	public void updateSwimmerDetails() throws ClassNotFoundException{
		
		
		// get text from all the fields in the form
		String forename = AmendSwimmerFrame.forenameTextField.getText();
		String surname = AmendSwimmerFrame.surnameTextField.getText();
		Date dateOfBirth = AmendSwimmerFrame.dateOfBirthChosen.getDate();		
		String gender = AmendSwimmerFrame.genderComboBox.getSelectedItem().toString();
		String phoneNumber = AmendSwimmerFrame.phoneNumberTextField.getText();
		int phoneNumberAsInteger = Integer.parseInt(phoneNumber);
		String email = AmendSwimmerFrame.emailTextField.getText();
		String medicalConditions = AmendSwimmerFrame.medicalConditionsTextArea.getText();
		String medication = AmendSwimmerFrame.medicalConditionsTextArea.getText();
		String nextOfKinName = AmendSwimmerFrame.nextOfKinNameTextField.getText();
		String nextOfKinPhoneNumber = AmendSwimmerFrame.nextOfKinPhoneNumberTextField.getText();
		int nextOfKinPhoneNumberAsInteger = Integer.parseInt(nextOfKinPhoneNumber);
		String swimClub = AmendSwimmerFrame.swimClubNameComboBox.getSelectedItem().toString();
		String status = AmendSwimmerFrame.statusComboBox.getSelectedItem().toString();
		String level = AmendSwimmerFrame.swimmerLevelComboBox.getSelectedItem().toString();
	
				
			// create a connection
			Connection connection = null;
			Statement scriptStatement = null;

			
			try {
				
				// connect to database
				Class.forName("org.sqlite.JDBC");
				connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
				System.out.println("Opened database Successfully");
				/*
				scriptStatement = connection.createStatement();
				String dob = (new SimpleDateFormat("yyyy-MM-dd").format(dateOfBirth));
						
				String updateCustomerDetails = "UPDATE SWIMMERS SET "
												+ "FORENAME='" + forename + "', "
												+ "SURNAME='" + surname + "', "
												+ "DATE_OF_BIRTH='" + dateOfBirth + "', "
												+ "GENDER='" + gender + "', "
												+ "PHONE_NUMBER='" + phoneNumber + "', "
												+ "EMAIL='" + email + "', "
												+ "MEDICAL_CONDITIONS='" + medicalConditions + "', "
												+ "MEDICATION='" + medication + "' "
												+ "NEXT_OF_KIN_NAME='" + nextOfKinName + "' "
												+ "NEXT_OF_KIN_PHONE_NUMBER='" + nextOfKinPhoneNumber + "' "
												+ "SWIM_CLUB='" + swimClub + "' "
												+ "STATUS='" + status + "' "
												+ "LEVEL='" + level + "' "
												+ "WHERE ID LIKE '" + idEnteredByCustomer + "';";
			
						
						scriptStatement.executeUpdate(updateCustomerDetails);	
						scriptStatement.close();
						connection.close();
						
						System.out.println("Records updated successfully");
						
						JOptionPane.showMessageDialog(null, "Thank you for updating your details " + idEnteredByCustomer);
						
					
						
					}catch(SQLException e){
						System.out.println(e.getClass().getName() + ": " +e.getMessage() );
					}
		
		
	}
	
	public void deleteSwimmerFromDatabase(){
		
		// ask for the surname
		idEnteredByCustomer = JOptionPane.showInputDialog(null, "Swimmer's id: ");
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");

			// delete a specified Swimmer 
			scriptStatement = connection.createStatement();
			
			String deleteSwimmerFromDatabase = "DELETE FROM SWIMMERS WHERE ID='" + idEnteredByCustomer + "';";
			
			scriptStatement.executeUpdate(deleteSwimmerFromDatabase);
			
			// close the connection and statement
			scriptStatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			System.exit(0);
		}
		System.out.println("Swimmer with id of " + idEnteredByCustomer + " has been deleted.");
		
	}*/
}