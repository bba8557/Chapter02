package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		//배열 생성
		Ractangle[] rArray = new Ractangle[2];
		Triangle[] tArray = new Triangle[2];
		Circle[] cArray = new Circle[2];
		
		//사각형생성
		Ractangle ractangle = new Ractangle("빨강", "검정", 4, 4);
		Ractangle ractangle2 = new Ractangle("주황", "검정", 5, 5);
		
		//배열에 사각형 추가하기
		rArray[0] = ractangle;
		rArray[1] = ractangle2;
		
		//배열을 이용해서 전체 사각형 출력하기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		System.out.println("==============================================");
		
		Triangle triangle = new Triangle("빨강","검정",4,4);
		Triangle triangle2 = new Triangle("보라","검정",10,10);
		
		tArray[0] = triangle;
		tArray[1] = triangle2;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		System.out.println("==============================================");
		
		Circle circle = new Circle("보라","빨강",3);
		Circle circle2 = new Circle("보라","검정",3);
		
		cArray[0] = circle; 
		cArray[1] = circle2;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
	}

}
