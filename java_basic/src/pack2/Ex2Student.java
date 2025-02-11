package pack2;

public class Ex2Student {
	//문제1. 학생정보 관리 클래스, 학생정보를 관리하기 위한 Student 클래스를 작성
	//클래스의 이름은 Student입니다. 다음 필드를 포함
	//String name(학생 이름), int grade(학년), double score(평균 점수)
	//생성자는 모든 필드를 초기화할 수 있어야함
	//학생의 정보를 출력하는 printStudent() 메서드를 작성하세요
	//출력 형식은 다음과 같습니다.
	//이름 :[name], 학년[grade], 평균점수:[score]
	//main 메서드에서 학생의 객체를 생성하고 printStudentInfo() 메서드를 호출
	private String name;	//멤버 변수
	private int grade;
	private double score;
	public Ex2Student(String name, int grade, double score) {	//매개변수는 지역변수
		this.name = name;	//생성자를 호출하여 값을 줄 수 있다	//this.믈래스의 멤버 변수 = 지역변수; 지역변수를 입력받아 멤버변수로 받음
		this.grade = grade;
		this.score = score;	//this.매개변수 = 지역변수;
		
	}
	public void printStudenrInfo( ) {
		System.out.println("이름 : " +name + ", 학년 : "+ grade + ", 평균점수"+ score);
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public static void main(String[] args) {
		Ex2Student stu = new Ex2Student("홍길동", 1, 2);
		stu.printStudenrInfo();
	}
	
}
