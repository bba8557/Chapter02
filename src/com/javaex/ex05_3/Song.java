package com.javaex.ex05_3;

public class Song {

	// 필드
	private String title; // 노래 제목
	private String artist; // 가수
	private String album; // 앨범제목
	private String composer;// 작곡가
	private int year; // 연도
	private int track; // 트랙 번호

	// 생성자 => alt+shift+s = Constructor using Fields 자동완성

	public Song() { 
		// 메모리에 올리는일 
		System.out.println("Song()"); 
		}
	

	public Song(String title, String artist, String album, String composer, int year) { 
		//메모리에 올리는일 
		this.title = title; 
		this.artist = artist; 
		this.album =album; 
		this.composer = composer;
	  
	 if(year<0) { 
		 	this.year = 2022; 
	 	}else { 
	 		this.year = year; 
	 	}
	  System.out.println("Song(5)"); 
	  }

	public Song(String title, String artist, String album, String composer, int year, int track) { 
		// 메모리에 올리는일
		this(title,artist,album, composer,year);// 파라미터5개짜리 생성자를 실행

		this.track = track;
		System.out.println("Song(6)");
	}

	// 메소드 - gs => alt+shift+s = Getters and setters 자동완성
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드 - 일반
	public void showInfo() {
		System.out.print(artist + "," + title + "(" + album + "," + year + "," + track + "번 track," + composer + "작곡)");
		System.out.println("");
	}

	// 테스트 => alt+shift+s = Generate to String 자동완성
	@Override
	public String toString() {
		return "Song [artist=" + artist + ", title=" + title + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
