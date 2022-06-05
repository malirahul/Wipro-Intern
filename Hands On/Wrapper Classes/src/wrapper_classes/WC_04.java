package wrapper_classes;

class Employee implements Cloneable{
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

public class WC_04 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Rahul Mali");
		Employee empClone = emp.clone();
		
		empClone.setName("Dev");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());

	}

}
