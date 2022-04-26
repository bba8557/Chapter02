package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		p1.draw();
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		p2.draw();
		
		Point p3 = new Point(10, 20);
		p3.draw();
		
		Point p4 = new Point(100);//x값먼저줌
		p4.setY(200);
		p4.draw();
		
		//y값을 먼저 넣고
		//setter x값을 넣는다
		Point p5 = new Point(200);//y값먼저줌
		p5.setX(100);
		p5.draw();
		
		p1.draw(false); //지우기
	}

}
