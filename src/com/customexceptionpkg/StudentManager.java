package com.customexceptionpkg;

public class StudentManager {
	
	public Student FindById(String studentId ) {
		if (studentId.equals("Akshay")) {
		return new Student();
		} else {
			throw new StudentNotFoundException("Akshay not found...."+ " Given input...   "+studentId);
		}
			
	}

}
