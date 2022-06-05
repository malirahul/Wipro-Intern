package wipro.Arrays;

import java.util.Scanner;

public class Arrays11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		boolean b = true ;
		for(int i=0;i<n;i++) {
			if(arr[i]!=1 && arr[i]!=4)
				b=false;
		}
		System.out.println(b);

	}

}
