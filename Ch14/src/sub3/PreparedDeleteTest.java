package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 날짜 : 24/01/23
 * 이름 : 박임재
 * 내용 : PreparedStatement 실습
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "naimjae";
		String pass = "abc1234";
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			String sql = "DELETE FROM `User1` WHERE `uid` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "B101");

			psmt.executeUpdate();
			
			conn.close();
			psmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE 완료...");		
	}
}
