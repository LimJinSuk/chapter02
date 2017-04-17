package chap02;

import mypackage.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.name = "nikon";
		
		//protected 같은 패키지 또는 자식클래스에서만 접근 가능
		//camera.price = 400000;
		
		//default 같은 패키지 에서만 접근 가능.
		//camera.countStock = 30;
		
		//private 내부에서만 가능
		//camera.countSold = 50;
		
		System.out.println(camera);
		System.out.println("name : "+camera.name);
		//System.out.println("price : "+camera.price);
		//System.out.println("stock : "+camera.countStock);
		//System.out.println("sold : "+camera.countSold);
		camera.setCountSold(10);
		camera.getCountSold();
		
		camera.setPrice(-10000);
		camera.showInfo();
	}

}
