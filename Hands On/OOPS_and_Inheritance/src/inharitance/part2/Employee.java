package inharitance.part2;

public class Employee extends Person{
	double annual_sal;
	String start_work;
	String insurance_num;
	
	public Employee(String name, double annual_sal, String start_work, String insurance_num) {
		super(name);
		this.annual_sal = annual_sal;
		this.start_work = start_work;
		this.insurance_num = insurance_num;
	}
	public double getAnnual_sal() {
		return annual_sal;
	}
	public void setAnnual_sal(double annual_sal) {
		this.annual_sal = annual_sal;
	}
	public String getStart_work() {
		return start_work;
	}
	public void setStart_work(String start_work) {
		this.start_work = start_work;
	}
	public String getInsurance_num() {
		return insurance_num;
	}
	public void setInsurance_num(String insurance_num) {
		this.insurance_num = insurance_num;
	}
	@Override
	public String toString() {
		return "Employee [annual_sal=" + annual_sal + ", start_work=" + start_work + ", insurance_num=" + insurance_num
				+ "]";
	}
	
}
