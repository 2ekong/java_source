package pack4extend;

public class Ex18JepumTv extends Ex18Jepum{
	public Ex18JepumTv() {
		System.out.println("Tv생성자");
	}
	
	@Override
	public void volumeControl() {
		//메소드 오버라이딩 강요함
		System.out.println("Tv의 소리 조절");
	}
}
