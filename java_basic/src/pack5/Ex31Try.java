package pack5;

import java.io.FileNotFoundException;
import java.io.FileReader;

//예외처리 : 키보드 입력, 파일 입출력, 네트워크, DB처리 등 외부 장치와 연결해 사용하는 경우
//예기치 못한 장치 에러가 발생할 수 있는데 이를 방지할 목적으로 사용한다
//형식 try { }  catch { } finally { } <== 에러를 내가 잡아 예외를 처리
//throws로 예외를 JVM에게 던기지 가능

public class Ex31Try {
	public String name = "tom";
	
	public void test() {
		try {
			int a [] = {1,2,3};
			System.out.println("배열의 값 출력 : " + a[5]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 오류 = 지역이 우선함");
		}
	}
	
	public void test2() throws Exception{
		FileReader fr2 = new FileReader("C:/work/aaa.txt");
	}
	
	
	public static void main(String[] args) {
		try {
		//파일 작업은 강제로 예외처리를 요구
		//aa.txt가 없는 경우에만 catch 블럭을 수행
			FileReader fr = new FileReader("C:/work/aa.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일읽기 오류");
		}
			
				
		try {
			int su = 2;	//키보드로 변수값을 기억한다고 가정
			int result = 10/su;
			System.out.println("result : " + result);
			
			Ex31Try ex31try = new Ex31Try();
//			Ex31Try ex31try = null;
			System.out.println("이름은 " +  ex31try.name);
			
			ex31try.test();
			ex31try.test2();
			
			
		} catch (ArithmeticException e) {
			System.out.println("나누기 오류 : 0으로 나누기 불가");
		} catch (NullPointerException e) {
			System.out.println("참조변수 오류 (변수가 주소를 창조하지 못함 " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 에러");
		} catch (Exception e) {
			System.out.println("위 catch 이외의 나머지 모든 오류는 여기서 처리");
			//Exception을 가장 먼저 적으면 모든 예외처리는 Exception 블록에서 처리
		}finally {
			System.out.println("에러의 유무와 상관없이 반드시 수행");
		}
		
		
		System.out.println("프로그램 종료");
		}

}
