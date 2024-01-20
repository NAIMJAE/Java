package GPT09_PointCard;

public class CafeInfomation {
	int menuCost = 0;
	
	public CafeInfomation() {
	}

	public void show() {
		System.out.println("|---- 메뉴를 선택해 주세요 ----|");
		System.out.println("|---- 아메리카노   4000원 ----|");
		System.out.println("|---- 카페 라떼    4500원----|");
		System.out.println("|---- 카페 모카    5000원----|");
		System.out.println("|---- 아인슈패너    6000원----|");
	}
	
	public void menu(String coustinput) {
		
		if (coustinput.equals("아메리카노")) {
			menuCost = 4000;
			System.out.println(menuCost + "원 입니다.\n");
		}else if (coustinput.equals("카페 라떼")) {
			menuCost = 4500;
			System.out.println(menuCost + "원 입니다.\n");
		}else if (coustinput.equals("카페 모카")) {
			menuCost = 5000;
			System.out.println(menuCost + "원 입니다.\n");
		}else if (coustinput.equals("아인슈패너")) {
			menuCost = 6000;
			System.out.println(menuCost + "원 입니다.\n");
		}else {
			System.out.println("잘못 입력하셨습니다.\n");
		}
	}
}
