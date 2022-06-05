package mile1_student_grade_calculation.com.mile1.bean;

public class Student {
	String name;
	int marks[];
	String grade;
	
	
	public Student(String name, int[] marks, String grade) {
		super();
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	

	public Student() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
