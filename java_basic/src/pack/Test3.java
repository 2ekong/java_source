package pack;

public class Test3 {
	public static void main(String[] args) {
		//산술 연산자
		int a = 5;	// = (대입연산자)의 기능 a 변수에 리터럴 5를 기억시킴
		int b = 3;
		int c = a + b;
		System.out.println(c);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); 	//몫
		System.out.println(a%b);	//나머지
		System.out.println(a/(double)b); //큰 타입에 맞춰 b가 double이나 a도 자동으로 double로 변환
		
		System.out.println();
		//System.out.println(a/0);	//불능 runtime error(설정오류)
		System.out.println(a/0.0);	//Infinity(무한대)
		System.out.println(a%0.0);	//NaN(Not a Number) 숫자가 아니라서 숫자로 표현할 수 없는 상태

		System.out.println("산술연산자 우선 순위");
		System.out.println(3+4*5);
		System.out.println((3+4)*5);
		System.out.println("문자열 더하기");
		String ss1 = "대한";	//String은 기본형이 아니라 참조형변수임. 사용방법은 기본형처럼 같다
		String ss2 = "민국";
		System.out.println(ss1 + ss2);	//이때는 문자열 더하기
		//System.out.println(ss1 - ss2);	//불가능
		System.out.println(ss2 + " "+ 2025);	//2025정수는 문자열로 자동 형변환 후 문자열 더하기
		System.out.println(ss2 + " "+ 2000+25);		//2000, 25 둘다 자동으로 형변환 후 문자열 더하기
		System.out.println(ss2 + " "+ (2000+25));		//()안에 먼저 계산 산술로 더하고 문자열 더하기
		
		String ss3 = "5"+6;	// 문자열 더하기 숫자가 아님 둘다 문자열로 자동으로 형변환
		System.out.println("ss3: " + ss3);
		System.out.println("5" + 6);
		System.out.println(5 + 6);
		System.out.println(Integer.toString(5) + 6);	//="5" +6
		System.out.println(Integer.parseInt("5") + 6);	//=5+6
		int no = 1;
		no= no+1;
		no +=1;	//no -=2, no *=2, no /=2
		no++;	//증강연산자(후위)	no--;
		++no;	//증강연산자(전위)	--no;
		System.out.println("no: "+no);
		
		int imsi = 5;
		int result = ++imsi +1;
		System.out.println("imsi: " + imsi);
		System.out.println("result: " + result);
		
		int imsi2 = 5;
		int result2 = imsi2++ +1;//계산을 하고 난 후 증강
		System.out.println("imsi2: " + imsi2);
		System.out.println("result2: " + result2);
		
		System.out.println("부호에 대해..");
		int imsi3 = 7;
		System.out.println("imsi: " + imsi3);
		System.out.println("imsi: " + -imsi3);
		System.out.println("imsi: " + -1 * imsi3);
		int imsi4 = -1 * imsi3;
		System.out.println("imsi4: " + imsi4);
		// \n \b \t ...escape 문자
		System.out.println("\n여기까지가 산술연산자 끝" + (char)1 + "및 기타 \n연습 \n\n끝");
		
		
	}
	
}
