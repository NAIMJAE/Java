package GPT08_Batting;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BattingGame {
	public static void main(String[] args) {
		// 기타 객체 생성
		Scanner sc = new Scanner(System.in);
		Dealer dealer = new Dealer();
		
		// 안내 문구
		System.out.println("1~6사이의 숫자를 선택해주세요");
		System.out.println("주사위의 숫자와 일치하면 2배를 획득합니다.");
		System.out.println();// 개행
		
		// 플레이어의 초기 자산 출력
		Player player = new Player(2000000);
		player.show();
		
		
		
		while(true) {
			// 배팅 금액을 입력하세요.
			System.out.print("플레이어 배팅 금액 : ");
			int playerBat = sc.nextInt();
			System.out.println(); //개행
			
			// 플레이어 보유 자산 확인
			if (player.getAsset() < playerBat) {
	            System.out.println("ㅠㅠ보유 자산이 부족합니다ㅠㅠ \nㅠㅠㅠ 다시 배팅하세요 ㅠㅠㅠ");
	            continue;
	        }
			
	        dealer.batSum(playerBat);
	        player.playerbat(playerBat);
			
			// 플레이어의 숫자 선택
			System.out.print("플레이어 숫자 선택 : ");
			int playerNum = sc.nextInt();
			
			// 주사위 굴리기
			try {
	            // 3초 동안 실행을 멈춤
				TimeUnit.SECONDS.sleep(1);;
				System.out.println("~~~주사위 구르는 중~~~");
				TimeUnit.SECONDS.sleep(1);;
				System.out.println("~~~주사위 구르는 중~~~\n");
				TimeUnit.SECONDS.sleep(1);;
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			int dice = (int)(Math.random()*6) + 1;
			
			// 플레이어 승패
			if(dice != playerNum) {
				System.out.println("#### 플레이어 패배 ####");
				System.out.println("#### 주사위    " + dice + "  ####");
				dealer.DealerSum(0);
				player.show();
				System.out.println("** 다음 게임을 시작합니다. **");
				
			}else {
				System.out.println("**** 플레이어 승리 ****");
				System.out.println("**** 주사위   " + dice + "  ****");
				dealer.DealerSum(0);
				player.playerWin(playerBat);
				System.out.println("** 다음 게임을 시작합니다. **");
			}
			
			
		}//while문 끝
		
		
		
		
		
		
		
	}
}
