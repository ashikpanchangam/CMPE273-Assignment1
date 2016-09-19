import static org.junit.Assert.*;

import org.junit.Test;

public class JavaMultithreadingExampleTest {

	@Test
	public void testPrimeCompositeNumber1() {
		Boolean expectedOutput = true;
		Boolean actualOutput = JavaMultithreadingExample.printPrimeCompositeNumber("Student Union");
		assertEquals(expectedOutput,actualOutput);
	}
	
	@Test
	public void testPrimeCompositeNumber2() {
		Boolean expectedOutput = false;
		Boolean actualOutput = JavaMultithreadingExample.printPrimeCompositeNumber("17");
		assertEquals(expectedOutput,actualOutput);
	}

}