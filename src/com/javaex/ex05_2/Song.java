package com.javaex.ex05_2;

public class Song {
	
	//필드
	private String title, artist, album, composer;
	private int year, track;
	
	//생성자
	
	//메소드 - gs
	public void setTitle(String e) {
		title = e;//노래제목
	}
	public void setArtist(String t) {
		artist = t;//가수
	}
	public void setAlbum(String m) {
		album = m;//앨범제목
	}
	public void setComposer(String c) {
		composer = c;//작곡가
	}
	public void setYear(int y) {
		year = y;//연도
	}
	public void setTrack(int k) {
		track = k;//트랙번호
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getalbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	
	//메소드 - 일반
	public void showlfo() {
		System.out.print(artist+ "," +title+ "(" +album+ "," +year+ "," +track+ "번 track," +composer+ "작곡)" );
		System.out.println("");
	}
	
}
