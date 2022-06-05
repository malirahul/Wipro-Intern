package classes_and_objects;

import java.util.Scanner;

class Box{
	double width;
	double height;
	double depth;
	Box(double width,double height,double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		double vol = width*height*depth;
		return vol;
	}
	
}

public class CAO1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextInt();
		double h=sc.nextInt();
		double d=sc.nextInt();
		
		Box b = new Box(w,h,d);
		System.out.println(b.volume());
	}

}
