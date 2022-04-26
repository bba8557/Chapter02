package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		/*Person p01 = new Person("장희만", 30);
		  System.out.println(p01);
		  p01.showInfo();*/
		
		//Student s01 = new Student("서울고등학교");
		/*
		Student s02 = new Student();
		s02.setName("장희만");
		s02.setAge(30);
		s02.setSchoolName("서울고등학교");
		*/
		//System.out.println(s02.toString());
		
		Student s03 = new Student("장희만",30,"서울고등학교");
		System.out.println(s03.toString());
		s03.showInfo();
	}

}
