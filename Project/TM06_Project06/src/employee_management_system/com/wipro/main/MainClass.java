package employee_management_system.com.wipro.main;

import java.util.Scanner;

import employee_management_system.com.wipro.bean.EmployeeBean;
import employee_management_system.com.wipro.service.EmployeeService;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeBean eb = new EmployeeBean(101,"Rahul",10000,"CSE");
		EmployeeBean eb1 = new EmployeeBean(102,"Dev",15000,"IT");
		EmployeeBean eb2 = new EmployeeBean(103,"Chayan",12000,"CSE");
		EmployeeBean eb3 = new EmployeeBean(104,"Lalit",16000,"CSE");
		EmployeeBean eb4 = new EmployeeBean(105,"Tim",20000,"CSE");
		EmployeeService es = new EmployeeService();
		es.insertEmployee(eb);
		es.insertEmployee(eb1);
		es.insertEmployee(eb2);
		es.insertEmployee(eb3);
		es.insertEmployee(eb4);
		es.fetchAllEmployees();
        EmployeeBean e=es.findEmployeeByEmpID(104);
        System.out.println(e.getEmpID()+" "+e.getName());
        EmployeeBean eb5= new EmployeeBean(105,"Rohit",30000,"Mi");
        es.updateEmployeeByEmpID(eb5);
        es.fetchAllEmployees();
	}

}
