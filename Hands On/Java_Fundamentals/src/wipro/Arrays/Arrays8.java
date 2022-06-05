package wipro.Arrays;

import java.util.Scanner;

public class Arrays8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int a=6;
		int b=7;
		int sum=0;
		boolean skip = true;
		for(int i=0;i<n;i++) {
			if(arr[i]!=a && skip==true) {
				sum += arr[i];
			}
			else if(arr[i]==a)
				skip =false;
			else if(arr[i]==b)
				skip=true;
		}
		System.out.println(sum);

	}

}
