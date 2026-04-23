package com.spring.springcore.revision1.constructorInjection.ambiguity;

public class Student {
	public Student(String id, String age) {
		System.out.println("Both are String");
	}
	
	public Student(int intId, int intAge) {
		System.out.println("Both are Integer");
	}
}
