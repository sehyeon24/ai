package com.lec.ex1_inputstreamOutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
// 파일 열기(스트림객체 생성) -> 쓰기 -> 파일 닫기(스트림객체 close닫기)
public class Ex03_OutputStream {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			// 1. 파일 열기	// true:append(생략하거나) false:덮어쓰기 
			os = new FileOutputStream("txtFile/outTest.txt", true);	// 있는 파일은 덮어쓰고, 없는 파일은 생성 | " " : 상대경로(/절대경로)
			// byte[] bs = {'H', 'e', 'l', 'l', 'o', ','};
			String msg = "Hello, World\nHi, AI\n";	// 내용을 변경하면 txtFile내 .txt파일 내용이 바뀜
			byte[] bs = msg.getBytes();	// String을 위 //byte배열로 만들어줌
			// 2. 데이터 쓰기
			os.write(bs);
			System.out.println("파일 출력 성공");
		} catch (IOException e) {
			System.out.println("폴더가 없을 때 : " + e.getMessage());
		} finally {
			try {	// 3. 파일 닫기
				if(os != null) os.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}//try-catch-finally
	}//main
}//class
