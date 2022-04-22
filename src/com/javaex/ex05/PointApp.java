package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		Point small = new Point();
		small.setX(5);
		small.setY(5);
		small.draw();
		
		Point big = new Point();
		big.setX(10);
		big.setY(23);
		big.draw();
	}

}
