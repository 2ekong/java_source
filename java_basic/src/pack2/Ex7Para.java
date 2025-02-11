package pack2;

//매개변수로 기본형 뿐만 아니라 참조형도 가능
class Person {	//일반적으로 따로이 파이릉ㄹ 작성해야하지만 편의상 현재 클래스와 같은 곳에 적용
	String name;
	int age;
	public Person(String name, int age) {	//String name : 참조형(객체형), int age:기본형
		this.name =name;
		this.age = age;
	}
}

class PersonService {
	public PersonService() {
		
	}
		public void changeName(Person person, String newName) {
			System.out.println("person변수 기억 주소 : "+ person);

			person.name = newName;
	
	}
}



public class Ex7Para {

	public static void main(String[] args) {
		Person tom = new Person("힌국인", 22);
		System.out.println("변경전 이름 : "+ tom.name + " " + tom);
		System.out.println("tom변수 기억 주소 : "+ tom);
		Person james;
		james = tom;
		System.out.println("james 변수 기억 주소 : " + james);
		
		Person per = tom;
		System.out.println("per 변수 기억 주소 : " + per);
		
		PersonService  service = new PersonService();
		service.changeName(tom, "신나는");	//tom 변수가 가진 주소 전달
		System.out.println("변경 후 이름: " + tom.name + " " + tom);
		
		
	}

}
