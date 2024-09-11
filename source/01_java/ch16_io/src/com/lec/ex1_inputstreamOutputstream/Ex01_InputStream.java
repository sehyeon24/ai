package com.lec.ex1_inputstreamOutputstream;

import java.io.*;
// (1) 파일을 연다(스트림객체생성) (2)데이터를읽는다(read메소드사용) (3)파일을 닫는다(close메소드사용)
public class Ex01_InputStream {
	public static void main(String[] args) {
		InputStream is = null;	// 변수 선언(close 해야하므로), String이라서 null로 초기화
		try {
			is = new FileInputStream("txtFile/inTest.txt");		// (1) 파일열기
			// (2)데이터를읽는다(파일 끝까지)
			while(true) {		// ~하는 동안(무한반복문)
				int i = is.read();	// 1byte씩 읽는다(1byte씩 읽어서 i에 넣음)
				if(i == -1) break;	// 파일의 끝이면 break;(끝은 -1로 나타남)
				System.out.print((char)i);	// (char)로 형변환 : 읽었다 출력했다 반복 후 -1이면 break;
			}
			System.out.println("끝");
										// (3)파일을 닫는다 : 이때 닫으면 안됨. catch절로 떨어질 수 있으므로
		} catch (FileNotFoundException e) {		// "txtFile/inTest.txt"가 없으면 예외 객체 자동 생성
			System.out.println("예외메세지 : 파일 못 찾음. " + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());	// read가 안됐을 때
		} finally {	// (3)파일을 닫는다(close메소드사용)
			try {
				if(is!=null) is.close();		// is가 null이 아니면 닫아야함. is에는 값이 아무것도 없어서 맨 위 변수 선언에 = null;값으로 초기화 해줘야 함
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
