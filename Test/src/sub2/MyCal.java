package sub2;

import java.util.Scanner;

public class MyCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0; // 1 덧셈, 2 뺼셈, 3곱셈, 4나눗셈
		int result = 0;
		boolean check2 = true; // true는 연산자 false 는 y
		boolean check = true; // true는 x false는 y
		
		while (true) {
			System.out.print(">");
			String input = sc.next();
			
			if (check==true) {
				if (check2==true) {
					x = Integer.parseInt(input);
					check = false;
				}
			} else if (check==false){
				if (check2==true) {
					if (input.equals("+")) {
						z = 1;
					}else if (input.equals("-")) {
						z = 2;
					}else if (input.equals("*")) {
						z = 3;
					}else if (input.equals("/")) {
						z = 4;
					}
				check2 = false;
				} else if (check2==false){
					y = Integer.parseInt(input);
					if (z==1) {
						result = x + y;
					}else if (z==2) {
						result = x - y;
					}else if (z==3) {
						result = x * y;
					}else if (z==4) {
						result = x / y;
					}
					check = true;
					check2 = true;
					System.out.println(result);
				}
			}
		}
	}
}