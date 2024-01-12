package test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 날짜 : 2024/01/12
 * 이름 : 홍길동
 * 내용 : Java 입출력 연습문제
 */
public class test10 {
	public static void main(String[] args) {
		
		String path = "c:\\Users\\java\\Desktop\\Gugudan.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2 ; x<=9 ; x++) {
				
				fw.write(x + "단\n");
				
				for(int y=1 ; y<=9 ; y++) {
					int z = x * y;
					fw.write(x + "x" + y + "=" + z + "\n");
				}
			}
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("구구단 파일 생성 완료.");
	}
}
