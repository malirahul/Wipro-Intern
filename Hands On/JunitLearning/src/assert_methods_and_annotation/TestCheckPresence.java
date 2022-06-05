package assert_methods_and_annotation;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import junit_with_eclipse.com.wipro.task.DailyTask;

class TestCheckPresence {

	@Test
	void test() {
		DailyTask dt = new DailyTask();
		String s = "Rahul";
		assertTrue(dt.checkPresence(s, "hu"));
		//assertFalse(dt.checkPresence(s, "hu"));
	
		}
}
