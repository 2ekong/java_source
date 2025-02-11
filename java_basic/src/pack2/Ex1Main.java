package pack2;

public class Ex1Main {	//Ex1Main 은 main메소드를 실행하기 위한 클래스임
	public static void main(String[] args) {
		//main은 응용프로그램을 시작을 위해 정해진 메소드이다.
		
	
		//Ex1Car 설계도를 객체를 생성. 이런 과정을 객체를 인스턴스(instance)화 하고자함
		//다시 말해 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화라고하며, 
		//어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다
		//객체는 모즌 인스턴스를 대표하는 포괄적인 의미다.
		//클래스 -- 인스턴스화 -->객체
		
		//Ex1Car.class를 주기억장치로 읽은 후 car1 객체변수를 선언
		//new 키워드로 인스턴스를 진행. 이때 Ex1Car()이라는 생성자를 호출
		Ex1Car car1 = new Ex1Car();
		//Ex1Car 멤버 필드(전역변수) 호출-----------
		System.out.println(car1.wheel);	//접근지정자가 defualt이므로 출 가능
//		car1.abc();	//private 메소드이므로 호출 불가
		System.out.println(car1.irum);	
		System.out.println();
		
		//Ex1Car 멤버 메소드 호출-----------
		//car1.abc();	//private 메소드이므로 호출 불가
		car1.def();
		System.out.println();
	 
		String ss = car1.driving();
		ss ="와우 " + ss;
		System.out.println(ss);	//다회용
		System.out.println();	
		
		System.out.println(car1.driving());	//1회용
		System.out.println();
		
		System.out.println();
		
		System.out.println("\n==================");
		Ex1Car car2 = new Ex1Car();	//새로운 객체 생성
		//car1과 car2는 type이 같은 두개의 객체 변수
		System.out.println(car2.wheel);
		car2.def();
		
		
		
	}

}
