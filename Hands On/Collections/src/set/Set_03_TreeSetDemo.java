package set;

import java.util.Comparator;
import java.util.TreeSet;

class Employee{
	public int empID;
	@Override
	public String toString() {
		return "empID=" + empID + ", name=" + name + ", salary=" + salary ;
	}

	public String name;
	public float salary;
	
	public Employee(int empID, String name, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	
	
}

class MyComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		if(e1.salary>e2.salary)
			return 1;
		else if(e1.salary<e2.salary)
			return -1;
		else
		return 0;
	}
}

public class Set_03_TreeSetDemo {

//	boolean addEmployee(Employee emp) {
	     
	//}
	public static void main(String[] args) {
		
		System.out.println("Sorting on the basis of salary in ascending order ");
		
		TreeSet<Employee> ts1 = new TreeSet<>(new MyComparator());
		ts1.add(new Employee(1,"Rahul",29550));
		ts1.add(new Employee(2,"Rahul12",39550));
		ts1.add(new Employee(4,"Rahul23",24550));
		ts1.add(new Employee(9,"ggg",59550));
		for(Employee e:ts1) {
			System.out.println(e.toString());
		}
		

	}

}
