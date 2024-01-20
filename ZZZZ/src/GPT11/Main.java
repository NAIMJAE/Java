package GPT11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 변수 선언
		int check = 0;
		
		// 객체 생성
		Scanner sc = new Scanner(System.in);
		List<Map<String, String>> txNum = new ArrayList<>();
		Map<String, String> txList = new HashMap<>();
		Input input = new Input();
		
		// 사용자 입력
		while(true){
			if(check==0) {
				// user interface
				System.out.println("┌────────────────────────────────────────────┐");
				System.out.println("││　　　　　텍스트를　저장하고　불러올　수　있습니다　    ││");
				System.out.println("││　　　　　　　원하시는　번호를　선택해주세요　　　　    ││");
				System.out.println("├────────────────────────────────────────────┤");
				System.out.println("│　　입력하기　││　목록보기　││　불러오기　││　종료하기　　│");
				System.out.println("│　　　　１　　││　　　２　　││　　　３　　││　　　４　　　│");
				System.out.println("├────────────────────────────────────────────┤");
				System.out.print("작업 선택 : ");
				int userChoice = sc.nextInt();
				if(userChoice == 1) {
					System.out.println("텍스트를 입력합니다 \n");
					check = 1;
				}else if(userChoice == 2) {
					System.out.println("텍스트 목록을 봅니다 \n");
					check = 2;
				}else if(userChoice == 3) {
					System.out.println("텍스트를 불러옵니다 \n");
					check = 3;
				}else if(userChoice == 4) {
					System.out.println("프로그램을 종료합니다 \n");
					check = 4;
				}
				
			} else if(check==1) {
				System.out.println("check" + check); // 확인 구문
				input.teTitleInput();
				input.teContInput();
				
				txList.put(txTitle, txContents)
				txNum.add(txList);
				System.out.println(txNum.get(0));

				
				check = 0;
			}
		}
		
	}
}

