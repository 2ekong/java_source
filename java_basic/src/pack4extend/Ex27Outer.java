package pack4extend;
//내부 클래스
//클래스의 멤버로 필드, 메소드 외에 클래스를 가질 수 있다. 이를 내부 클래스라고 한다.
//클래스 내에서 다른 클래스 객체를 사용해야 하는 경우가 있다. 이 때 구현하면 효과적
//참고로 한개의 클래스는 한개의 extends문을 가질 수 있다는 점을 기억
public class Ex27Outer {
	private int kor;
	private Inner inner;
	public Ex27Outer() {
		kor= 10;
		inner = new Inner();	//내부 클래스도 객체 생성은 포함관계처럼 해 준다
	}
	
	public void aa() {
		System.out.println("외부클래스 Outer의 aa 메소드");
		System.out.println("외부클래스의 kor : " + kor);
		bb();
		inner.cc();
		System.out.println("eng : " + inner.eng);
	}
	
	private void bb() {
		System.out.println("외부클래스 Outer의 bb 메소드");
	}
	
	//내부 클래스 선언
	public class Inner {
		private int eng;
		 
		public Inner() {
			eng = 20;
		}
		public void cc()  {
			System.out.println("내부 클래스 Inner의 cc 메소드");
			bb();	// 외부클래스 Outer의 bb메소드
			System.out.println("내부 eng : " + eng + ", 외부 kor : " + kor);
		}
		
		//내부 클래스 안에 다시 내부 클래스 선언 가능(비권장)
		
		public class InnerIner {
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		Ex27Outer outer = new Ex27Outer();
		outer.aa();
		outer.bb();
		System.out.println();
		
		//Inner inner = new Inner();	//내부 클래스는 독리적인 객체 생성(new) 불가
		Ex27Outer.Inner inner = outer.new Inner();	//이렇게 가능하나 비권장
		inner.cc();
		
		System.out.println();
		
		
		
		
	}

}
