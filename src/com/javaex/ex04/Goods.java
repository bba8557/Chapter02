package com.javaex.ex04;

public class Goods {
	
	//필드
	private String name;
	private int price;
	//생성자
	
	//메소드 - gs // alt+shift+s 메소드 gs 자동 생성(필드지정후)
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		if(price<0) {
			this.price=0;
		}else {
			this.price = price;
		}//-값이오면 0으로 출력
		
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("");
	}
	
}
