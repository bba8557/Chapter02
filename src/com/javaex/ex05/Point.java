package com.javaex.ex05;

public class Point {
	
	//필드
	private int x;
	private int y;
	//생성자
	
	//메소드 - gs  *this.필드이름(메타몽 같은존재)
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//메소드 - 일반
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}

	

}