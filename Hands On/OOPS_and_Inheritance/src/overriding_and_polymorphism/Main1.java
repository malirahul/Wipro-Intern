package overriding_and_polymorphism;

class Fruit{
	String name;
	String taste;
	String size;
	public Fruit(String name, String taste, String size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	void eat() {
		System.out.println("Name : "+name+" , "+"Taste : "+taste);
	}
}
class Apple extends Fruit{
	
	public Apple(String name, String taste, String size) {
		super(name, taste, size);
	}

	void eat() {
		System.out.println("Name : "+name+" , "+"Taste : "+taste);
	}
}
class Orange extends Fruit{
	
	public Orange(String name, String taste, String size) {
		super(name, taste, size);
	}

	void eat() {
		System.out.println("Name : "+name+" , "+"Taste : "+taste);
	}
}

public class Main1 {

	public static void main(String[] args) {
		Apple a = new Apple("Apple","Sweet","Heart");
		a.eat();
		Orange o = new Orange("Orange","Sour","Oval");
		o.eat();

	}

}
