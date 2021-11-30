package com.javaex.ex01;

public class Member {
	
	private String name;
	private int point;
	
	public Member() {
	}
	
	public Member(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("회원정보:"+name+", "+point+"점");
	} 

}
