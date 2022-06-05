package wipro.project01;



public class MiniProject01 {

	public static void main(String[] args) {
		int id = Integer.parseInt(args[0]);
		
		int empNo[] = {1001,1002,1003,1004,1005,1006,1007};
		String empName[] = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String joinDate[] = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/200","12/06/2006"};
		char desig_code[] = {'e','c','k','r','m','e','c'};
		String dept[] = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int basic[] = {20000,30000,10000,12000,50000,23000,29000};
		int hra[] = {8000,12000,8000,6000,20000,9000,12000};
		int it[] = {3000,9000,1000,2000,20000,4400,10000};
		
		
		
		String design_emp[] = new String[7];
		int da_sal[];
		da_sal=new int[7];
		int salary[]=new int[7];
		
		for(int a=0;a<7;a++)
		{
			if(desig_code[a]=='e')
			{
				design_emp[a]="Engineer";
				da_sal[a]=20000;
			}
			else if(desig_code[a]=='c')
			{
				design_emp[a]="Consultant";
				da_sal[a]=32000;
			}
			else if(desig_code[a]=='k')
			{
				design_emp[a]="Clerk";
				da_sal[a]=12000;
			}
			else if(desig_code[a]=='r')
			{
				design_emp[a]="Receptionist";
				da_sal[a]=15000;
			}
			else if(desig_code[a]=='m')
			{
				design_emp[a]="Manager";
				da_sal[a]=40000;
			}
		}
		
		
		for(int b=0;b<7;b++)
		{
			salary[b] = basic[b] + hra[b] + da_sal[b] - it[b];
		}
		
		for(int i=0;i<=7;i++)
		{
			if(i==7)
			{
				System.out.println("there is no employee with empid : "+id);
				break;
			}
			else if(empNo[i]==id)
			{
				System.out.println("Emp No "+" Emp Name "+" Department "+" Designation "+" Salary");
				System.out.print(empNo[i]+"    "+empName[i]+"      "+dept[i]+"        "+design_emp[i]+"       "+salary[i]);
				break;
			}
			
		}
		
		
		
 
		
	}

}
