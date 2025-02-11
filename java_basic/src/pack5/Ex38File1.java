package pack5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex38File1 {
	public static void main(String[] args) throws Exception{
		// 1바이트 단위의 입출력, 문자열 출력
		System.out.print("1바이트 입력 : ");
		int a = System.in.read();	// 한글 등의 2바이트 문자는 입력 물가	
		System.out.println("a : " + a +  " " + (char)a);
				
		System.out.println("\n문자열 출력");
		OutputStreamWriter os = new OutputStreamWriter(System.out);
//		byte b = 97;
//		os.write(b);
//		os.flush();


		BufferedWriter bw = new BufferedWriter(os, 1024);	//입출력은 기본이 1024byte(1Kb) 단위로 처리함
		PrintWriter out = new PrintWriter(bw);
		out.println(123);
		out.println("문자열 출력");
		out.close();
		bw.close();
		
		System.out.println("파일 단위의 출력");
		File f = new File("c:/work/iotest.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw1 = new BufferedWriter(fw, 1024);
		PrintWriter out1 = new PrintWriter(bw1);
		out1.println(1234);
		out1.println("문자열이 파일로 출력됨");
		out1.println("끝");
		out1.close();
		bw1.close();
		
		
		
		
	
		
		
		
		
		
		}
}
