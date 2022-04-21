package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		Point small = new Point();
		small.satWidth(5);
		small.satLength(5);
		small.draw();
		
		Point big = new Point();
		big.satWidth(10);
		big.satLength(23);
		big.draw();
	}

}
