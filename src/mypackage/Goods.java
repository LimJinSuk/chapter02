package mypackage;

public class Goods {
	
	public final static float Discount_Rate = 0.2f;
	public static int countOfGoods;//클래스 변수
	
	public String name;    //전부
	protected int price;   //같은 패키지+자식 
	int countStock;        //(default)같은 패키지
	private int countSold; //같은 클래스 내부에서만
	
	public Goods(){
		Goods.countOfGoods++;//클래스변수는 클래스명.변수명으로 호출하나
		//해당클래스 내에선 생략 가능
	}
	
	public void setPrice(int price){
		if(price<0)
			price=0;
		this.price=price;
	}
	
	public void setCountSold(int countSold){
		//현재 객체자신의 필드 
		this.countSold = countSold;
	}
	
	public void showInfo(){
		System.out.println("name : "+name);
		System.out.println("price : "+price);
		System.out.println("stock : "+countStock);
		System.out.println("sold : "+countSold);
	}
	
	public int getCountSold(){
		return countSold;
	}
	
	public int calcEoscountPrice(int percentage){
		int discountPrice = price * percentage / 100;
		return discountPrice;
	}
}
