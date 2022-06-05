package inharitance;

class Animal{
	
	void eat() {
		System.out.println("Animal:eat method");
	}
	void sleep() {
		System.out.println("Animals:sleep method");
	}
}

class Bird extends Animal{
	void eat() {
		System.out.println("Birds:override eat method");
	}
	void sleep() {
		System.out.println("Birds:override sleep method");
	}
	void fly() {
		System.out.println("Birds are flying in the sky");
	}
}

public class Inheritance_part1 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.sleep();
		
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
		

	}

}
