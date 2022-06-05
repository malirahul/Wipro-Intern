package wipro.Arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int num = 0;
		for(int i=0;i<arr.length;i++) {
			num+=arr[i];
		}
		System.out.println("Sum of the given array is : "+num);
		System.out.println("Average of the given array is : "+num/arr.length);

	}

}
