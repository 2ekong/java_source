package pack4extend;

public class Ex24FlyerMain {

	public static void main(String[] args) {
		//인터페이스의 추상 메소드는 모두 오버라이딩 해야함
		System.out.println(Ex24Flyer.FAST);
		//Ex24Flyer.FAST = 150	//final이므로 err
		
		Ex24FlyerBird bird = new Ex24FlyerBird();
		bird.fly();
		
		Ex24FlyerAirplane airplane = new Ex24FlyerAirplane();
		airplane.fly();
	}

}
