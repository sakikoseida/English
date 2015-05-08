package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

import englishtrans.IntToEng;

public class IntToEngTest {
	
    @Test
	public void ‚¢‚¿‚ðone‚É•ÏŠ·() {
		
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual, is(expected));
	}

	@Test
	public void ‚É‚¶‚ã‚¤‚¢‚¿‚ðtwentyone‚É•ÏŠ·() {
		String expected = "ten";
		String actual = IntToEng.translateEng(10);
		assertThat(actual, is(expected));
	}
}
