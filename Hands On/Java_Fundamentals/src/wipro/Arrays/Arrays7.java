package wipro.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
  
        arr[j++] = arr[n - 1];
		
		for(int i=0;i<j;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
