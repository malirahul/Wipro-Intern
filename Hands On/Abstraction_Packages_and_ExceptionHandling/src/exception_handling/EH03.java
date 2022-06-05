package exception_handling;

import java.util.Scanner;

public class EH03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String s = "";
		int s1=0,s2=0,s3=0,Totalmarks = 0;
		int n=2;
		while(n!=0) {
		try {
			System.out.print("Enter Student Name : ");
			s = sc.next();
			System.out.println("Enter the marks of the 3 Subject : ");
			System.out.print("Physics   : ");
			if(sc.hasNextInt())
				s1 = sc.nextInt();
			else
				throw new NumberFormatException();
			if(s1<0) throw new NegativeValueException(s);
			if(s1>100) throw new ValueOutOfRangeException(s);
			
			
			System.out.print("Chemistry : ");
			if(sc.hasNextInt())
				s2 = sc.nextInt();
			else {
				throw new NumberFormatException();
			}
			if(s2<0) throw new NegativeValueException(s);
			if(s2>100) throw new ValueOutOfRangeException(s);
			
			
			System.out.print("Math      : ");
			if(sc.hasNextInt())
				s3 = sc.nextInt();
			else
				throw new NumberFormatException();
			if(s3<0) throw new NegativeValueException(s);
			if(s3>100) throw new ValueOutOfRangeException(s);
			
			int student =s1+s2+s3;
			System.out.println("Sum of marks in 3 Subject : "+student);
			Totalmarks+=student;
		
			n--;
		}catch(NegativeValueException e) {
			System.out.println(e);
		}
		catch(ValueOutOfRangeException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
		double avg = Totalmarks/2;
		
		System.out.println("Average marks of Two Student : "+avg);
	}
}

class NegativeValueException extends Exception {
	public NegativeValueException(String n) {
		super(n);
	}
}
class ValueOutOfRangeException extends Exception {
	public ValueOutOfRangeException(String v) {
		super(v);
	}
}
