package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	//CheckedException
	public static void main(String[] args) {
		try{
		//java.io에 들어있는 파일 입력스트림 클래스
		FileInputStream fis=new FileInputStream("/hello.txt");
		fis.read();
		
		}catch(FileNotFoundException ex){
			//파일이 존재하지 않을경우 의 예외를 던짐
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException ex){
			System.out.println("파일 읽기 실패");
		}
	}
}
