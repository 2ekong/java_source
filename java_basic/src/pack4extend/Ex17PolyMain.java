package pack4extend;

public class Ex17PolyMain {
	public static void main(String[] args) {
		Ex17PolyCar car1 = new Ex17PolyCar();
		Ex17PolyBus bus1 = new Ex17PolyBus();
		Ex17PolyTaix taxi1 = new Ex17PolyTaix();
		
		System.out.println();
		car1.displayData();
		System.out.println(car1.getSpeed());
		
		System.out.println("버스에 대해");
		bus1.displayData();
		System.out.println(bus1.getSpeed());
		bus1.show();
		
		System.out.println("택시에 대해");
		taxi1.displayData();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("\n=======주소 치환=======");
		Ex17PolyCar car2 = new Ex17PolyBus();	//자식의 주소 부모에게 치환
		car2.displayData();
//		car2.show();	//불가
		
//		나는 자동차 원형 클래스야
//		난 car 의 자식인 bus 생성자 입니다.		//23번줄 결과
//		버스 승객 수 : 10
//		버스 속도는 100		//24번줄 결과
		
		System.out.println();
		Ex17PolyCar car3 = taxi1;	//주소를 치환
		car3.displayData();
		
		System.out.println("\n======다향성=======");
//		Ex17PolyBus bus2 = new Ex17PolyCar();	//부모의 주소를 자식에게 치환은 불가능
		Ex17PolyBus bus2 = (Ex17PolyBus)car2;	//부모 타입이지만 자식의 주소를 가지므로 케스팅 가능
		bus2.displayData();
		bus2.show();
		
		System.out.println();
//		Ex17PolyTaix taxi2 = new Ex17PolyCar();
		Ex17PolyTaix taxi2 =(Ex17PolyTaix)car3;
		taxi2.displayData();
		
//		Ex17PolyTaix taxi3 = (Ex17PolyTaix)car1;//ClassCastException
		
		System.out.println("===================");
		Ex17PolyCar p[] = new Ex17PolyCar[3];	//Car 타입의 배열을 선언
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		p[0].displayData();
		p[1].displayData();
		p[2].displayData();
		System.out.println();
		for (int i= 0; i<p.length; i ++ ) {
			p[i].displayData();
		}
		System.out.println();
		for(Ex17PolyCar car:p) {
			car.displayData();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
