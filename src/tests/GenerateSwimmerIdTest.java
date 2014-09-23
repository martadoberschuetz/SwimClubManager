package tests;
import java.util.GregorianCalendar;

import org.junit.*;

import enumerations.Gender;
import enumerations.Status;

public class GenerateSwimmerIdTest{

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
	public void test_generateSwimmerId_OK(){
		//given
		String forename = swimmer.forename;
		String surname = swimmer.surname;
		int numericId = swimmer.numericId;
		//when
		String result = swimmer.generateSwimmerId(forename, surname, numericId);
		//then
		Assert.assertEquals("MicPhe1", result);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void test_generateSwimmerId_Forename_Empty_String(){
		//given
		String forename = "";
		String surname = swimmer.surname;
		int numericId = swimmer.numericId;
		//when
		String result = swimmer.generateSwimmerId(forename, surname, numericId);
		//then
		//Assert.assertEquals("MicPhe1", result);
	}
}
