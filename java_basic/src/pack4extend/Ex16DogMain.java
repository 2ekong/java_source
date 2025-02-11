package pack4extend;

public class Ex16DogMain {
	public static void main(String[] args) {
		Ex16Dog dog = new Ex16Dog("개");
		dog.print();
		System.out.println(dog.callName());
	
		System.out.println();
		Ex16HouseDog houseDog = new Ex16HouseDog("집 개");
		houseDog.print();
		System.out.println(houseDog.callName());
		houseDog.show();
	
	
		System.out.println();
		Ex16WolfDog wolfDog = new Ex16WolfDog("늑대");
		wolfDog.print();
		System.out.println(wolfDog.callName());
		wolfDog.show();
		
		System.out.println("=======");
		Ex16WolfDog bushdog = wolfDog;	//주소를 치환 (타입이 같은경우 치황 성공)
		wolfDog.print();
		bushdog.print();

		//promotion
		Ex16Dog dog2 = wolfDog;	//주소를 치환 (타입이 다른데도 불구하고 치환성공 - 자식의 주소를 부모 객체변수에 주는 경우)
		dog2.print();	//오버라이딩 된 메소드만 부모 객체변수명으로 호출 가능
//		dog2.show();	//자식이 가진 고유 메소드는 부모 객체변수명으로 호출할 수 없다
		Ex16WolfDog hidog =  (Ex16WolfDog)dog2;
		hidog.print();
		
		
		System.out.println("=============");
		Ex16Dog coyote = new Ex16Dog("코요태");	//부모 클래스
		coyote.print();
		System.out.println(coyote.callName());
		Ex16WolfDog wolfdog2 = new Ex16WolfDog("늑대2");	//dog의 자식 클래스
		wolfdog2.print();
		wolfdog2.show();
		
		coyote = wolfdog2;	//promotion : 자식 객체 주소를 부모객체변수에 치환
		coyote.print();	//오버라이딩된 메소드는 허용
		//coyote.show();	//자식 고유 메소드는 호출 불가
		coyote.getName();	//자식에게 메소드 업승면 부모에서 찾아 올라감
		Ex16WolfDog wolfDog3 = null;
//		wolfDog3.show();//NullPointerException
		wolfDog3 = wolfdog2;	//타입이 같으므로 성공
//		wolfDog3 = houseDog;	//타입이 다르므로 실패
		//wolfDog3 = coyote;	//타입이 다르므로 실패  하지만 부모 타입인 coyote 변수는 자식의 주소를 거억 중
		wolfDog3 = (Ex16WolfDog)coyote;	//그러므로 casting 을 종해 치환할 수 있음
		wolfDog3.print();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
