import static org.junit.Assert.*;

import org.junit.Test;

public class JavaStacksExampleTest {

	@Test
	public void test1() {
		String str = "[(])";
		assertEquals(false,JavaStacksExample.BalancedParentheses(str));
	}
	
	@Test
	public void test2() {
		String str = "[()]{}{[()()]()}";
		assertEquals(true,JavaStacksExample.BalancedParentheses(str));
	}

}
