package com.javaex.ex03;

public class Goods {
	
	//필드-값
	private String name;
	private int price;
	
	//생성자
	
	//메소드 - gs(겟터세터)-동작
	public void setName(String n){
		name = n;	
	}//void 리턴 되는게없다
	public void setPrice(int p) {
		price = p;
	}
	//출력시 필요작업
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	//메소드 -일반
}

/*접근자 틀에 직접 입력함. 
	private 완전한 통제(값 보호)
	public  완전한 개방 */
