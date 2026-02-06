package com.demo.spring.springcore.constructorInjection.ambiguity;

public class Addition {
	Addition(double a, double b){
		System.out.println("Inside Constructor DOUBLE");
	}
	Addition(int a, int b){
		System.out.println("Inside Constructor INT");
	}
	Addition(String a, String b){
		System.out.println("Inside Constructor STRING");
	}
	
	Addition(int a, double b){
		System.out.println("Integer a is: "+a);
		System.out.println("Double is :"+b);
	}
}
