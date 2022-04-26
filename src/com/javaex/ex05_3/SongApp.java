package com.javaex.ex05_3;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song();
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setComposer("이민수");
		iu.setYear(2010);
		iu.setTrack(3);
		
		Song big = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,2);
		
		Song busker = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		
		//테스트
		//System.out.println(iu.toString());
		//System.out.println(big.toString());
		//System.out.println(busker.toString());
		
		iu.showInfo();
		big.showInfo();
		busker.showInfo();
	}

}
