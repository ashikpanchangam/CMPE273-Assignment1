import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class JavaArraysExampleTest {

	@Test
	public void test1() {
		int[] arr = {1,2,3};
		int[] revarr = {3,2,1};
		int[] result = JavaArraysExample.reverseArray(arr);
		assertEquals(Arrays.toString(revarr),Arrays.toString(result));
	}
	
	@Test
	public void test2() {
		int[] arr = {4,67,48,9,10,14};
		int[] revarr = {14,10,9,48,67,4};
		int[] result = JavaArraysExample.reverseArray(arr);
		assertEquals(Arrays.toString(revarr),Arrays.toString(result));
	}

}