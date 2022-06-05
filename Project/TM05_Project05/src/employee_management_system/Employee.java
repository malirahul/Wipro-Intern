package employee_management_system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
        void addEmployee(int id,String name ,int age ,int salary) throws IOException
        {
        	FileWriter f=new FileWriter(new File("C:\\Users\\RAHUL MALI\\eclipse-workspace\\TM05_Project05\\src\\employee_management_system\\output.txt"));
        	f.append(String.valueOf(id)+" ");
        	f.append(name+" ");
        	f.append(String.valueOf(age)+" ");
        	f.append(String.valueOf(salary)+".");
        	f.close();
        }
        void display() throws IOException {
        	FileReader f=new FileReader("C:\\Users\\RAHUL MALI\\eclipse-workspace\\TM05_Project05\\src\\employee_management_system\\output.txt");
            int i;
            while((i=f.read())!=-1)
            {
            	System.out.print((char)i);
            }
        }
	public static void main(String[] args) throws IOException {
		System.out.println("Main Menu");
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
             while(true)
             {
            	 System.out.println("1.add");
         		System.out.println("2.display");
         		System.out.println("3.exit");
         		int n=sc.nextInt();
         		if(n==1)
         		{
         	       	System.out.print("Enter employee id : ");
         	       	int id = sc.nextInt();
         	       System.out.println();
         	       	System.out.print("Enter employee name :");
         	       	String name = sc.next();
         	       System.out.println();
         	       	System.out.print("Enter employee age : ");
         	       	int age = sc.nextInt();
         	       	System.out.println();
        	       	System.out.print("Enter employee salary:");
        	       	int sal = sc.nextInt();
        	       	System.out.println();
        	       	e.addEmployee(id, name, age, sal);
         		}
         		else if(n==2)
         		{
         			e.display();
         		}
         		else
         			break;
             }
             
	}

}
