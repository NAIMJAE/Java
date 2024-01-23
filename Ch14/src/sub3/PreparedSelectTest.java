package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 날짜 : 24/01/23
 * 이름 : 박임재
 * 내용 : PreparedStatement 실습
 */
public class PreparedSelectTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "naimjae";
		String pass = "abc1234";
				
		List<User4VO> users = new ArrayList<>();
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL 실행 객체 생성 및 맵핑
			// 쿼리 파라미터가 없는 쿼리문
			String sql = "SELECT * FROM `User4`";
			PreparedStatement psmt = conn.prepareStatement(sql);
		
			//4단계 - SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			//5단계 - 결과 처리 (SELECT 경우)
			while(rs.next()) {
				// VO 객체 생성 및 초기화
				User4VO vo = new User4VO();
				vo.setUid   (rs.getString(1));
				vo.setName  (rs.getString(2));
				vo.setGender(rs.getString(3));
				vo.setAge   (rs.getInt(4));
				vo.setHp    (rs.getString(5));
				vo.setAddr  (rs.getString(6));
				
				users.add(vo);
			}
			
			//6단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 결과 출력
		for (User4VO vo : users) {
			System.out.printf("%s, %s, %s, %d, %s, %s\n", 
					vo.getUid(), vo.getName(), vo.getGender(), vo.getAge(), vo.getHp(), vo.getAddr());
		}
		
		System.out.println("SELECT 완료...");
	}
}
