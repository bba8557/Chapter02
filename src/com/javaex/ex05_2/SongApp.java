package com.javaex.ex05_2;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song();
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setComposer("이민수");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.showInfo();
		
		Song big = new Song();
		big.setArtist("BIGBANG");
		big.setTitle("거짓말");
		big.setAlbum("Always");
		big.setComposer("G-DRAGON");
		big.setYear(2007);
		big.setTrack(2);
		big.showInfo();
		
		Song busker = new Song();
		busker.setArtist("버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setAlbum("버스커버스커1집");
		busker.setComposer("장범준");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.showInfo();
	}

}
