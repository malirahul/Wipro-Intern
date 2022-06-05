package test_suite.com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


class SortingValues {

	public int[] sortValues(int arr[]) {
		Arrays.sort(arr);
		return arr;
	}
	
	@Test
	void test() {
		SortingValues s = new SortingValues();
		int arr[] = {9,7,2,6,8,4,1,3,5};
		int temp[]={1,2,3,4,5,6,7,8,9};
		assertArrayEquals(temp, s.sortValues(arr));
	}

}
