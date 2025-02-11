package pack4extend;

public class Ex19AnimalMain {

	public static void main(String[] args) {
//		Ex19Animal animal = new Ex19Animal();	//불가능
		Ex19Cow cow = new Ex19Cow();
		System.out.println(cow.name() + "는 " + cow.action() + "에 " + cow.eat());
		cow.print();
		
		System.out.println();
		Ex19Lion lion = new Ex19Lion();
		System.out.println(lion.name() + "는 " + lion.action() + "에 " + lion.eat());
		lion.print();
		lion.eatOther();
		
		System.out.println();
		Ex19Animal animal;
		animal = cow;
		System.out.println(animal.name() + "는 " + animal.action() + "에 " + animal.eat());
		animal = lion;
		System.out.println(animal.name() + "는 " + animal.action() + "에 " + animal.eat());
		
		System.out.println(cow instanceof Ex19Cow);
		if(cow instanceof Ex19Cow)
			System.out.println("맞아");
		else
			System.out.println("아니야");
		
		System.out.println(cow instanceof Ex19Animal);
		System.out.println(lion instanceof Ex19Animal);

		
		System.out.println("\n메소드 호출하며 매개변수에 주소 치환");
		Ex19AnimalFind animalFind = new Ex19AnimalFind();
		animalFind.find(cow);
		System.out.println();
		animalFind.find(lion);

		
		
		
		
		
		
		
		
		
	}

}
