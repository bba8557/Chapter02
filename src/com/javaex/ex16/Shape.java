package com.javaex.ex16;

public class Shape {
	
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
	//도형이 안정해져서 배경색을 변경함 - 오버라이딩 때문에 만들어줌
	public void draw() {
		//System.out.println("[면색:"+fillColor+", 선색:"+lineColor+"] 도형을 그렸습니다.");
	}
	public double area() {
		return 0;
	}
}
