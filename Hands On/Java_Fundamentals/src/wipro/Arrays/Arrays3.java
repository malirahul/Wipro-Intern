package wipro.Arrays;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		int arr[] = {1,4,34,56,7};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int x = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				x =i+1;
				break;
			}
		}
		System.out.println(x);	

	}

}
