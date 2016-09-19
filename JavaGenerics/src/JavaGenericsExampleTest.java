import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class JavaGenericsExampleTest 
{
	
	@Test
	public void Reverse1() {
		Integer [] array = {0,3,4,1};
		boolean res = JavaGenericsExample.reverse(array);
		assertEquals(false,res);
	}
	@Test
	public void Reverse2() {
		Integer [] array = {1,2,3,1};
		boolean res = JavaGenericsExample.reverse(array);
		assertEquals(false,res);
	}

	@Test
	public void Reverse3() {
		String [] array = {"a","b","x","a"};
		boolean res = JavaGenericsExample.reverse(array);
		assertEquals(false,res);
	}
}