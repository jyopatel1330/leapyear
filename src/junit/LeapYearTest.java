package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.LeapYear;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeapYearTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	
	/* All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year) */
	@Test
	void leapYearDivisibleBy400() {
		
		LeapYear leapYear = new LeapYear();
	    boolean actual = leapYear.leapYear(2008);
	    boolean expected = true;
	    assertEquals(expected, actual);
		
	}
	
	/*All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year) */
	@Test
	void leapYeardivisibleBy100() {
		
		LeapYear leapYear = new LeapYear();
	    boolean actual = leapYear.leapYear(1700);
	    boolean expected = false;
	    assertEquals(expected, actual);
		
	}
	
	/* All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016)*/
	@Test
	void leapYearDivisibleBy4() {
		
		LeapYear leapYear = new LeapYear();
	    boolean actual = leapYear.leapYear(2008);
	    boolean expected = true;
	    assertEquals(expected, actual);
		
	}
	
	/* All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019). */
	@Test
	void leapYear() {
		LeapYear leapYear = new LeapYear();
	    boolean actual = leapYear.leapYear(2017);
	    boolean expected = false;
	    assertEquals(expected, actual);
		
	}
	
	

}
