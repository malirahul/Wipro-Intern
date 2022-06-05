package wrapper_classes;

public class WC_02 {

	public static void main(String[] args) {
		int gno = Integer.parseInt(args[0]);
		System.out.print("Given Number : "+gno);
		System.out.println();
		
		System.out.print("Binary Equivalent : "+Integer.toBinaryString(gno)+"\n");
		System.out.print("Octal Equivalent : "+Integer.toOctalString(gno)+"\n");
		System.out.print("Hexadecimal Equivalent : "+Integer.toHexString(gno)+"\n");
	}

}
