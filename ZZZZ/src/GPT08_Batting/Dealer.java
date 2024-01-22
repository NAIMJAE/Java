package GPT08_Batting;

public class Dealer {
	int batSum;
	
	public Dealer() {

	}
	
	// 플레이어 배팅
	public void batSum(int playerBat) {
		batSum += playerBat;
		System.out.println("** 플레이어  " + playerBat + "원 배팅 **");
	}
	
	// 딜러 금액 초기화
	public void DealerSum(int batSum) {
		this.batSum = batSum;
	}
}
