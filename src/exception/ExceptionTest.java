package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 1;
		try{
			double b = 100/a;                                 
		}catch(ArithmeticException ex){//예외발생경우 이 예외를 던짐
			//예외처리
			//ex.printStackTrace();//에러출력
			
			//1.사과
			System.out.println("예외발생");
			
			//2.로그 남기기
			System.out.println("exception"+ex);
			
			//3.종료
			return;//이상태로 종료시 24번줄 실행은 안되지만 finally는 실행됨
		}finally{//return 되더라도 반드시 실행.
			//4.자원정리
			System.out.println("자원정리");
		}
	    System.out.println("Some more codes"); // 예외 발생으로 수행되지 않음


	}

}
