package pack4extend;
//전자 제품 관련 부모 클래스(추상)
abstract public class Ex18Jepum {//전자 제품이 공통으로 가져야할 멤버 선언
	public int volume = 0;
	
	public Ex18Jepum() {
		System.out.println("Jepum 추상 믈래스 생성자");
	}
	
	public abstract void volumeControl(); //추상메소드(body가 없음) 
	
	public void volumeshow() { 
		System.out.println("소리 크기 : " + volume);
	}
	

}
