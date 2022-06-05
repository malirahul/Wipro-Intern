package wipro.Arrays;

import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Largest : "+arr[0]);
		System.out.println("Second Largest : "+arr[1]);
		System.out.println("Smallest : "+arr[n-1]);
		System.out.println("Second Smallet : "+arr[n-2]);

	}

}
