package test_suite.com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Concatination {
	String stringConcat(String str1,String str2) {
		return str1+str2;
	}
	@Test
	public void testStringConcat() {
		Concatination c = new Concatination();
		assertEquals("tomcat", c.stringConcat("tom","cat"));
	}

}
