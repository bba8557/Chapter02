package com.javaex.ex13;

public class Point {
	
	//필드
	protected int x;
	protected int y;
	
	//생성자
	public Point() {
		System.out.println("Point()");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}
	//메소드 - gs
	//================get=================
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//================set=================
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println(x+","+y);
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
