import static org.junit.Assert.*;

import org.junit.Test;

public class JavaCollectionsExampleTest {

	@Test
	public void testAddStudent1() {
		Boolean actualResult = JavaCollectionsExample.addStudent("Ashik", "010409321", "San Jose State University", "ashik.panchangamjaikishan@gmail.com", "Software Engineering");
		assertEquals(true,actualResult);
	}

	@Test
	public void testAddStudent2() {
		Boolean actualResult = JavaCollectionsExample.addStudent("Mark", "USC", "University of Southern California", "mark@gmail.com", "Electrical Engineering");
		assertEquals(false,actualResult);
	}

	@Test
	public void testAddStudent3() {
		Boolean actualResult = JavaCollectionsExample.addStudent("Nikhil", "456789", "Northeastern University", "nikhil@gmail.com", "MIS");
		assertEquals(true,actualResult);
	}

}