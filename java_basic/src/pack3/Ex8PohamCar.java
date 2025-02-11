package pack3;

public class Ex8PohamCar {	//여러 ㅑ개의 쿠품 클래스를 불러다가 완성차를 생산하기 위한 클래스
	int speed = 0;	//포함 카 고유 멤버
	String ownerName;
	String turnShow;
	
	//클래스의 포함관계(has a)
//	Ex8PohamCar handle = new Ex8PohamCar();
	Ex8Handle handle;
	
	//엔진, 타이어, 램프 등등을 클래스에 포함관계로 호출해서 사용.	객체지향적인 프로그래밍(oop) 철학
	
	public Ex8PohamCar() {

	}
	public Ex8PohamCar(	String ownerName) {
		this.ownerName = ownerName;
		handle = new Ex8Handle();
	}

	void driveTurnHandle(int q) {	//q : 회전량을 의미 (약속)ㅔ
		if(q>0) turnShow = handle.rightTurn(q);
		if(q<0) turnShow = handle.leftTurn(q);
		if(q==0) turnShow = handle.straight(q);
	}
	
	
	
	
	
	
}
