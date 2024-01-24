package sub5;

import java.util.List;
import java.util.Scanner;

/**
 * 날짜 : 24/01/24
 * 이름 : 박임재
 * 내용 : CRUD 실습
 */
public class CRUDTest {
	public static void main(String[] args) {
		
		System.out.println("회원관리매니저 v1.0");
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.println("선택 >");
			
			UserDAO dao = UserDAO.getInstance();
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
			////// 종료
				break;
			}else if(answer == 1) {
			////// 입력
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				System.out.print("생년월일 입력 : ");
				String birth = sc.next();
				
				System.out.print("주소 입력 : ");
				String addr = sc.next();
				
				UserDTO dto = new UserDTO();
				dto.setUid(uid);
				dto.setName(name);
				dto.setBirth(birth);
				dto.setAddr(addr);
				
				dao.insertUser(dto);
				
			}else if(answer == 2) {
			////// 조회
				List<UserDTO> users = dao.selectUsers();
				
				for(UserDTO user : users) {
					System.out.println(user);
				}
				
			}else if(answer == 3) {
			////// 검색
				System.out.print("아이디 검색 : ");
				String uid = sc.next();
				
				UserDTO user = dao.selectUser(uid);
				
				if(user == null) {
					System.out.println("해당하는 아이디를 가진 사용자가 없습니다.");
				}else {
					System.out.println(user);
				}
				
			}else if(answer == 4) {
			////// 수정
				UserDTO user = new UserDTO();
				
				System.out.print("수정 회원 아이디 입력 : ");
				user.setUid(sc.next());
				System.out.print("수정 회원 이름 입력 : ");
				user.setName(sc.next());
				System.out.print("수정 회원 생년월일 입력 : ");
				user.setBirth(sc.next());
				System.out.print("수정 회원 주소 입력 : ");
				user.setAddr(sc.next());
				
				dao.updateUser(user);
				
			}else if(answer == 5) {
			////// 삭제
				UserDTO user = new UserDTO();
				
				System.out.print("삭제 회원 아이디 입력 : ");
				user.setUid(sc.next());
				
				dao.deleteUser(user);
				
			}
		}
		sc.close();
		System.out.println("회원관리매니저 종료...");
	}
}
