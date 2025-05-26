package com.school1;

public class School {
	private String schoolname;
	private String schooladdress;
	private String schoolmotto;
	 private  School(String schoolname, String schooladdress,String schoolmotto) {
		 this.schoolname=schoolname;
		 this.schooladdress=schooladdress;
		 this.schoolmotto=schoolmotto;
	 }
	 public void setschoolname(String schoolname) {
		 this.schoolname=schoolname;
		 }
	 public void setschooladdress(String schooladdress) {
		 this.schooladdress=schooladdress;
	 }
	 
	 public void setschoolmotto(String motto) {
		 this.schoolmotto=schoolmotto;
		  }
	 public String getschoolname() {
		 return schoolname;
		 }
	 public String getschooladdress() {
		 return schooladdress;
	 }
	 
	 public String getschoolmotto() {
		 return schoolmotto;
		  }
	
	 
	 public static School 	getschoolobject(String schoolname,String schooladdress, String schoolmotto) {
		 if( NullorEmpty(schoolname) || NullorEmpty(schooladdress)|| NullorEmpty(schoolmotto)){
		 return null;
		 }
		 return new School (schoolname, schooladdress, schoolmotto);
	 }
	  
	 
	 
	 private static boolean NullorEmpty(String schoolname2) {
	
		return false;
	}
	public String toString() {
		return " schoolname:" +schoolname+   "schooladdress:" + schooladdress+   "schoolmotto:"+ schoolmotto;
		  }  
	 
}
package com.student;
import com.school1.School;
public class Student {
	private String studentname;
	private String grade;
	private School school;
	private double averagemarks;
	 private Student(String studentname, String grade, School school double averagemarks) {
		 this.studentname=studentname;
		 this.grade=grade;
		 this.school=school;
		 this.averagemarks=averagemarks;
	 }
	public void setstudentname(String studentname) {
		this.studentname=studentname;
	}
	public void setstudentgrade(String studentgrade) {
		this.grade=grade;
	}
	public void setschool(School school) {
		this.school=school;
	}
	public void setaveragemarks(double averagemarks) {
		this.averagemarks=averagemarks;
	 }
	public String getstudentname() {
		return studentname;
	}
	public String getgrade() {
		return grade;
		} 
	public School getSchool() {
		return school;
	}
	public double averagemarks() {
		return averagemarks;
	}
	
	public String toString() {
		return "studentname:"+studentname +" studentgrade:"+getgrade()+"School:"+school+"averagmarks:"+averagemarks;
	}
	public static  Student getstudentobject(String studentname, String grade, School school double averagemarks) {
		if(studentname=null) {
			return null;
			 }
		if(averagemarks<0||averagemarks>100) {
			return null;
		}
		return new Student(name,grade,school,averagemarks);
	  }

	
	
	
}
package com.main;

import com.school1.School;
import com.student .Student;
public class Main {
public static void main(String[] args) {
	School school= School.getschoolobject(" narayana"," hyderabad","flings wings");
	if(school==null) {
		System.out.println(" failed");
	}
		else { System.out.println("created");
	}
	 Student student =Student.getstudentobject("gopi"  "A",school,100);
	 System.out.println(school);
	 System.out.println(student);
}
}




