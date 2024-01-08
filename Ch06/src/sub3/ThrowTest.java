package sub3;
/**
 * 날짜 : 2024/01/08
 * 이름 : 박임재
 * 내용 : Java 예외 발생 시키기 실습
 */

// 사용자 정의 예외 클래스
class MinusException extends Exception {
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception {
	public OverException(String msg) {
		super(msg);
	}
}

class Score {
	public void check(int score) throws MinusException, OverException {
		if(score < 0) {
			// 개발자가 정의한 예외 발생시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
		} else if(score > 100) {
			throw new OverException("점수는 100점을 넘을 수 없습니다.");
		} else {
			System.out.println("점수에 이상 없습니다.");
		}
	}
}

public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
			score.check(-6);
		} catch (MinusException | OverException e) {
			e.printStackTrace();
		}
	}
}
