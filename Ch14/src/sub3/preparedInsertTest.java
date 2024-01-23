package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 날짜 : 24/01/23
 * 이름 : 박임재
 * 내용 : PreparedStatement 실습
 * 
 * PreparedStatemet
 * - 기존 Statement 보다 향상된 동적 SQL 생성을 위한 Statement
 * - Query Parameter를 사용해서 값을 Mapping 해서 쿼리 실행
 * 
 * VO객체
 * - VO(Value Object) 객체는 SELECT의 결과 테이블의 속성을 갖는 객체
 * - 테이블 개체(Entity)를 객체(Object)로 변환할 때 사용하는 객체
 * - Spring에서는 DTO(Data Transfer Object)로 사용
 */
public class preparedInsertTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "naimjae";
		String pass = "abc1234";
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL 실행 객체 생성 및 맵핑
			// prepareStatement는 매개변수로 쿼리문을 가짐
			// (?,?,?,?) = 쿼리 파라미터 (완성되지 않은 쿼리문)
			String sql = "Insert into `User1` values (?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "B101");
			psmt.setString(2, "장보고");
			psmt.setString(3, "99-88-11");
			psmt.setString(4, "010-1234-4444");
			psmt.setInt(5, 56);
			// Mapping, Binding
			// 쿼리문에 ?들에 자바코드로 매핑
			
			//4단계 - SQL 실행
			psmt.executeUpdate();
			
			//5단계 - 결과 처리 (SELECT 경우)
			
			//6단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("INSERT 완료...");
	}
}
