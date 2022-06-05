package wipro.FlowControl;

public class FlowControl1 {

	public static void main(String[] args) {
		System.out.println(args[0] + " " + args[1]);
		
		if(Integer.parseInt(args[0])==0 && Integer.parseInt(args[1]) == 0) {
			System.out.println("Given values are zero");
		}
		else if(Integer.parseInt(args[0])==0 && Integer.parseInt(args[1]) > 0) {
			System.out.println("Given one value is zero");
		}
		else if(Integer.parseInt(args[0])>0 && Integer.parseInt(args[1]) == 0) {
			System.out.println("Given one value is zero");
		}
		
		else if(Integer.parseInt(args[0])>0 && Integer.parseInt(args[1]) > 0) {
			
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			int x =a%10;
			int y =b%10;
			if(x==y) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
			
			
		}
		
		if(Integer.parseInt(args[0])<0 && Integer.parseInt(args[1]) < 0) {
			System.out.println("Given values are negative");
		}
		else if(Integer.parseInt(args[0])<0 && Integer.parseInt(args[1]) > 0) {
			System.out.println("Given one value is different");
		}
		else if(Integer.parseInt(args[0])<0 && Integer.parseInt(args[1])== 0) {
			System.out.println("Given one value is zero");
		}

	}

}
