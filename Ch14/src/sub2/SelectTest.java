package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 날짜 : 24/01/22
 * 이름 : 박임재
 * 내용 : MySQL Select 실습
 */
public class SelectTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "naimjae";
		String pass = "abc1234";
		
		// 결과 처리용 List
		List<User1> users = new ArrayList<>();
		
		try {  // ★★★★★★★★
			// 1단계 - JDBC Driver 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "SELECT * FROM `User1`";

			ResultSet rs = stmt.executeQuery(sql); 
			// executeUpdate = insert, update, delete
			// executeQuery = select
			
			// 5단계 - 결과 처리 (SELECT 경우)
			// Table의 View의 Corsor를 하나씩 next해 튜플 하나씩 출력
			while(rs.next()) { 
				String uid =   rs.getString(1);
				String name =  rs.getString(2);
				String birth = rs.getString(3);
				String hp =    rs.getString(4);
				int    age =   rs.getInt(5);
				
				User1 u1 = new User1();
				u1.setAge(age);
				u1.setName(name);
				u1.setBirth(birth);
				u1.setHp(hp);
				u1.setUid(uid);
				
				users.add(u1);
			}
			
			// 6단계 - 접속 종료
			stmt.close();
			conn.close();
			rs.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		// List 출력
		for (User1 u1 : users) {
			System.out.printf("%s, %s, %s, %s, %d\n", 
					u1.getUid(), u1.getName(), u1.getBirth(), u1.getHp(), u1.getAge());
		}
		
		System.out.println("SELECT 완료");
	}
}
