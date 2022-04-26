package com.javaex.ex13;

public class ColorPoint extends Point {
	
	//필드
	private String color; 
	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
		System.out.println("ColorPoint(3)");
	}
	
	//메소드 - gs
	//================get==================
	public String getColor() {
		return color;
	}
	
	//================set==================
	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println(super.x+","+super.y+","+this.color);
	}
	
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
}
