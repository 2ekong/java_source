package pack5;

import java.util.ArrayList;

public class Ex35DtoTest1 {
	private ArrayList<Ex35Student> list = new ArrayList<Ex35Student>();

	//DTO사용 전 방식
	public void aa() {
		String[] persons = new String[3];	//사람 이름을 기억하기 위한 배열
		persons[0] = "홍길동";
		persons[1] = "나길동";
		persons[2] = "고길동";

		for(String s:persons) {
			System.out.println(s);
		}
	}
	
	//세명이 학생(학번, 이름, 점수) 정보를 Dto에 저장
	public void insertData() {
		Ex35Student student = null;
		
		//첫번재
		student = new Ex35Student();	//dto 객체 생성
		student.setHakbun("acorn1");
		student.setIrum("홍길동");
		student.setJumsu(90);
		list.add(student);
		
		//두번째
		student = new Ex35Student();	//dto 객체 초기화
		student.setHakbun("accorn2");
		student.setIrum("나길동");
		student.setJumsu(88);
		list.add(student);
		
		//세번째
		student = new Ex35Student();	//dto 객체 초기화
		student.setHakbun("acorn4");
		student.setIrum("고길동");
		student.setJumsu(100);
		list.add(student);
		
		
		
	}
	
	public void showData() {
		
		System.out.println("list 크기 : " + list.size());
		System.out.println("첫번쨰 학생 : " + list.get(0));
		System.out.println("첫번쨰 학생 : " + list.get(1));
		System.out.println("첫번쨰 학생 : " + list.get(2));
		System.out.println(list.get(2).getHakbun() + ", " + list.get(2).getIrum() + ", " + list.get(2).getJumsu());
		System.out.println();
		System.out.println("반복문을 사용해 컬렉션에 저장된 Dto의 내용 출력------");
		for(int i =0; i <list.size(); i++) {
			Ex35Student studentdto = new Ex35Student();
			studentdto = list.get(i);
			System.out.println(studentdto.getHakbun() + ", " + studentdto.getIrum() + ", " + studentdto.getJumsu());
		}
	}
	
	
	public static void main(String[] args) {
		Ex35DtoTest1 test1 = new Ex35DtoTest1();
		test1.aa();
		System.out.println();
		test1.insertData();
		System.out.println("힉생 자료 저장 후 따짓을 하다가");
		test1.showData();

	}

}
