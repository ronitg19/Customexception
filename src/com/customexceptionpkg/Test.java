package com.customexceptionpkg;

public class Test {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		System.out.println("Toshi" );
		try {
			studentManager.FindById("Aksha");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
			
		}
		System.out.println("Anand");	
	} 
}
