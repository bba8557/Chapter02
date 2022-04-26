package com.javaex.ex13;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(4,4);
		//System.out.println(p.toString());
		p.showInfo();
		
		ColorPoint cp1 = new ColorPoint("red");
		//System.out.println(cp1.toString());
		cp1.showInfo();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		//System.out.println(cp2.toString());
		cp2.showInfo();
		
	}

}
