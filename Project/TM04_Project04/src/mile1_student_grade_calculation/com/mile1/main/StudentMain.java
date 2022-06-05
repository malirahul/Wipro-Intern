package mile1_student_grade_calculation.com.mile1.main;

import mile1_student_grade_calculation.com.mile1.bean.Student;
import mile1_student_grade_calculation.com.mile1.exception.NullMarksArrayException;
import mile1_student_grade_calculation.com.mile1.exception.NullNameException;
import mile1_student_grade_calculation.com.mile1.exception.NullStudentObjectException;
import mile1_student_grade_calculation.com.mile1.service.StudentReport;
import mile1_student_grade_calculation.com.mile1.service.StudentService;




public class StudentMain {
	
	static Student data[] = new Student[10];
	
	static{
		for(int i=0;i<data.length;i++)
			data[i] = new Student();
	
	data[0] = new Student("A1",new int[] {72,73,74},null);
	data[1] = new Student("B1",new int[] {75,76,77},null);
	data[2] = new Student("C1",new int[] {99,99,99},null);
	data[3] = new Student("C3",new int[] {100,100,99},null);
	data[4] = new Student("B2",new int[] {13,88,13},null);
	data[5] = new Student("C3",new int[] {14,14,99},null);
	data[6] = new Student("A2",new int[] {77,55,12},null);
	data[7] = new Student(null,new int[] {13,88,13},null);
	data[8] = new Student("A2",null,null);
	data[9] = null;
	}
	public static void main(String[] args) {
		
		System.out.println("Grade Calculation : ");
		StudentReport sr = new StudentReport();
		
		String s = null;
		for(int i=0;i<data.length;i++) {
			try {
				s = sr.validate(data[i]);
			} catch (NullNameException e) {
				s = "NullNameException";
				e.printStackTrace();
			} catch (NullMarksArrayException e) {
				s = "NullMarksArrayException";
				e.printStackTrace();
			} catch (NullStudentObjectException e) {
				s = "NullStudentObjectException";
				e.printStackTrace();
			}
			
			if(s=="VALID")
				System.out.println(sr.findGrades(data[i])+" ");
		}
		
		
		StudentService ss = new StudentService();
		System.out.print("Number of Null Marks Array : "+ss.findNumberOfNullMarksArray(data));
		System.out.println();
		System.out.print("Number of Null Name : "+ss.findNumberOfNullName(data));
		System.out.println();
		System.out.print("Number of Null Objects : "+ss.findNumberOfNullObjects(data));

	}

}
