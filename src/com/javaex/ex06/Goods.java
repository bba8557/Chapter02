package com.javaex.ex06;

public class Goods {

		//필드
		private String name;
		private int price;
		
		//생성자 void..등등 쓸수없다 alt+shit+s = Generate Constructor using Fields
		public Goods() {
			//*****메모리에 올리는일을한다(클래스를 인스턴스화)
			//로직추가가능(추가가없다면 굳이 안써도됨 알아서 만들어줌)
		}//만들면 기본은 자동기능없어짐 불필요시 제거가능
		public Goods(String name) {
			//*****메모리에 올리는일을한다(클래스를 인스턴스화)
			//추가로직
			this.name = name;
		}
		/*public Goods(int price) {
			//*****메모리에 올리는일을한다(클래스를 인스턴스화)
			this.price = price;
		}*/
		public Goods(String name, int price) {
			//*****메모리에 올리는일을한다(클래스를 인스턴스화)
			//추가로직
			this.name = name;
			this.price = price;
		}
	
		//메소드 - gs 
		//gs자동완성 alt+shift+s = Generata Getters and Setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		//메소드 - 일반 
		public void showInfo() {
			System.out.println("상품이름 : "+name);
			System.out.println("가격 : "+price);
			System.out.println("");
		}
		//코드잘드러갔는지 테스트 alt+shift+s = Generate to String()
		@Override
		public String toString() {
			return "Goods [name=" + name + ", price=" + price + "]";
		}
}	
