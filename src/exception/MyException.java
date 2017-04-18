package exception;

public class MyException extends Exception {
	public MyException(){
		super("MyException Occur");
		//기본 메세지 지정
	}
	
	public MyException(String message){
		super(message);
		//사용자 지정 메세지
	}
}
