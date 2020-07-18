package org.hexaware;

import org.cts.EmployeeDetails;

public class StudentsInfo {

	public void stuAge() {
		
      System.out.println("Student age is 20");
	}
	
	public void stuName() {
		
		System.out.println("Student name is karthik");
	}
	
	public static void main(String[] args) {
		
		StudentsInfo s=new StudentsInfo();
		s.stuAge();
		s.stuName();
		
		EmployeeDetails e=new EmployeeDetails();
		e.empId();
		
		
	}
}
