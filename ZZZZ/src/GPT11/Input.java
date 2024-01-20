package GPT11;
/**
 * System.out.print("제목 : ");
				String txTitle = sc.nextLine();
				
				System.out.print("내용 : ");
				String txContents = sc.nextLine();
 */
import java.util.Scanner;

// 텍스트 입력하기
public class Input {
	Scanner sc = new Scanner(System.in);
	
	public Input() {
	}
	
	// 제목 입력
	public String teTitleInput() {
		System.out.println("제목과 내용을 입력해 주세요");
		System.out.print("제목 : ");
		String txTitle = sc.nextLine();
		return txTitle;
	}
	
	// 내용 입력
	public String teContInput() {
		System.out.print("내용 : ");
		String txContents = sc.nextLine();
		return txContents;
	}
}


