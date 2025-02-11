package pack3;

public class Ex11Student {
	private String name;
	private Ex11Book book; 

	public Ex11Student(String name, Ex11Book book) {
		this();	//생성자는 가른 생성자를 호출할 수 있다
		this.name = name;
		this.book = book;
	}
	
	public Ex11Student () {
		System.out.println("나는 생성자");
	}
	
	
	public void showStudentDetail() {	//학생 정보 출력
		System.out.println(name);
		System.out.println(book.getBookInfo());
	}
}