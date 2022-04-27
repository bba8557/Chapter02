package com.javaex.ex08;

public class Tv {

	// 필드
	int channel;
	int volume;
	boolean power;

	// 생성자
	public Tv() {
	}

	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 - gs
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean power() {
		return power;
	}

	// 메소드 - 일반
	public void power(boolean on) {
		if(on==true) {
			power=true;
		}
	}

	public void channel(int channel) {

	}

	public void volume(int voluem) {

	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

}
