package exception_handling;

import java.util.Scanner;

public class EH01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the elements in the array");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements in the arrays");
		int arr[] = new int[n];
		
		try {
		
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		
		
			System.out.println("Enter the index of the array element you want to access");
			
			int index = sc.nextInt();
			System.out.println("The array elements at index "+index+" = "+arr[index]);
			System.out.println("The array elements successfully accessed");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}catch(Exception e) {
			System.out.println(e);
		}
			

	}

}
