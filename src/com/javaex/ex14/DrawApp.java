package com.javaex.ex14;

public class DrawApp {

	public static void main(String[] args) {
		
		Ractangle ractangle = new Ractangle("빨강", "검정", 4, 4);
		Ractangle ractangle2 = new Ractangle("주황", "검정", 5, 5);
		
		Triangle triangle = new Triangle("빨강","검정",4,4);
		Triangle triangle2 = new Triangle("보라","검정",10,10);
		
		Circle circle = new Circle("보라","빨강",3);
		Circle circle2 = new Circle("보라","검정",3);
		
		
		Ractangle[] rac = new Ractangle[2];
		rac[0] = ractangle;
		rac[1] = ractangle2;
		for(int i=0; i<rac.length; i++) {
			rac[i].draw();
		}
		
		Triangle[] tri = new Triangle[2];
		tri[0] = triangle;
		tri[1] = triangle2;
		for(int i=0; i<tri.length; i++) {
			tri[i].draw();
		}
				
		Circle[] cir = new Circle[2];
		cir[0] = circle; 
		cir[1] = circle2;
		for(int i=0; i<cir.length; i++) {
			cir[i].draw();
		}
	}

}
