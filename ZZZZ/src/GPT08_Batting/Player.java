package GPT08_Batting;

public class Player {
	int asset;
	
	Player (int asset){
		this.asset = asset;
	}
	// 플레이어의 자산 출력
	void show() {
		System.out.println("플레이어 보유 자산 : " + asset + "\n");
	}
	
	// 플레이어의 배팅
	void playerbat(int playerBat) {
		asset -= playerBat;
		System.out.println("플레이어의 보유 자산 : " + asset + "\n");
	}
	
	// 플레이어 승리
	void playerWin(int playerBat) {
		asset += playerBat * 2;
		System.out.println("플레이어의 보유 자산 : " + asset + "\n");
	}
	
	// 배팅금 예외 처리
	int getAsset() {
        return asset;
    }
	
}
