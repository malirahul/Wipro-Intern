package exception_handling;

public class EH05 {

	public static void main(String[] args) {
		try {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if(age>=10 && age<60) {
			System.out.println("Name : "+name+"\n"+"Age : "+age);
		}
		else
			throw new AgeOutOfRangeException("Age is Out of Range");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (AgeOutOfRangeException e) {
			System.out.println(e);
		}
		

	}

}
class AgeOutOfRangeException extends Exception {
	public AgeOutOfRangeException(String age) {
		super(age);
	}

}
