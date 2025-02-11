package pack;

import java.util.Scanner;

public class Test6ex {

	public static void main(String[] args) {
		//키보드로 상품명, 수량, 단가를 받아 출력
		//상품명 마우스, 금액 5000원, 세금 500원
		//금액은 수량 *단가
		//세금은 금액이 5만원 이상이면 금액의 10%, 3만원 이상이면 금액의 5%, 나머지는3 %
		Scanner sc = new Scanner(System.in);
		String sang = "마우스";	//상품명
		int su = 0;	//수량
		int dan = 5000;	//단가
		System.out.print("상품명 : ");
		String inputSang = sc.nextLine();
		int kum = su * dan;	//금액
		int sekum = 500;

		if (inputSang.equals(sang)) {
			System.out.print("수량 : ");		
			su = sc.nextInt();
			if( kum >= 50000) {
				sekum = (int) (kum * 0.1);
			}else if(kum>=30000) {
				sekum = (int) (kum *0.05);
			}else {
				sekum = (int) (kum * 0.03);
			}
		}else {
			System.out.println("상품명이 없습니다.");
		}
		System.out.println("내야할 세금 : " + sekum);
		
		//--------------------------------
//		System.out.print("상품명");
//		String sang = sc.next();
//		System.out.print("수량");
//		int su = sc.nextInt();
//		System.out.print("단가");
//		int dan = sc.nextInt();
//		int sekum = 500;
//		
//		int kum = su * dan;
//		if (kum >=50000) {
//			sekum = (kum/100)*10; 
//			System.out.println("세금" + sekum);
//		}else if(kum >=30000) {
//			sekum = (kum/100)*5; 
//			System.out.println("세금"+ sekum);
//			
//		}else {
//			sekum = (kum/100)*3; 
//			System.out.println("세금"+ sekum);
//		}
		
		
//		Scanner sca = new Scanner(System.in);
//		System.out.print("상품명");
//		String sang = sca.nextLine();
//		System.out.print("수량 : ");		
//		int su = sca.nextInt();
//		System.out.print("단가 : ");		
//		int dan = sca.nextInt();
//		
//		int kum = su * dan;
//		double sekum = 0.0;
//		if (kum >=50000) {
//			sekum = kum % 0.1;
//		} else if (kum >=30000) {
//			sekum = kum % 0.05;
//		} else {
//			sekum = kum %0.03;
//		}
//		
//		System.out.println(sang + kum + sekum);
		
		



	}

}
