package GPT04;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean choice = false;
		
		while (!choice) {
		System.out.println("계산을 원하는 도형을 입력해 주세요. (직사각형 or 원)");
		String shap = sc.nextLine();
		
			if (shap.equalsIgnoreCase("직사각형")) {
				choice = true;
				System.out.println("직사각형의 가로 길이를 입력해 주세요.");
				int reLength = sc.nextInt();
				System.out.println("직사각형의 세로 길이를 입력해 주세요.");
				int reWidth = sc.nextInt();
				Rectangle re = new Rectangle(reLength, reWidth);
				re.calculateArea();
			} else if(shap.equalsIgnoreCase("원")) {
				choice = true;
				System.out.println("원의 길이를 입력해 주세요.");
				int ciLength = sc.nextInt();
				Circle ci = new Circle(ciLength);
				ci.calculateArea();
			} else {
				System.out.println("올바른 도형을 선택해 주세요.");
			}
		}
		
		sc.close();
	}
}