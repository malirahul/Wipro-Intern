package exception_handling;

import java.util.InputMismatchException;

public class EH02_MathOperation {

	public static void main(String[] args) throws ArithmeticException,NumberFormatException,ArrayIndexOutOfBoundsException {
		try {
			int sum = 0;
			int avg = 0;
			
		int arr[] = new int[args.length];
		for(int i=0;i<args.length;i++)
			arr[i] = Integer.parseInt(args[i]);
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		avg=sum/args.length;
		
		System.out.println("Sum of the array element is : "+sum);
		System.out.println("Average of the array element is : "+avg);
		
		
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		
		
	}

}
