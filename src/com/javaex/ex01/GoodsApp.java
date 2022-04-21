package com.javaex.ex01;
//메모리 운영 스토리(메인 스토리)
public class GoodsApp {

	public static void main(String[] args) {
		//빵틀
		Goods camera = new Goods();
		
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
	}

}
