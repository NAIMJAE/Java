package sub1;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 날짜 : 24/01/22
 * 이름 : 박임재
 * 내용 : JDBC 실습
 * 
 * MySQL 홈페이지에서 Connector/J 라이브러리 다운
 * 프로젝트에 mysql라이브러리 적용
 */
public class JDBCTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "naimjae";
		String pass = "abc1234";
		
		try {
			// JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {
				System.out.println("DB 접속 성공");
			} else {
				System.out.println("DB 접속 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
