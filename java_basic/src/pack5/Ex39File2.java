package pack5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ex39File2 {
	public static void main(String[] args) throws Exception{
		//Concole을 이용한 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int nai = sc.nextInt();
		System.out.println("나이는 " + nai);
		
		
		System.out.println("파일 잔위의 입력(읽기)");
		File f = new File("c:/work/iotest.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br1 = new BufferedReader(fr);
		
		while(true) {
			String str = br1.readLine();
			if(str == null) break;
			System.out.println(str);
		}
		
		br1.close();
		fr.close();
		
		
		
	}
}
