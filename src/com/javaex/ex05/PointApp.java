package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		Point small = new Point();
		small.satX(5);
		small.satY(5);
		small.draw();
		
		Point big = new Point();
		big.satX(10);
		big.satY(23);
		big.draw();
	}

}
