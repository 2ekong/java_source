package pack2;

public class Ex2BookMain {
	public static void main(String[] args) {
		Ex2Book book = new Ex2Book("히히", "호호", false);
		book.printBookInfo();
		book.borrow(false);
		book.returnBook(false);
	}
}
