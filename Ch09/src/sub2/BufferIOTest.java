package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/** 날짜 : 2024/01/11
 *  이름 : 박임재
 *  내용 : Java 데이터 입출력 스트림 버퍼 실습
 */
public class BufferIOTest {
	public static void main(String[] args) {
		// 바탕화면의 파일 위치경로로 지정
		String source = "C:\\Users\\java\\Desktop\\Java.zip";
		String target = "C:\\Users\\java\\Desktop\\JavaCopy.zip";

		try {
			// 스트림 생성( 연결 ) 경로상의 파일을 못찾을때의 예외 처리
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
		
			// 보조 스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				// 파일 읽기
				int data = bis.read();
				
				if(data == -1) {
					// 파일을 모두 읽었을 때 반복 종료
					break;
				}
				// 리턴 타입 int 아스키코득 값으로 출력됨
				
				// 파일 쓰기
				bos.write(data);
			}
			// 스트림 해제
			bos.flush(); // 버퍼에 남은 데이터를 비워줌
			
			bis.close();
			bos.close();
			
			fis.close();
			fos.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램종료");	
	}
}
