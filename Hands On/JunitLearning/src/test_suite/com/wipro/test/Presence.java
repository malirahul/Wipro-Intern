package test_suite.com.wipro.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class Presence {

	public boolean checkPresence(String str,String a) {
		return str.contains(a);
	}
	
	@Test
	void test() {
		Presence p = new Presence();
		String s = "abcdef";
		
		assertTrue(p.checkPresence(s, "a"));
		
	}

}
