package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

import englishtrans.IntToEng;

public class IntToEngTest {
	
    @Test
	public void いちをoneに変換() {
		
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual, is(expected));
	}

	@Test
	public void にじゅういちをtwentyoneに変換() {
		String expected = "ten";
		String actual = IntToEng.translateEng(10);
		assertThat(actual, is(expected));
	}
}
