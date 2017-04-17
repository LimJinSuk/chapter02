package chap02;

import mypackage.Goods;

public class SpecialGoods extends Goods {//굳즈의 자식클래스
	public void test(){
		price = 0; //protected 다른 패키지여도 자식클래스는 접근 가능
	}
}
