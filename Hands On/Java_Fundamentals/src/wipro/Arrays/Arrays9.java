package wipro.Arrays;

import java.util.Scanner;

public class Arrays9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr1[] = new int[n];
		for(int i=0;i<n;i++)
			arr1[i] = sc.nextInt();
		
		int a=10;
		int arr2[] = new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr1[i]!=a) {
				arr2[i]=arr1[i];
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr2[i]>0) {
				System.out.print(arr2[i]+" ");
			}
		}
		for(int i=0;i<n;i++) {
			if(arr2[i]==0) {
				System.out.print(0+" ");
			}
		}
		

	}

}
