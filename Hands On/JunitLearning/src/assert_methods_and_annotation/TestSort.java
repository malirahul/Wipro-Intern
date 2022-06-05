package assert_methods_and_annotation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit_with_eclipse.com.wipro.task.DailyTask;

class TestSort {

	@Test
	void test() {
		DailyTask dt = new DailyTask();
		int arr[] = {9,7,2,6,8,4,1,3,5};
		int temp[]={1,2,3,4,5,6,7,8,9};
		
		assertArrayEquals(temp, dt.sortValues(arr));
	}

}
