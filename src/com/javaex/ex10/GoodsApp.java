package com.javaex.ex10;
//선 static 사전 조사

public class GoodsApp {
	//필드
	//생성자
	//메소드 gs
	//메소드 일반
	
	public static void main(String[] args) {
		
		Goods camere = new Goods("니콘",400000);
		System.out.println(camere.toString());
		
		Goods computer = new Goods();
		computer.setMain("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵",2000);
		System.out.println(cup.toString());
		
		System.out.println(Goods.count);
	}

}
