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
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ��񂶂イ��forty�ɕϊ�(){
		String expected = "forty";
		String actual = IntToEng.translateEng(40);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void �ЂႭ��onehundred�ɕϊ�(){
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ��񂶂イ���イ��fortynine�ɕϊ�(){
		String expected = "forty nine";
		String actual = IntToEng.translateEng(49);
		assertThat(actual,is(expected));
	}
	
	
}
