package com.javaex.ex07;

public class Math {
	
	//필드
	
	//생성자
	//public Math(){  }
	//메소드 - gs
	
	//메소드 - 일반 *메소드 오버로딩=>파라미터가 다르기에 같은이름 사용가능
	
	public int plus(int a, int b) { //정수+정수
		return a+b;
	}
	public double plus(double a, int b) { //실수+정수
		return a+b;
	}
	public double plus(int a, double b) { //정수+실수
		return a+b;
	}
	public double plus(double a, double b) { //실수+실수
		return a+b;
	}

}
