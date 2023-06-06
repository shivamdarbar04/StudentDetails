package com.objectdemo.main;

import com.objectdemo.pojo.Student;

public class AppMain {

	public static void main(String[] args) {

		Student s1 = new Student(41, "Amit");
		System.out.println("s1's details : ");	
		System.out.println(s1);
		
		Student s2 = new Student(41, "Sumit");
		System.out.println("s2's details : ");
		System.out.println(s2);
		
		if(s1.equals(s2))
			System.out.println("s1 and s2 are same");
		else
			System.out.println("s1 and s2 are not"
					+ " same"); 
		
		System.out.println("s1's hashcode : " +
				s1.hashCode());
		
		System.out.println("s2's hashcode : " +
				s2.hashCode());
	}
}



