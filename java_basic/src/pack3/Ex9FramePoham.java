package pack3;

import java.awt.Frame;

public class Ex9FramePoham {
	String name = "신기해";
	private Frame frame;	// 외부 클래스를 사용
	
	public Ex9FramePoham() {
		frame = new Frame("포함 연습용");	//클래스의 포함 관계
		
//		frame.setSize(500, 300);	//넓이와 높이 지정
//		frame.setLocation(200, 150);
//		frame.setVisible(true);
	}
	
	//생성자는 초기화 및 전체 윤곽만 적고, 나머지(처리 로직)는 별도 메서드로 작성하는 것이 좋다
	public void frameVisible() {	
		frame.setSize(500, 300);	//넓이와 높이 지정
		frame.setLocation(200, 150);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//Ex9FramePoham framePoham = new Ex9FramePoham();
		//new Ex9FramePoham();	//객체 변수가 굳이 필요하지 않음. 생성자에서 모든일이 처리되므로
		
//		Ex9FramePoham framePoham = new Ex9FramePoham();
//		framePoham.frameVisible();
		//위 두줄을 한둘로 표현 가능
		new Ex9FramePoham().frameVisible();

		
	}

}
