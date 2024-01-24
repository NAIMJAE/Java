package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 * 날짜 : 24/01/24
 * 이름 : 박임재
 * 내용 : CRUD 실습
 * Data Access Object
 * CRUD 처리 객체
 */
public class UserDAO {
	
	// 싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	// DB 정보
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
	private final String USER = "naimjae";
	private final String PASS = "abc1234";
	
	// DB자원
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	// 커넥션 생성
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		// 1단계
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2단계
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
////// CRUD 메서드
////// CHECK_USER
	public ResultSet checkUser(UserDTO user) {
		try {	
			conn = getConnection();
			
			psmt = conn.prepareStatement(SQL.CHECK_USER);
	        psmt.setString(1, user.getUid());
	        rs = psmt.executeQuery();
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
////// INSERT
	public void insertUser(UserDTO user) {
		try {
			conn = getConnection();
			
			if (checkUser(user).next()) {
	            System.out.println("이미 사용중인 id입니다.");
	            return;
	        }
			
			// 3단계
			psmt = conn.prepareStatement(SQL.INSERT_USER );
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getAddr());
			
			// 4단계
			psmt.executeUpdate();
			
			// 5단계
			// 6단계
			psmt.close();
			conn.close();
		}catch (Exception e){
			e.printStackTrace();
		}	
		System.out.println("등록 완료...\n");
	}
	
////// 전체 조회
	public List<UserDTO> selectUsers() {
		
		List<UserDTO> users = new ArrayList<UserDTO>();
		
		try {
			conn = getConnection();
			
			// 3단계
			stmt = conn.createStatement();
						
			// 4단계
			rs = stmt.executeQuery(SQL.SELECT_USERS);
			
			// 5단계
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setUid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setBirth(rs.getString(3));
				dto.setAddr(rs.getString(4));
				
				users.add(dto);
			}
			
			// 6단계
			stmt.close();
			conn.close();
			rs.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		return users;
	}
	
////// 검색
	public UserDTO selectUser(String uid) {
		
		UserDTO user = null;
		
		try {
			conn = getConnection();
			
			// 3단계
			psmt = conn.prepareStatement(SQL.SELECT_USER);
					
			psmt.setString(1, uid);
			
			// 4단계
			rs = psmt.executeQuery();
			
			// 5단계
			// uid 값은 중복 불가능한 값이라서 while 돌릴 필요x
			if(rs.next()) {
				user = new UserDTO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
			}
			
			// 6단계
			psmt.close();
			conn.close();
			rs.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		return user;
	}
	
////// 수정	
	public void updateUser(UserDTO user) {

		try {
			conn = getConnection();
			        
	        if (!checkUser(user).next()) {
	            System.out.println("해당 사용자가 데이터베이스에 없습니다.");
	            return;
	        }
			
			// 3단계
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getBirth());
			psmt.setString(3, user.getAddr());
			psmt.setString(4, user.getUid());
			
			// 4단계
			psmt.executeUpdate();
			
			// 5단계
			
			// 6단계
			rs.close();
			conn.close();
			psmt.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("수정 완료...\n");
	}
	
////// 삭제	
	public void deleteUser(UserDTO user) {

		try {
			conn = getConnection();
	        
	        if (!checkUser(user).next()) {
	            System.out.println("해당 사용자가 데이터베이스에 없습니다.");
	            return;
	        }
			
			// 3단계
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			
			psmt.setString(1, user.getUid());
			
			// 4단계
			psmt.executeUpdate();
			
			// 5단계
			
			// 6단계
			conn.close();
			psmt.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("삭제 완료...\n");
	}
}
