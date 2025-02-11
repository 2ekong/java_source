package pack2;

public class Ex2Book {
	private String title;
	private String autho;
	private boolean isAvailable;
	
	public Ex2Book(String title, String autho, boolean isAvailable) {
		this.title = title;
		this.autho = autho;
		this.isAvailable = isAvailable;
	}
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 public void setAutho(String autho) {
		 this.autho = autho;
	 }	 
	 public void setIsAvailable(boolean isAvailable) {
		 this.isAvailable = isAvailable;
	 }
	
	 
	public void borrow(boolean isAvailable) {
		if(this.isAvailable == false) {
		this.isAvailable = isAvailable;
		System.out.println("대출 불가능");
		} 
	}
	
	public void returnBook(boolean isAvailable) {
		if(this.isAvailable == true) {
		this.isAvailable = isAvailable;
		System.out.println("대출 가능");
		} 
	}
	
	
	public void printBookInfo() {
		System.out.println("제목: " + title + "저자: " + autho + "대츨 가능: " +  isAvailable);
	}
}
