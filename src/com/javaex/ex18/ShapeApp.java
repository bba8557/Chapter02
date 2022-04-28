package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Point p01 = new Point(3, 5);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(40, 100);
		p02.draw();
		//p02.getX;
		
		System.out.println("===============================");
		Rectangle r00 = new Rectangle("빨강", "검정", 5, 5);
		r00.draw();
		r00.area();
		
		Shape r01 = new Rectangle("빨강", "검정", 5, 5);
		r01.area();
		//r01.draw(); X 안됨
		
		Drawable r02 = new Rectangle("검정", "빨강", 10, 10);
		r02.draw();
		//r02.area(); X 안됨
		//r02.getWidth(); X 안됨
		*/
		
		//배열선언
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Rectangle("빨강", "검정", 1, 1);
		Drawable c01 = new Circle("파랑", "검정", 3);
		Drawable t01 = new Triangle("주황", "검정", 5, 5);
		Drawable p01 = new Point(8, 8);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로값
		System.out.println(((Rectangle)dArray[0]).getWidth());
		
		//사각형의 면의색
		System.out.println(((Shape)dArray[0]).getFillColor());
		
		//도형의 면적
		System.out.println(((Shape)dArray[0]).area());
		
		System.out.println("=======================================");
		System.out.println("배열의 통해서 면적 구하기");
		
		for(int i=0; i<dArray.length; i++) {
			//System.out.println(dArray[i] instanceof Shape);
			
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
			
			/*double area = ((Shape)dArray[i]).area();
			System.out.println(area);*/
		}
		
		
	}
}
