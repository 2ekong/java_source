package pack4extend;

public class Ex15Book extends Ex15Library {
	public String author;
	public int pageCount;

	public Ex15Book() {
		System.out.println("Book Details");
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

@Override
	public void displayDetails(String title, String publisher) {
		System.out.println("Book Title : " + this.title);
		System.out.println("Book publisher" + this.publisher);
		System.out.println("Book author" + this.author);
		System.out.println("Book pageCount" + this.pageCount);
	}	
}
