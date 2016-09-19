import static org.junit.Assert.*;

import org.junit.Test;

public class JavaInterfaceExampleTest {

	@Test
	public void test1() {
		String sound = "meow";
		assertEquals(sound,JavaInterfaceExample.displaySoundOfCat());
	}
	
	@Test
	public void test2() {
		String sound = "bow-wow";
		assertEquals(sound,JavaInterfaceExample.displaySoundOfDog());
	}

}