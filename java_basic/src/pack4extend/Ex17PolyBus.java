package pack4extend;

public class Ex17PolyBus extends Ex17PolyCar {
	private int passenger = 10;
	
	
	public Ex17PolyBus() {
		System.out.println("난 car 의 자식인 bus 생성자 입니다.");
	}
	
	@Override
	public void displayData() {
		System.out.println("버스 승객 수 : " + passenger);
		System.out.println("버스 속도는 " + speed);
	}
	
	public void show() {
		System.out.println("버스 고유 메소드 show");
	}
	
	
	
	
}
