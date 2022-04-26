package com.javaex.ex12;

public class Student extends Person{
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		System.out.println("Student()");
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	public Student(String name, int age, String schoolName) {
		//메모리에 올리는일 super();디폴트 불러오는 명령어
		super(name,age);//부모생성자를 끌어온다.
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	//메소드 - gs
	//================get========================
	public String getSchoolName() {
		return schoolName;
	}
	
	//================set========================
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드 - 일반
	public void showInfo() {
		//부모toString()그대로사용 하고 싶을때 super
		System.out.println(this.toString());
		System.out.println("*학교:"+this.schoolName);
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name" +name+ ", super.getAge()=" + super.getAge() + "]";
	}
}
