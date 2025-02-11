package pack4extend;

public class Ex17PolyTaix extends Ex17PolyCar{
	private int passenger = 2;
	
	
	public Ex17PolyTaix() {
		System.out.println("난 car 의 자식인 taxi 생성자 입니다.");
	}
	
	@Override
	public void displayData() {
		String msg =  "택시 승객 수 : " + passenger;
		System.out.println(msg);
	}
	

}
