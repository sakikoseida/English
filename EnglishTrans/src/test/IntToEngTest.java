package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

import englishtrans.IntToEng;

public class IntToEngTest {
	
    @Test
	public void ������one�ɕϊ�() {
		
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual, is(expected));
	}

	@Test
	public void �ɂ��イ������twentyone�ɕϊ�() {
		String expected = "ten";
		String actual = IntToEng.translateEng(10);
		assertThat(actual, is(expected));
	}
}
