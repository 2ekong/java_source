package pack;

public class Test8for {

	public static void main(String[] args) {
		System.out.println("뭔가를 하다가 반복문 만나기");
		//반복문 for
		int a;
		int hap = 0;	//누적 번수명
		for( a = 1; a<=5; a++) {//for(변수 초기화; 조건; 증감치) { 반복 내용}
			System.out.print(a + "\t");
			//a = 7; 반복문 내에서 for 문에 사용중인 변수는 갱신 비권장
			hap = hap + a;
		}
		System.out.println("\nfor 탈출 : " + a);
		System.out.println("합은 : " + hap);
		
		System.out.println();

		for (int i =65; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println("\nfor 탈출2");
		System.out.println();
	

		for(int i ='A'; i<= 'Z'; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\nfor 탈출3");
		System.out.println();
		

		for(int i = 10;i>1; i -=2) {
			System.out.print(i + " ");
		}
		System.out.println("\nfor 탈출4");
		System.out.println();



		for (int ytn =0, tvn=5; ytn <= 5; ytn++, tvn++) {
			System.out.println(ytn + "," + tvn + " ");
		}
		System.out.println("\nfor 탈출5");
		System.out.println();

		int aa = 1;
		for(;aa<=5;aa++) {
			System.out.print(aa + "");
		}
		System.out.println("\nfor 탈출6");
		System.out.println();


		for(int sbs = 1;sbs <=10; sbs++) {
			if(sbs%2==0) {
				System.out.print(sbs + " ");
			}
			if(sbs == 6) {
				break;	//반복문 무조건 탈출
			}
		}
		System.out.println("\nfor 탈출7");
		System.out.println();

		

		

		//다중 for ------------

		for(int m=1; m<=3; m++) {

			System.out.println("m: " + m);

			for(int n= 1; n <= 4; n++) {

				System.out.print("n=" + n + " ");

			}
			System.out.println();
		}
		System.out.println("\nfor 탈출8");
		System.out.println();
		

		for(char i =65; i <=90; i++) {
			System.out.print(i + " : ");
			for(char j= i; j <='Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}		
		
		System.out.println("문제");
		// 문1) 구구단 3단 출력
		for (int i =1; i<10; i++) {
			System.out.println("3 * " + i+ "=" + i*3);
		}

		//문2 : 2 ~9단까지 추력
		//2*1=2 2*2=4 ... 2*9= 18
		//...
		//9*1=9 9*2=18 ... 9*9= 81

		for(int i =2; i<10; i++) {

			for(int j =1; j<10; j++) {
				System.out.print(i + "*" + j  + "=" +i*j + " ");
			}
			System.out.println();
		}


		//문3 : 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수를 출력하고 , 건수와 그들의 총합으로 출력
		int count =0;
		int sum =0;
		for(int i = 1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+ " ");
				sum += i;
				count++;
			}
		}
		System.out.println();		
		System.out.println("합 : " + sum);
		System.out.println("개수 : "+count);

		System.out.println();
		System.out.println("continue, break");
		
		for(int i=1; i<=10; i++) {
			//if(i ==3) continue;	//자기와 대응되는 for문으로 무조건 이동
			//if(i ==5) continue;
			if(i==3 || i ==5) continue;
			System.out.println(i);
			
			if(i ==7) break;	//3이랑 5는 continue를 만나서 오류
		}
		//무한 반복
		int kk = 0;
		for(;;) {
			kk++;
			System.out.println("kk");
			if(kk==5) break;
		}	//비권장 -> 보통 while문으로 사용
		System.out.println(kk);

		

		

		



		

	}

}
