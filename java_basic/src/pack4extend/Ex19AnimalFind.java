package pack4extend;

public class Ex19AnimalFind {
	public void find(Ex19Animal animal) {
		animal.print();
		if(animal instanceof Ex19Cow) {
			System.out.println("이름은 " + animal.name());
		}else if(animal instanceof Ex19Lion) {
			System.out.println("이름 : " + animal.name() + "먹이 : " + animal.eat());
		}else {
			System.out.println("기타");
		}
	}
}
