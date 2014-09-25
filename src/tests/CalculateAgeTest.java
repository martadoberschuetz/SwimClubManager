package tests;


import org.junit.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import enumerations.Gender;
import enumerations.Status;


public class CalculateAgeTest {

	
	private domainObjects.Swimmer swimmer;

	
	@Before
	public void setUp(){
		
		swimmer = new domainObjects.Swimmer(
				"Michael", 
				"Phelps",
				new GregorianCalendar(1985, 06, 30),
				Gender.male,
				Status.active,
				66778899,
				"michael.phelps@gmail.com",
				"none",
				"none",
				"Baltimore Gators",
				"Pro",
				"Debra Phelps",
				600123123);
	}
	 
	
	 @Test
	 public void test_calculateAge_OK() {
	    
		 //given
		 int yearInDateOfBirth = swimmer.dateOfBirth.get(Calendar.YEAR);
	  
		 //when
		 int result = swimmer.calculateAge(yearInDateOfBirth);
	   
		 //then
		 Assert.assertEquals(19, result);
	 }
}