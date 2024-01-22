package GPT09_PointCard;

import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		int cafeMenuCost;
		
		// 객체 생성
		CafeInfomation cafeinfo = new CafeInfomation();
		Customer cust = new Customer();
		cafeinfo.show();
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.println("원하시는 메뉴를 선택해 주세요");
			System.out.print("메뉴 입력 : ");
			String custInput = sc.nextLine();
			System.out.println(custInput + "를 선택하셨습니다.");
			cafeinfo.menu(custInput);
			
			
			// 고객 잔고 확인
			if ((cafeinfo.menuCost) > (cust.sum)) {
				System.out.println("잔액이 부족합니다.");
				continue;
			}else {
				cafeMenuCost = cafeinfo.menuCost;
			}
			
			// 주문 과정 / 금액 차감
			cust.custSum(cafeMenuCost);
			System.out.println("주문하신 " + custInput + "나왔습니다.");
			cust.custPoint(cafeMenuCost);
		}
	}
}
