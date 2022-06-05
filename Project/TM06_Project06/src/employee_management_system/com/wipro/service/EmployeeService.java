package employee_management_system.com.wipro.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import employee_management_system.com.wipro.bean.EmployeeBean;

public class EmployeeService {
	
	 private List<EmployeeBean> listEmp = new ArrayList<>();
	
	public boolean insertEmployee(EmployeeBean bean) {
		listEmp.add(bean);
		if(listEmp.contains(bean))
			return true;
		else
		return false;
	}
	
	public String insertEmployeeByPosition(EmployeeBean bean,int position) {
		if(position>listEmp.size()) {
			listEmp.add(bean);
			return "Inserted employee at end position ";
		}
		else {
		listEmp.add(position, bean);
		return "Inserted employee at position "+listEmp.indexOf(bean);
		}
	}
	
	public List<EmployeeBean> fetchAllEmployees(){
	   for(int i=0;i<listEmp.size();i++)
	   {
		   System.out.println(listEmp.get(i).getName()+" "+listEmp.get(i).getEmpID()+" "+listEmp.get(i).getSalary()+" "+listEmp.get(i).getDesignation());
	   }
		return listEmp;		
	}
	public boolean deleteEmployeeByEmpID(int empID) {
		ListIterator<EmployeeBean> li = listEmp.listIterator();
	    while (li.hasNext()) {
	         if(li.next().getEmpID()==empID) {
	        	 li.remove();
	         return true;
	         }
	    }
	    	return false;	
	}
	
	public boolean updateEmployeeByEmpID(EmployeeBean bean) {
		ListIterator<EmployeeBean> li = listEmp.listIterator();
	    while (li.hasNext()) {
	       if(li.next().getEmpID()==bean.getEmpID())
	       {
	         li.set(bean);
	    	   return true;
	       }
	    }
	    return false;
	}
	
	public EmployeeBean findEmployeeByEmpID(int empID) {
		ListIterator<EmployeeBean> li = listEmp.listIterator();
	    while (li.hasNext()) {
	         if(li.next().getEmpID()==empID) {
	        	 return li.next();
	         }
	         
	    }
	    return null;
	}

}
