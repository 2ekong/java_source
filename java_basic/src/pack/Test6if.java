package pack;

import java.util.Scanner;

public class Test6if {

	public static void main(String[] args) {
		// 조건 판단문 if
		System.out.println("~~수행 후 if문 만나기");
		int num = 2;

		if (num >= 5) {
			System.out.println("크다");
			System.out.println("우왕 크다");
		}

		System.out.println("계속1");
		System.out.println();
		if (num >= 5) {	//조건이 true
			System.out.println("크다");
			System.out.println("우왕 크다");
		} else {	//조건이 false
			System.out.println("작다");
		}
		System.out.println();
		System.out.println("계속2");
		
		int jumsu = 40;
		
		if(jumsu >= 70) {	//다중 if
			if(jumsu>=90) {
				System.out.println("우수");
			} else {
			System.out.println("보통");
			}
			
		} else { 
			if(jumsu >=50) {
				System.out.println("저조");
			}else {
				System.out.println("매우 저조");
			}
		}
		System.out.println();
		System.out.println("계속3");
		int jumsu2 = 66;
		String result = "";
		if(jumsu2 >= 90) {
			result = "수";
		} else if(jumsu2 >=80) {
			result = "우";
		} else if(jumsu2 >=70) {
			result = "미";
		} else if(jumsu2 >=60) {
			result = "양";
		} else {	//if(jumsu2 < 50 ) 생략 권장
			result = "가";
		}
		System.out.println("평가결과는: " + result);
		
		System.out.println();
		System.out.println("계속4");
		
		//어느 공원의 입장료가 8세 이하, 65세 이상인 경우 무료
		//9세 이상 20세 미만인 3000원
		//그 외의 값은 5000원
		int age = 35;
		if(8 >= age || age >= 65) {
			System.out.println("무료");
		} 
		if(9<= age && age< 20) {
			System.out.println("3000원");
		}
		if(20 <= age && age <65) {
			System.out.println("5000원");
		}
		
		int price = 0;
		if(9 <= age && age <20) {
			price = 3000;
		}else if(20 <=age && age <65) {
			price = 5000;
		}else {
			price = 0;
		}
		System.out.println("입장료: " + price);
		
		
		System.out.println();
		System.out.println("계속5");
		
		System.out.println("야구장에 입탕하기: 로그인에 성공");
		String id = "kbs";
		String password = "ok123";
		Scanner sca = new Scanner(System.in);
		System.out.print("id: ");
		String inputId = sca.nextLine();
		System.out.print("pwd: ");
		String inputPwd = sca.nextLine();
		
		if(inputId.equals(id) && inputPwd.equals(password)) {
			System.out.println("성공");
		}else {
			System.out.println("다시 입력해주세오");
		}
		
		System.out.println();
		System.out.println("계속");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
