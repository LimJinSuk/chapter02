package com.jx372.paint.main;

import com.jx372.paint.i.Drawable;
import com.jx372.paint.i.Resizable;
import com.jx372.paint.point.ColorPoint;
import com.jx372.paint.point.Point;
import com.jx372.paint.shap.Circle;
import com.jx372.paint.shap.Ract;
import com.jx372.paint.shap.Shape;
import com.jx372.paint.shap.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		Point point2 = new Point(100,50);
		
		point1.setX(10);
		point1.setY(20);
		
		//point1.show();
		draw(point1);
		point1.show(false);
		//point2.show();
		draw(point1);
		point2.show(false);
		
		Point point3 = new ColorPoint(50,80,"red");//자식객체 부모 레퍼런싱
		//point3.show(true);
		draw(point3);
		
		Shape s = new Ract();
		s.draw();
		//객체는 사각형이지만 사각형클래스에서 오버라이딩 하지않는경우는 부모의 draw메서드가 호출됨
		draw(new Ract());
		draw(new Circle());
		draw(new Triangle());
		instanceofTest();
	}
	/*public static void draw(Shape s){
		s.draw();
		//=Shape s = new Ract();
		//s.draw(); 각 도형마다 오버라이딩 된 draw()메서드 실행됨
	}*/
	//Drawable drawable = new Ract();
	public static void draw(Drawable drawable){
		drawable.draw();
	}
	
	public static void resize(Drawable drawable, double rate) {
		if(drawable instanceof Resizable){//인터페이스끼리는 구현이 되었는가를 묻는 것 //에러방지 확인절차
			Resizable resizable = (Resizable) drawable;
			resizable.resize(rate);
		}
	}
	
	public static void instanceofTest(){
		Shape s = new Circle();
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Ract);
		System.out.println(s instanceof Triangle);
		
		Ract r = new Ract();
		//클래스 경우에는 상속관계만 질의할 수 있다.
		//System.out.println(r instanceof Circle);
		System.out.println(r instanceof Shape);
		System.out.println(r instanceof Object);
		System.out.println(r instanceof Ract);
		
		//인터페이스의 경우 구현/상속 상관없이 모두 다 질의가 가능하다.
		ColorPoint pt = new ColorPoint(10,20,"yellow");
		System.out.println(pt instanceof Resizable);
		System.out.println(pt instanceof Drawable);
		System.out.println(pt instanceof Point);
		System.out.println(pt instanceof ColorPoint);
		
	}
}
