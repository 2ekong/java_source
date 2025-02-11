package pack3;

import java.util.Scanner;

public class Ex10Machine {
	private int cupCount;
	Ex10Coinln coinln = new Ex10Coinln();

	
	public void showData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("동전을 입력하세요");
		coinln.setCoin(scanner.nextInt());
		System.out.println("몇잔?");
		cupCount = scanner.nextInt();
		System.out.println(coinln.calc(cupCount));
		
	}
	
}
