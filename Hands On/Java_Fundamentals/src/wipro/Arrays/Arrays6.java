package wipro.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//Arrays.sort(arr);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
