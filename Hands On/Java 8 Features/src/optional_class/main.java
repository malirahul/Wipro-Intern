package optional_class;

public class main {

	public static void main(String[] args) {
		try {

			int a, b;

			b = 0;

			a = b / 5;

			System.out.print("A");

			}

			catch(ArithmeticException e) {

			System.out.print("B");

			} 

			finally {

			System.out.print("C");
			}

	}

}
