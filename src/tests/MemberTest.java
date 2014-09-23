package tests;
import org.junit.*;

import java.util.Calendar;
import java.util.GregorianCalendar;



import domainObjects.Member;
import enumerations.Gender;
import enumerations.Status;

public class MemberTest {

	private domainObjects.Member member;
 
	@Before
	public void setUp() {
  
		member = new Member(
				"Marta",
		        "O'Shaug",
		        new GregorianCalendar(1995, 11, 11),
		        Gender.female,
		        Status.active,
		        600123123,
				"marta@marta.ie");
  
	 }
	 
	 /*
	  * 
	 public int calculateAge(int yearInDateOfBirth){
	  
	  return (new GregorianCalendar()).get(Calendar.YEAR) - yearInDateOfBirth;
	 }
	 
	  * */
	
	 @Test
	 public void testCalculateAge() {
	    //given
	 
	    int yearInDateOfBirth = member.dateOfBirth.get(Calendar.YEAR);
	  
	   //when
	   int result = member.calculateAge(yearInDateOfBirth);
	   
	   //then
	   Assert.assertEquals(19, result);
	 }
	 

}