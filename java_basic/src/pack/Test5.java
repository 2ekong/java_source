package pack;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("츨발");
		//aa();	//aa 묶음 (메소드)을 호출, 반환값이 void일때
		boolean bbb = aa();	//반환값이 true / false  되는 메소드 boolean 일때
		System.out.println(bbb);
		System.out.println("계속");
		System.out.println();
		
		System.out.println("논리 연산자 처리할떼 주의할점----------");
		boolean a = true, b = false, c;
		c= a||b;
		System.out.println("c는 " + c);
		c= a&&b;
		System.out.println("c는 " + c);
		System.out.println();
		
		c =abc() || def();
		System.out.println("묶음 c 수행 후는 (or)"+ c);
		System.out.println();
		c =def() || abc();
		System.out.println("묶음 c 수행 후는 (or)"+ c);
		
		System.out.println();
		
		c =abc() && def();
		System.out.println("묶음 c 수행 후는 (and)"+ c);
		System.out.println();
		c =def() && abc();
		System.out.println("묶음 c 수행 후는 (and)"+ c);
		
		System.out.println("-------모두 수행하기------");
		
		c =abc() | def();
		System.out.println("묶음 c 수행 후는 (or)"+ c);
		System.out.println();
		c =def() | abc();
		System.out.println("묶음 c 수행 후는 (or)"+ c);
		
		System.out.println();
		
		c =abc() & def();
		System.out.println("묶음 c 수행 후는 (and)"+ c);
		System.out.println();
		c =def() & abc();
		System.out.println("묶음 c 수행 후는 (and)"+ c);	
		
		System.out.println();
		System.out.println();
		System.out.println("--------주제변경-------");
		System.out.println("--------키보드로 값 받기-------");
		inputTest();
		
		
		
	} // main의 끝으로 끝!
	
	
	
	//public static void aa() {	//반박적으로 실행되는 코드를 별도의 묶음으로 작성
	public static boolean aa() {
		System.out.println("아자1");
		//System.out.println("아자2");
		return true; //반환값

	}
	
	public static boolean abc() {
		System.out.println("abc 출력, 한 줄 수행했지만 abc는 여러행으로 구성된다고 가정");
		return true;
	}
	
	public static boolean def() {
		System.out.println("def 출력");
		return false;
	}
	
	public static void inputTest() {
		String ir = "손오공";
		int nai = 22;
		System.out.println(ir + "님의 나이는 " + nai);
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력");
		String name = sc.next();
		System.out.print("나이 입력");
		int age = sc.nextInt();
		System.out.println(name + "씨의 나이는 " + age);
		
	}
	

}
