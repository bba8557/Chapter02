package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*Shape 추상클래스 메모리에 혼자올라가면 안됨
		  Shape s = new Shape("빨강", "검정");*/
		
		//Shape 배열 생성
		Shape[] sArray = new Shape[6];
		
		//사각형 생성
		Shape r01 = new Rectangle("검정", "주황", 4, 5);
		Shape r02 = new Rectangle("주황", "검정", 5, 4);
		
		//원형 생성
		Shape c01 = new Circle("빨강", "검정", 4);
		Shape c02 = new Circle("검정", "빨강", 5);
		
		//삼각형 생성
		Shape t01 = new Triangle("초록", "노랑", 7, 6);
		Shape t02 = new Triangle("노랑", "초록", 6, 7);
		
		//배열에 넣기
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = c01;
		sArray[3] = c02;
		sArray[4] = t01;
		sArray[5] = t02;
		
		//for로 출력-면적값도 같이 출력
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
			System.out.println(sArray[i].area());
		}
	}
}
