package com.javaex.ex05_3;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song("아이유", "좋은날", "Real", "이민수", 2010, 3);
		Song big = new Song("BIGBANG", "거짓말", "Always", "G-DRAGON", 2007, 2);
		Song busker = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", "장범준", 2012, 4);
		
		//테스트
		System.out.println(iu.toString());
		System.out.println(big.toString());
		System.out.println(busker.toString());
		
		iu.showlfo();
		big.showlfo();
		busker.showlfo();
	}

}
