package junit_with_eclipse.com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit_with_eclipse.com.wipro.task.DailyTask;

class TestStringConcat {

	@Test
	void test() {
		DailyTask dt = new DailyTask();
		String name = dt.doStringConcat("Rahul","Mali");
		assertEquals("Rahul Mali", name);
	}

}
