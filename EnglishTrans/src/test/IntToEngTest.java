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
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ‚æ‚ñ‚¶‚ã‚¤‚ðforty‚É•ÏŠ·(){
		String expected = "forty";
		String actual = IntToEng.translateEng(40);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚Ð‚á‚­‚ðonehundred‚É•ÏŠ·(){
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚æ‚ñ‚¶‚ã‚¤‚«‚ã‚¤‚ðfortynine‚É•ÏŠ·(){
		String expected = "forty nine";
		String actual = IntToEng.translateEng(49);
		assertThat(actual,is(expected));
	}
	
	
}
