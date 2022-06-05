package wipro.FlowControl;

public class FlowControl15 {

	public static void main(String[] args) {
		
		if(args.length==0) {
			System.out.println("Please enter a number");
		}
		else {
			int n =Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) { 
				int j=0;
			while(j<=i){
				System.out.print("*"+" ");
				j++;
			}
			System.out.println();
		}
		}
	}

}
