package domainObjects;

import java.util.GregorianCalendar;
import enumerations.Gender;
import enumerations.Status;


public class Swimmer extends Member {

	private String swimmerID;
	public static int numericId = 0;
	private String medicalConditions;
	private String medication;
	private String swimClubName;
	private String level; // MD 24/08/2014 as in: Junior, Senior, Masters -> not needed yet?
	private NextOfKin nextOfKin;
	private int age;
	

	public Swimmer(
			String forename,
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
			int nextOfKinPhoneNumber) {
		
		super(forename, 
			  surname, 
			  dateOfBirth, 
			  gender, 
			  status, 
			  phoneNumber, 
			  email);
		
		this.medicalConditions = medicalConditions;
		this.medication = medication;
		this.swimClubName = swimClubName;
		this.level = level;
		
		this.age = this.calculateAge(
								this.dateOfBirth.YEAR);
		
		this.swimmerID = this.generateSwimmerId(
								this.forename,
								this.surname,
								numericId);
		
		this.nextOfKin = new NextOfKin(
								nextOfKinName, 
								nextOfKinPhoneNumber);
	}
	
	
	public String generateSwimmerId(
				String swimmerForename, 
				String swimmerSurname,
				int numericId) {
	
		return 	swimmerForename.substring(0, 3) + 
				swimmerSurname.substring(0, 3) + 
				++numericId;
	}
	

	public String getMedicalConditions() {
		return medicalConditions;
	}
	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getSwimClubName() {
		return swimClubName;
	}
	public void setSwimClubName(String swimClubName) {
		this.swimClubName = swimClubName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public NextOfKin getNextOfKin() {
		return nextOfKin;
	}
	public void setNextOfKin(NextOfKin nextOfKin) {
		this.nextOfKin = nextOfKin;
	}


	@Override
	public String toString() {
		return "Swimmer [swimmerID=" + swimmerID + ", medicalConditions="
				+ medicalConditions + ", medication=" + medication
				+ ", swimClubName=" + swimClubName + ", level=" + level + "]";
	}	
}