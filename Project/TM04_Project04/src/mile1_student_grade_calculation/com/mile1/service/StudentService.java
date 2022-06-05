package mile1_student_grade_calculation.com.mile1.service;

import mile1_student_grade_calculation.com.mile1.bean.Student;

public class StudentService {
	
	public int findNumberOfNullMarksArray(Student s[]){
		int C = 0;
		
		if(s!=null) {
			for(int i=0;i<s.length;i++) {
				if(s[i]!=null) {
					if(s[i].getMarks()==null)
						C++;
				}
					
			}
		}
		
		return C;
	}
	public int findNumberOfNullName(Student s[]){
		int obj = 0;
		
		if(s!=null) {
			for(int i=0;i<s.length;i++) {
				if(s[i]!=null) {
					if(s[i].getName()==null)
						obj++;
				}
					
			}
		}
		return obj;
	}
	
	public int findNumberOfNullObjects(Student s[]){
		int C = 0;
		
		if(s!=null) {
			for(int i=0;i<s.length;i++) {
				if(s[i]!=null) {
					C++;
				}
					
			}
		}
		return C;
	}
	
}
