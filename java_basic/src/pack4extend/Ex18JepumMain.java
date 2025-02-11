package pack4extend;

public class Ex18JepumMain {
	public static void main(String[] args) {
		//추상 믈래스는 스스로 객체 생성 불가. 자식의 생성자에 의해 객체 생성됨
		//Ex18Jepum jepum = new Ex18Jepum();//불가능
		Ex18Jepum jepum = null;
		Ex18JepumTv tv = new Ex18JepumTv();
		tv.volumeControl();
		tv.volumeshow();
		System.out.println();
		Ex18JepumRadio radio = new Ex18JepumRadio();
		radio.volumeControl();
		radio.volumeshow();
		System.out.println();
		Ex18JepumHandPhone handphone = new Ex18JepumHandPhone();
		handphone.volumeControl();
		handphone.volumeshow();
		System.out.println();
		jepum = handphone;
		jepum.volumeControl();
		jepum = radio;
		jepum.volumeControl();
	
		System.out.println();
		Ex18Jepum j[] = {tv, radio, handphone};
		for(Ex18Jepum jep:j) {
			jep.volumeControl();
		}
		
	}
}
