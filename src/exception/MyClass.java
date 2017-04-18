package exception;

import java.io.IOException;

public class MyClass {
	
	//이 메서드는 io예외를 일으킬 가능성이 있다는것을 밖에 알려줌
	public void dangerousMethod() throws MyException{
		System.out.println("예외 발생 전");
		
		if(1==1)//true의 경우 예외를 던짐
			throw new MyException("예외클래스 테스트-진숙");
		
		System.out.println("예외 발생 후");
	}
}
