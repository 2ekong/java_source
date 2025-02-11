package pack2;

public class Ex2Main {
	public static void main(String[] args) {
		Ex2programmer programmer1 = new Ex2programmer();
		System.out.println("보유기술 : " + programmer1.spec);
		programmer1.displayDate();
		programmer1.nickName = "웹 전문가";	//public 멤버칠드이므로 와부에서 값을 수정
		programmer1.spec ="1종 보통 운전면허";
		programmer1.displayDate();
		System.out.println();
		//캡슈화된 멤버를 해당 클래스 밖에서 제어하기 : getter, setter
		//programmer1.age; 	//접근불가능
		int nai = programmer1.getAge();	//public 메소드이므로 접근 가능
		System.out.println("programmer1객체의 age : " + nai);
		
		programmer1.setAge(33);	//public apthem setter를 이용해 private필드에 값을 전달
		System.out.println("programmer1객체의 age : " + programmer1.getAge());
		programmer1.displayDate();
		System.out.println();
		programmer1.setAgeEx(55, 123);
		programmer1.displayDate();
		System.out.println();
		
		System.out.println("static, final권한==============");
		System.out.println();
		System.out.println("motto: " + programmer1.motto);
		System.out.println("motto: " + Ex2programmer.motto);//static 멤버는 클래스명, 멤버 형태로 접근
		//programmer1.WEIGHT = 77.8;	//에러: weight는 fianl이므로 수정 불가. 참조만 자능
		System.out.println("WEIGHT : " + programmer1.WEIGHT);
		System.out.println("PI : " + Ex2programmer.PI);
		
		
		
		System.out.println("\n===========");
		Ex2programmer programmer2 = new Ex2programmer();

		
		System.out.println("\n객체 변수가 참조하는 주소에 대해(참고)..");
		System.out.println(programmer1 +  " " + programmer2);
		System.out.println(programmer1.toString()+ " " + programmer2.toString());	//주소를 찍을 때 .toString()	객체변수만 써도 주소나옴
		System.out.println(programmer1.hashCode()+ " " + programmer2.hashCode());	
		System.out.println();
		
		System.out.println("------전문가가 만든 클래스 경험-------");
		System.out.println(Integer.MAX_VALUE);	//Integer 클래스명에 static final int MAX_VALUE 상수
		

	
	}
}
