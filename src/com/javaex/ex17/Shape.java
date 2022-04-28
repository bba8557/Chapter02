package com.javaex.ex17;

//abstract 추상클래스 지정
public abstract class Shape {
	
	//필드 (부모 - 면,선 담당)
	protected String fillColor; 
	protected String lineColor;
	
	//생성자
	public Shape() {
	
	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 - gs
	//=================get======================
	public String getFillColor() {
		return fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	
	//=================set======================
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	public abstract void draw();
	
	public abstract double area();
		
	
}
