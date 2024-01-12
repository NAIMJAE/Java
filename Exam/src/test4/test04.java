package test4;
/**
 * 날짜 : 2024/01/12
 * 이름 : 홍길동
 * 내용 : 문자열 연습문제
 */
public class test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, 10);
		String ext = fileName.substring(idx + 1);
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92"; // !!!!공백 중요!!!!
		String[] scores = strScores.split(","); 
		
		int total = 0;
		
		for(String score : scores) {
			// scores는 문자열 타입이므로 Integer.parseInt이용해 형변환
			total += Integer.parseInt(score.trim());  //trim() 공백 제거
		}
		
		System.out.println("strScores 총점 : " + total);
	}
}
