package pack;

public class Test2 {
	public static void main(String[] args) {
		//주석: 실행과는 무관, 설명을 달 경우 사용
		/*
		 여러줄 주석
		 */
		//원하는 부위만큼 드래그 후 ctrl + /
		String irum = "신기해";	//문자열을 변수에 기억
		System.out.print(irum);	// 계속 이어서 출력
		System.out.println(irum);	//라인 스킵 후 출력
		System.out.print(irum);
		System.out.println(); //syso ctrl + space바
		
		//변수 : 값(데이터)을 저장할 수 있는 메모리 공간(새로운 값을 입력하면 읽어쓰기 됨)
		//변수행 : 변수에 대한 임의의 이름, 형식: 타입 변수명 = 리터럴(문자, 숫자 ...)
		//상수 : 처음에 입력한 값이 계속 유지되는 메모리 공간
		
		//변수 기본형 타입 : bcbsilfd
		//기본형처럼 사용하는 참조형 타입 :  String
		
		//byte type
		byte var1;	//1byte (-128 ~ 127)정수 기억장소 ex)점수를 줄때
		var1 = 10; var1 = 5;
		System.out.println(var1); //ctrl + f11 실행 단축키
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);	//class를 제외한 변수는 소문자 영어로 시작
		byte var2 = 123;	//대입(치환) 연산자
		var2 = 127;
		System.out.println("var2: " + var2);
		
		
		System.out.println();
		//short type
		short var3 = 10; //2바이트(-32768 ~ 32767) 정수 기억장소
		System.out.println("var3: " + var3);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		
		System.out.println();
		//int type
		int var4 = 10;
		var4 = 2147483647;//4바이트(+- 약 20억) 정수 기억장소
		System.out.println("var4: " + var4);
		
		
		System.out.println("형변환에 대해...");
		byte aa = 10;	// 자동 형변환함 (promotion) (int 타입의 10을 byte으로 자동 변환한 후 기억)
		aa = (byte)10; 	// 강베 형변환함 (cast 연산자를 이용해 casting함)
		aa = (byte)200;
		aa = 5;
		int imsi = 7;
		byte bb = 7;
		byte cc = (byte)imsi;
		System.out.println("aa: "+ aa);
		System.out.println("bb: "+ bb);
		System.out.println("cc: "+ cc);
		
		
		System.out.println();
		//long type
		long var5; //8바이트 정수 기억장소
		var5 = 10;
		var5 = 2147483648L; //Long type의 데이터
		var5 = 123L;
		System.out.println("var5: " + var5);

		
		System.out.println("실수에 대해...");
		float f1 = 3; //실수형 기억장소(4byte)
		//정수는 실수로 자동 형변환(promotion)
		//f1 = 123.12; err
		f1 = 123.12f; // 123.12f float type 의 데이터
		f1 = (float)123.12;
		System.out.println("f1: " + f1);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println();
		double d1 = 123; //실수형 기억장소(8byte) : 소수이하 15자리 정밀도 보장
		d1 = 123.12;
		System.out.println("d1: " + d1);
	
		System.out.println();
		//int aa1 = 3.5; //err
		int aa1 = (int)3.5; //소수 이하 버리고 정수만 기억
		System.out.println("aa1: "+ aa1);
		
		int aa2 = 12+(int)10.5;
		aa2 = (int)(12 + 10.5);
		System.out.println("aa2: "+ aa2);
		double  aa3 = 12+10.5; //정수는 실수화 후 연산에 참여
		System.out.println("aa3: "+ aa3); 
		System.out.println();
		
		
		
		/////////////////////////////자습
		int x; //변수 x 선언
		x = 1; //변수 x에 1을 저장
		int y = 2; //변수 y를 선언하소 2를 저장
		int result = x+y; //변수 result를 선언하고 변수 x와 y를 더한 값을 저장
		System.out.println(result);
		
		System.out.println();
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		
		System.out.println();
		x = 3;
		y = 5;
		System.out.println("x: "+ x + ",y: "+ y);
		
		int temp = x; //변수 x 값 3을 변수 temp에 저장
		x=y; //변수 y 값 5를 변수 x에 저장
		y = temp; //변수 temp 값 3을 변수y에 저장
		System.out.println("x: "+ x + ",y: "+ y);
		
		System.out.println();
		byte b1 = -128;
		byte b2 = -30;
		byte b3 = -0;
		byte b4 = 30;
		byte b5 = 127;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		System.out.println();
		long l1 = 10;
		long l2 = 20L;
		long l3 = 1000000000000000L;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	
		System.out.println();
		
		float ff1 = 3.14f;
		double dd1 = 3.14;
		
		float ff2 = 0.123456789f;
		double dd2 = 0.123456789;
		
		System.out.println("ff1: "+ ff1);
		System.out.println("ff2: "+ ff2);
		System.out.println("dd1: "+ dd1);
		System.out.println("dd2: "+ dd2);
		
		//byte<short<int<long<float<double
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: "+ intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("foatValue: "+ floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleVAlue: "+ doubleValue);
		
		//////////////////////////2025.01.16
		System.out.println("논리형(boolean, 참 또는 거짓 결과의 자료형)에 대해...");
		boolean bu1 = true;
		bu1 = false;
		System.out.println("bu1: " + bu1);
		
		System.out.println("문자형(char,한개 의 문자 기억)에 대해...");
		char c1 = '0';
		//c1 = 'bc';
		//c1 = "b";
		System.out.println("c1: "+ c1 + " "+ (int)c1 + " "+ (char)48);
		//Ascii 콛에서 'A'는 십진수 65, 'a':97, '0':48...
		
		System.out.println("안녕"+ (char)10+"반가워");
		int abc = 0x0f; //16진수(0x리터럴)를 10진수 int 형으로 저장
		System.out.println("abc: "+ abc + " "+ Integer.toHexString(15));
		System.out.println("abc: "+ abc + " "+ Integer.toBinaryString(15));
		int abc2 = 007; //8지수를(0리터럴) 10진수 int 형으로 저장
		System.out.println("abc2: "+ abc2);
		
		System.out.println();
		final double PI =  3.14; //상수
		//PI = 3.8; //수적불가
		System.out.println("PI : "+ PI);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

		
	}
}
