package mile1_student_grade_calculation.com.mile1.service;

import mile1_student_grade_calculation.com.mile1.bean.Student;
import mile1_student_grade_calculation.com.mile1.exception.NullMarksArrayException;
import mile1_student_grade_calculation.com.mile1.exception.NullNameException;
import mile1_student_grade_calculation.com.mile1.exception.NullStudentObjectException;


public class StudentReport {
	
	public String findGrades(Student StudentObject) {
		int[] marks = StudentObject.getMarks();
		int sum = 0;
		
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<35)
				return "F";
			else
				sum+=marks[i];
		}
			if(sum<150) 
				return "C";
			else if(sum<200)
				return "B";
			else if(sum<250)
				return "A";
			else
				return "A+";
		
	}
	
	public String validate(Student s) throws NullNameException,NullMarksArrayException,NullStudentObjectException{
		
		if(s==null)
			throw new NullStudentObjectException();
		else {
			if(s.getName()==null)
				throw new NullNameException();
			else if(s.getMarks()==null)
				throw new NullMarksArrayException();
			else
				return "VALID";
		}
		
	}

}
