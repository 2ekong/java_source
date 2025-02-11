package pack2;

import java.time.LocalDate;

public class Ex6Main {
	public static void main(String[] args) {
		Ex6Singleton ex1 = new Ex6Singleton();
		Ex6Singleton ex2 = new Ex6Singleton();
		System.out.println(ex1 + " " + ex2);	//두개의 객체 변수(instance)의 주소가 다름
		System.out.println(ex1.name + " " + ex2.name);//인스턴스 2개
		ex1.name= "홍길동";
		System.out.println(ex1.name + " " + ex2.name);//ex1 과 ex2는 다름

		
		System.out.println("싱글톤 패턴을 적용");
		Ex6Singleton my1 = Ex6Singleton.getInstance();
		Ex6Singleton my2 = Ex6Singleton.getInstance();
		System.out.println(my1 + " " + my2);	//같은 주소
		System.out.println(my1.name + " " + my2.name);	//인스턴스 1개
		my1.name = "한국인";
		System.out.println(my1.name + " " + my2.name);	//my1과 my2는 같음
	
		System.out.println();
		LocalDate localDate = LocalDate.now();	//싱글톤 패턴이 적용
		LocalDate localDate2 = LocalDate.now();
		System.out.println(localDate.hashCode() + " " + localDate2.hashCode());
		System.out.println(localDate);
		
	}
}
