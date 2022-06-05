package object_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Employee implements Serializable{
	private String name;
	private String dateOfBirth;
	private String department;
	private String designation;
	private double Salary;
	

	public Employee() {
		super();
	}
	
	public Employee(String name, String dateOfBirth, String department, String designation, double salary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.designation = designation;
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateOfBirth=" + dateOfBirth + ", department=" + department
				+ ", designation=" + designation + ", Salary=" + Salary + "]";
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner (System.in);
		
Employee emp1 = new Employee();
		
		System.out.print("Enter name: ");
		emp1.setName(sc.nextLine());
		System.out.print("Enter D.O.B.: ");
		emp1.setDateOfBirth(sc.nextLine());
		System.out.print("Enter department: ");
		emp1.setDepartment(sc.nextLine());
		System.out.print("Enter designation: ");
		emp1.setDesignation(sc.nextLine());
		System.out.print("Enter salary: ");
		emp1.setSalary(sc.nextDouble());
		sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\RAHUL MALI\\eclipse-workspace\\Input_Output_Stream\\src\\object_serialization\\data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\RAHUL MALI\\eclipse-workspace\\Input_Output_Stream\\src\\object_serialization\\data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee)ois.readObject();
		
		System.out.println("Name        :  " + emp2.getName());
		System.out.println("D.O.B.      :  " + emp2.getDateOfBirth());
		System.out.println("Department  :  " + emp2.getDepartment());
		System.out.println("Designation :  " + emp2.getDesignation());
		System.out.println("Salary      :  " + emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		
	}
	
	
}
