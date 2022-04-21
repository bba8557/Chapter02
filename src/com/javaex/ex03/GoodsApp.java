package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		String cameraName = camera.getName();
		System.out.println(cameraName);
		int cameraPrince = camera.getPrice();
		System.out.println(cameraPrince);
		System.out.println("상품이름: "+camera.getName()+", 가격은 "+camera.getPrice()+" 원 입니다.");
		
		System.out.println("=====================================================================");
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		String computerName = computer.getName();
		System.out.println(computerName);
		int computerPrice = computer.getPrice();
		System.out.println(computerPrice);
		System.out.println("상품이름: "+computer.getName()+", 가격은 "+computer.getPrice()+"원 입니다.");
	
		System.out.println("=====================================================================");
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		String cupName = cup.getName();
		System.out.println(cupName);
		int cupPrice = cup.getPrice();
		System.out.println(cupPrice);
		System.out.println("상품이름: "+cup.getName()+", 가격은 "+cup.getPrice()+"원 입니다.");
	}

}
