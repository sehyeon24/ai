package com.lec.ex1_inputstreamOutputstream;
// \\=/ 같은기능
import java.io.*;

// ~/bts_7.mp4 => ~/bts_7_copy.mp4 (7,460,545 byte)
// D:\임세현\lecNote\01_java
public class Ex04_fileCopy {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();	// 1970.1.1부터 시작시점(지금)까지의 밀리세컨을 start로 둠
		
	//파일 카피하는 로직 집어넣기
		
		InputStream  is = null;
		OutputStream os = null;
		
		//스트림객체 생성
		try {
			is = new FileInputStream("D:/임세현/lecNote/01_java/bts_7.mp4");		// Stream 객체 생성
			os = new FileOutputStream("D:\\임세현\\lecNote\\01_java\\bts_copy.mp4");
			int cnt = 0;	// count변수
			while(true) {	// read & write
				int i = is.read();	// 1byte read					// 여기서부터
				if(i == -1) break;
				os.write(i);		// 여기까지가 읽고 쓰기 반복
				cnt++;
				if(cnt % 300000 == 0) {	// 0, 300000 일때마다 뿌림
					System.out.println(cnt + "/7,460,545 번");		// 여기까지 7,460,545 다 읽을 때까지 돔
				}
			}
			System.out.println("파일 복사 완료 : " + cnt + "번");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(is != null) is.close();
				if(os != null) os.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		
		long end = System.currentTimeMillis();		// 1970.1.1부터 종료시점까지의 밀리세컨을 end로 둠
		System.out.println((end-start)/1000.0 + "초 걸림");
		
	}
}
