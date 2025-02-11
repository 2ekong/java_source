package pack;

public class Test10array {
	public static void main(String[] args) {

		// 배열: 타입(성격과 크기)이 일치라는 여러개의 기억장소(변수)를 대표명 하나만 주고 첨자(색인)로, 각 기억장소를 구분

		// 반복처리의 효과적

		// ex1)5과목 점수의 합 구하기

		int kor, eng, mat; // 단순 변수 : 모든 기억장소를 독립적으로 선언

		kor = 90;

		eng = 80;

		mat = 100;

		int tot = kor + eng + mat;

		System.out.println("세 과목의 합 : " + tot);



		// ex2)배열을 사용해 3 과목의 점수의 합을 구하기

		int jumsu[] = new int[3]; // int[] jumsu = new int[3];

		jumsu[0] = 90;

		jumsu[1] = 80;

		jumsu[2] = 100;

		int tot2 = 0;

		for (int i = 0; i < 3; i++) {

			tot2 = tot2 + jumsu[i];

		}

		System.out.println("세 과목의 합 : " + tot2);



		System.out.println();

		// int ar;

		// int ar[]; //배열로 선언 (아직 기억장소를 확보하지 못함), int[] ar;

		// ar = new int[5]; //5개의 기억장소가 확보됨

		// 위 두줄을 한줄로 선언

		int ar[] = new int[5]; // 대표명 ar인 int type 의 변수 5개를 선언

		System.out.println("배열의 크기 : " + ar.length);

		ar[0] = 10;

		ar[1] = 20;

		ar[2] = ar[0] + ar[1];

		System.out.println("ar[2]의 값 : " + ar[2]);

		System.out.println(ar[3]); // 기본겂은 0을 가억

		// System.out.println(ar[5]); //ArrayIndexOutOfBoundsException: Index 5 out of

		// bounds for length 5

		// 배열의 인덱스는(첨자)는 0부터 출발, 양의 정수만 가능



		int kbs = 2;

		System.out.println("ar[2]의 값 : " + ar[2] + " " + ar[kbs] + " " + ar[kbs + 1 - 1]);

		// ar[kbs] <== kbs를 첨자 변수, 색인 변수 또는 index variable라고 부른다

		// 배열 선언 후 초기값 저장

		int[] ar2 = { 1, 2, 3, 4, 5 }; // 내부적으로 new를 함

		System.out.println(ar2[0] + " " + ar2[4]);



		for (int i = 0; i < ar2.length; i++) { // 배열 요소 값 반복문으로 출력

			System.out.print(ar2[i] + " ");

		}

		System.out.println();

		for (int k = 0; k < ar2.length; k++) { // 반복문으로 배열 요송 값 저장

			ar2[k] = k + 10;

		}



		for (int k = 0; k < ar2.length; k++) { // 표준 for문으로 배열을 반복

			System.out.print(ar2[k] + " ");

		}

		System.out.println();

		// 배열을 이용한 반복 처리시 향산된 for를 사용 가능

		for (int no : ar2) { // ar2 배열 요소가 차례대로 no에 치환되면서 반복처리

			System.out.print(no + " ");

		}



		System.out.println();

		double silsu[] = { 3.5, 2.1, 6.8 };

		for (int i = 0; i < silsu.length; i++) {

			System.out.print(silsu[i] + " ");

		}



		System.out.println();

		String[] city = { "서울", "제주", "원주" };

		for (int abc = 0; abc < city.length; abc++) {

			System.out.print(city[abc] + " ");

		}



		System.out.println();

		for (String cc : city) {

			System.out.print(cc + " ");

		}



		System.out.println();

		System.out.println("5명의 사람 키(정수) 배열에 저장하고 평균 키 출력");

		int[] heights = { 178, 166, 177, 175, 180 };

		int hap = 0;

		for (int i = 0; i < heights.length; i++) {

			hap += heights[i];

		}

		double hAvg = (double) hap / heights.length; // 175.2

		// double hAvg = hap/heights.length; //175.0

		System.out.println(heights.length + "명의 키 평균은" + hAvg);

		// heights 기억장소는 1차원 배열 : 한 행에 요소(열)로만 구성된 배열



		System.out.println("2차원(다차원) 배열 -------");

//		int su;	//한개의 독립 변수

//		int su[];	//열로만 구성된 집합변수	: 1차원 배열



//		int su[][];	//행과 열로 구성된 집합 변수 : 2차원 배열

//		su = new int[3][4];

		int su[][] = new int[3][4]; // 1차원 배열로 선언하면 int su = new int[12];

		System.out.println("행의 갯수 : " + su.length);

		System.out.println("열릐 갯수 : " + su[0].length);

		su[0][0] = 7; // 2차워 배열 su의 0행0열에 7을 기억

		System.out.println(su[0][0]);

		// 2차원 배열 su에 값 저장

		System.out.println();

		int num = 10;

		for (int i = 0; i < su.length; i++) {

			for (int j = 0; j < su[i].length; j++) {

				su[i][j] = num++; // num++: 10 , ++num:11

			}

		}

		// System.out.println("su[0][0]: " +su[0][0]);

		// 2차원 배열 su에 값 출력

		for (int i = 0; i < su.length; i++) {

			for (int j = 0; j < su[i].length; j++) {

				System.out.print(su[i][j] + " ");

			}

			System.out.println();

		}

		System.out.println();

		System.out.println("문제1");

		// 1차원 배열 요소게서 홀수와 짝수의 합 각각 출력

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int h = 0; // 홀

		int c = 0; // 짝

//		for(int i= 0; i <arr.length; i++) {

//			if(arr[i]%2==0) {

//				c+=arr[i];

//			}else {

//				h+=arr[i];

//			}

//		}

//		System.out.println("짝수의 합" + c + "\n홀수의 합" + h);

		for (int i : arr) {

			if (i % 2 == 0) {

				c += i;

			} else {

				h += i;

			}

		}

		System.out.println("짝수의 합 : " + c + "\n홀수의 합 : " + h);



		System.out.println();

		System.out.println("문제2");

		// 2차원 배열 전체 요소의 합을 출력

		int arr2[][] = { { 1, 2 }, { 3, 4 } };

		int ahap = 0;

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[0].length; j++) {

				ahap += arr2[i][j];

			}

		}

		System.out.println("arr2 배열 요소의 총합 : " + ahap);



	}
}
