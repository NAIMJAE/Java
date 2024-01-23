package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sub3.User4VO;


/**
 * 날짜 : 24/01/23
 * 이름 : 박임재
 * 내용 : Transaction 실습
 */
public class TransactionTest2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/Bank";
		String user = "naimjae";
		String pass = "abc1234";
		
		List<User3VO> users = new ArrayList<>();
		
		// catch문에서 참조하기 위해 try 밖으로 빼기 초기화와 선언 분리
		Connection conn = null;
		
		try {
			System.out.print("입금 금액 입력 : ");
			int sc1 = scan.nextInt();
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
			
		// 트랜잭션 시작
			conn.setAutoCommit(false); // 쿼리문들 작업이 디스크로 확정 x
			
			//3단계 - SQL 실행 객체 생성 및 맵핑
			String sql1 = "UPDATE `bank_account` SET `a_balance` = `a_balance` - ? WHERE `a_no`=?";
			String sql2 = "UPDATE `bank_account` SET `a_balance` = `a_balance` + ? WHERE `a_no`=?";
			String sql3 = "SELECT `a_no`, `a_balance` FROM `bank_account` WHERE `a_no` IN(?, ?)";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setInt(1, sc1);
			psmt1.setString(2, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setInt(1, sc1);
			psmt2.setString(2, "101-11-1003");
			
			PreparedStatement psmt3 = conn.prepareStatement(sql3);
			psmt3.setString(1, "101-11-1001");
			psmt3.setString(2, "101-11-1003");
			
			//4단계 - SQL 실행
			psmt1.executeUpdate();
					
			psmt2.executeUpdate();
			
			conn.commit();
			// 작업 확정
			
			ResultSet rs = psmt3.executeQuery();
			
			//5단계 - 결과 처리 (SELECT 경우)
			while(rs.next()) {
				// VO 객체 생성 및 초기화
				User3VO vo = new User3VO();
				vo.setA_no   (rs.getString(1));
				vo.setA_balance    (rs.getInt(2));
				
				users.add(vo);
			}
									
			//6단계 - 데이터베이스 종료
			psmt1.close();
			psmt2.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			// 트랜잭션 취소 - 취소 처리 (롤백)
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		scan.close();
		// 결과 출력
		for (User3VO vo : users) {
			System.out.printf("%s, %d\n", 
					vo.getA_no(),vo.getA_balance());
		}
		System.out.println("트랜잭션 완료...");
	}
}
