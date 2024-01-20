package GPT09_PointCard;

public class Customer {
	int sum = 20000;
	int point;
	
	public Customer() {}
	
	// 금액 차감
	public void custSum(int cafeMenuCost) {
		sum -= cafeMenuCost;
	}
	
	// 포인트 적립
	public void custPoint(int cafeMenuCost) {
		point += (cafeMenuCost * 0.2);
		System.out.println("현재 포인트 : " + point);
	}
}
