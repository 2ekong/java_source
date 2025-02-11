package pack2;

public class Ex4Exam2 {
//사람의 나이를 출력한느 베서드를 작성
//사람의 이름과 나이를 출력하는 printAge 메서드
	//이름과 나이를 매개변수로 전달하면 "이름은 [이름], 나이는 [나이]살입니다.
	//아름만 전달함녀"이름은 [이름], 나이는 알 수 없습니다.
	//매개변수ㅏ 업승면 "이름과 나이가 몯 없습니다.

	public void printAge(String name, int age) {
		System.out.println("이름은 " + name + ", 나이는 " + age);
	}
	public void printAge() {
		System.out.println("이름과 나이가 모두 없습니다.");
	}
	public void printAge(String name) {
		System.out.println("이름은 " + name + ", 나이는 몬낭");
	}
	
	
	public static void main(String[] args) {
		Ex4Exam2 exam = new Ex4Exam2();
		exam.printAge("홍길동", 4);
		exam.printAge();
		exam.printAge("홍길동");
	}
}
