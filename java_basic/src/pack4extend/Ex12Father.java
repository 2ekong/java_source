package pack4extend;

public class Ex12Father extends Ex12GrandFa{
	private final int nai = 50;	//나이 수정 불가
	public String gabo = "청자";
	private int house = 1;

	public Ex12Father() {
		super();	//부모 생성자 호출
		System.out.println("아버지 생성자");
	}
	@Override //annotation (뭔가를 처리하는 기능)
	public int getNai() {
		//메소드 오버라이딘 : 부코와 똑가은 메소드로 자식에서 많듦 내용은 대개로 다르게 적성
		int imsi = 0; //부모와 다른 코드를 적을 수 있다. 재정의
		return nai;
		
	}
	@Override
	public void say() {
		String ss = "아버지 말씀";
		System.out.println(ss);
	}
	
	public int getHouse() {
		return house;
	}
	
	public void showDate() {
		String gabo = "맥북";
		System.out.println(gabo);
		System.out.println(this.gabo);	//현재 클래스의 gabo 없으면 부모 클래스
		System.out.println(super.gabo);	//처음부너 부모 클래스
		
		say();
		this.say();
		super.say();

	}
}
