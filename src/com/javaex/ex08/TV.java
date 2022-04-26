package com.javaex.ex08;

public class TV {
		
	//필드
	int channel;
	int volume;
	boolean power;
	
	//생성자
	public TV() {
	}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	//메소드 - gs
	public int getChannel() {
		if(channel<0) {
			return channel=7;
		}else {
			return channel;
		}
	}
	public int getVolume() {
		if(volume<0) {
			return volume=20;
		}else {
			return volume;
		}
	}
	public boolean power() {
		if(power=false) {
			return power=true;
		}else {
			return power;
		}
	}
	
	//메소드 - 일반
	public void power(boolean on) {
		
		
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
