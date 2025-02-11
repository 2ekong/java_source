package pack2;

public class Ex3Singer {

	private String name= "무명 가수";
	private String titleSong = "아 대한민국";
	
	public Ex3Singer(String name,String titleSong ) {
		this.name = name;
		this.titleSong = titleSong;
	}
	
	public void sing() {
		//String name = "아이유";
		//System.out.println(name + "의 노래 제목은 " + titleSong);
		System.out.println(name + "의 노래 제목은 " + titleSong);
	}
	
	public void setTitleSong(String titleSong) {
		this.titleSong = titleSong;
	}
	
	
	
	public static void main(String[] args) {
		Ex3Singer bts = new Ex3Singer("BTS","다이너마이트");
		bts.sing();
		bts.setTitleSong("신곡");
		bts.sing();
		System.out.println();
		Ex3Singer blackpink = new Ex3Singer("블랙핑크","불장난");
		blackpink.sing();
		

	}

}
