package pack4extend;

public class Ex15Main {
	public static void main(String[] args) {
		Ex15Car car = new Ex15Car("kia", 0, 50);
		car.describe();
		Ex15Bicycle bicycle = new Ex15Bicycle("Giant", 0 , 21);
		bicycle.describe();
		
		
		Ex15Book book = new Ex15Book();
		book.displayDetails("The Great Gatsby", "Scribner");
	}
}
