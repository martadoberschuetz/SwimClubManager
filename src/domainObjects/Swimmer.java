package domainObjects;

import java.util.GregorianCalendar;

import enumerations.Gender;
import enumerations.Status;


public class Swimmer extends Member{

	private int swimmerID;
	private String medicalConditions;
	private String medication;
	private String swimClubName;
	private String level; // MD 24/08/2014 as in: Junior, Senior, Masters -> not needed yet?

	
	public Swimmer(
			String forename,
			String surname,
			GregorianCalendar dateOfBirth,
			int age,
			Gender gender,
			Status status,
			int phoneNumber,
			String email,
			String medicalConditions,
			String medication,
			String swimClubName,
			String level) {
		super(forename, surname, dateOfBirth, age, gender, status, phoneNumber, email);
		this.medicalConditions = medicalConditions;
		this.medication = medication;
		this.swimClubName = swimClubName;
		this.level = level;
	}
	
	
	public int getSwimmerID() {
		return swimmerID;
	}
	public void setSwimmerID(int swimmerID) {
		this.swimmerID = swimmerID;
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


	@Override
	public String toString() {
		return "Swimmer [swimmerID=" + swimmerID + ", medicalConditions="
				+ medicalConditions + ", medication=" + medication
				+ ", swimClubName=" + swimClubName + ", level=" + level + "]";
	}
		
}