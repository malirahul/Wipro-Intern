package video_rental_inventory_system;

import java.util.Scanner;

public class VideoLaucher {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoStore vs = new VideoStore();
		int c =0;
		
		do {
		System.out.println("Main Menu"+"\n"+"=================");
		System.out.print("1.Add Videos : "+"\n2.Check Out Video : "+"\n3.Return Rating : "+"\n4.Receive Rating : "+
					"\n5.List Inventory : "+"\n6.Exit : "+"\nEnter your choice (1..6) : ");
		c=sc.hasNextInt()?sc.nextInt() : 6;
		sc.nextLine();
		String name ; 
		
		switch(c) {
		case 1 : 
			System.out.print("Enter the name of the video you want to add : ");
			name = sc.nextLine();
			vs.addVideo(name);
			System.out.println("Video "+name+" added successfully.");
			break;
		case 2 :
			System.out.print("Enter the name of the video you want to check out : ");
			name = sc.nextLine();
			vs.doCheckout(name);
			System.out.println("Video "+name+" checked out successfully.");
			break;
		case 3:
			System.out.print("Enter the name of the video you want to Return : ");
			name = sc.nextLine();
			vs.doReturn(name);
			System.out.println("Video "+name+" returned successfully.");
			break;
		case 4 :
			System.out.print("Enter the name of the video you want to Rate : ");
			name = sc.nextLine();
			System.out.print("Enter the rating for this video : ");
			int rat = sc.nextInt();
			vs.receiveRating(name,rat);
			System.out.println("Rating "+rat+" has been mapped to the Video "+name+".");
			break;
		case 5:
			vs.listInventory();
			break;
		case 6:
			System.out.println("Exiting...!! Thanks for using the application.");
			break;
		default :
			System.out.println("Invalid Choice");
			break;
		}
		
		System.out.println("\n");
		}while(c!=6);
		sc.close();

	}


}
