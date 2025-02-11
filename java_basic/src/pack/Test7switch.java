package pack;

public class Test7switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nai = 15;

		nai = nai / 10 * 10;

		// System.out.println(nai);

		switch (nai) {

		case 20:

			System.out.println("젊음");

			break;

		case 30:

			System.out.println("인생의 황금기");

			break;

		default:

			System.out.println("기타");

			break;

		}

		System.out.println("계속1");



		switch (nai) {

		case 10:

		case 20:

			System.out.println("젊음");

			break;

		case 30:

		case 40:

		case 50:

			System.out.println("인생의 황금기");

			break;

		default:

			System.out.println("기타");

			break;

		}

		System.out.println("계속2");



		System.out.println((int) (Math.random() * 10));// 난수 발생

		// int sigan = (int)(Math.random()*10);

		int sigan = (int) (Math.random() * 4) + 8; // 8~11 사이 정수

		System.out.println("시간: "+ sigan);

		switch (sigan) {

		case 8:

			System.out.println("출근 준비");

			break;

		case 9:

			System.out.println("출근 완료");

			break;

		case 11:

			System.out.println("팀회의");

			break;

		default:

			System.out.println("개인 활동");

		}

		

		System.out.println("계속3");

		String jik = "과장";

		switch(jik) {

		case "사원":

			System.out.println("사원 업무");

			break;

		case "과장":

			System.out.println("과장 업무");

			break;

		default:

			System.out.println("기타 직급");

			break;

		}


	}

}
