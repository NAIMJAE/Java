package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/** 날짜 : 2024/01/11
 *  이름 : 박임재
 *  내용 : Java 역직렬화 실습
 */
public class DeserializeTest2 {
	public static void main(String[] args) {
		
		// 객체를 바탕화면에 파일로 저장
		String source = "C:\\Users\\java\\Desktop\\Apple.txt";
		
		try {
			// 객체를 직렬화하기 위한 스트림 생성
			FileInputStream fis = new FileInputStream(source);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 역직렬화
			Apple apple = (Apple)ois.readObject();
			apple.show();
			
			// 스트림 해제
			ois.close();
			fis.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
