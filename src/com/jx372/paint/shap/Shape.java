package com.jx372.paint.shap;

import com.jx372.paint.i.Drawable;
import com.jx372.paint.i.Resizable;

public class Shape implements Drawable,Resizable{
	private String lineColor;
	private String fillColor;
	
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	@Override
	public void resize(double rate) {
		
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
	/*public void draw(){
		//자식 클래스에서 오버라이딩 하지 않는 경우 이렇게 출력됨
		System.out.println("구체적인 도형을 그릴 수 없습니다.");
	}*/
}
