package pack2;
//숫자의 제곱을 출력하는 메서드
//정수를 매개변수로 받는 메소드
//실수를 매개변수로 받는 베소드
public class Ex4Exam1 {	//메소드 오버로딩 연습용
	
	public Ex4Exam1() {
		
	}
	//정수 제곱 계산용
	public int square(int num) {
		return num * num;
	}
	
	public double square(double num) {
		return num * num;
	}
	
	public static void main(String[] args) {
		Ex4Exam1 exam1 = new Ex4Exam1();
		int reslut1 = exam1.square(5);
		System.out.println(reslut1);
		
		System.out.println();
		double reslut2 = exam1.square(3.2);
		System.out.println(reslut2);
	}

}
