package com.jx372.paint.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color){
		//setX(x);
		//setY(y);//부모클래스의 x,y가 private라서 접근불가 > 메서드로 접근
		super(x,y);//부모생성자 명시적 호출.
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		//super.show(); //부모 메서드 일단 호출 하나 완전 재정의를 위해 사용하지 않음
		System.out.println("점[x="+getX()+", y="+getY()+", color="+color+"]에 점을 찍었습니다");
	}
	
	
	
}
