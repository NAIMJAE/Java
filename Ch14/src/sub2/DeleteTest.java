package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 24/01/22
 * 이름 : 박임재
 * 내용 : MySQL Delete 실습
 */
public class DeleteTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "naimjae";
		String pass = "abc1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			Statement stmt = conn.createStatement();
			
			String sql = "DELETE FROM `User1` where `uid` = 'J101'";
			stmt.executeUpdate(sql); 
			
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE 완료");

	}
}
