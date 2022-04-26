package com.javaex.ex10;

public class Goods {
	
	//필드
	private String name;
	private int price;
	public static int count;
	
	//생성자
	public Goods() {
		this.count = count+1;
	}
	public Goods(String main, int price) {
		this.name = name;
		this.price = price;
		this.count = count+1;
	}
	
	//메소드 - gs
	public String getMain() {
		return name;
	}
	public void setMain(String main) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int conut) {
		this.count = count;
	}
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품명: "+name);
		System.out.println("가격: "+price);
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
