package com.objectdemo.pojo;

public class Student {
	
	private int rollno;
	private String name;
	
	public Student() {
	}

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return rollno + " : " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Student ref = (Student) obj; //DOWNCASTING
		return this.rollno == ref.rollno;
	}
}




