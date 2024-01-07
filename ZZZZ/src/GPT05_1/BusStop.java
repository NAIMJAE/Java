package GPT05_1;

import java.util.Scanner;

public class BusStop {
	public static String[] aaa = {"126번", "37번", "21번", "55번", "99번"};
	public static int bbb = (int)(Math.random()*6) + 1;;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		
		System.out.println("양정역 버스 도착안내 입니다.");
		System.out.println("버스 번호를 입력해주세요.");
		
		
		while (check != true) {
			System.out.print("버스 번호 : ");
			String busCheck = sc.nextLine();
			if (busCheck.endsWith("126")) {
				Bus bus = new Bus(aaa[0], bbb);
				bus.showInfo();
				check = true;
			} else if (busCheck.endsWith("37")){
				Bus bus = new Bus(aaa[1], bbb);
				bus.showInfo();
				check = true;
			} else if (busCheck.endsWith("21")){
				Bus bus = new Bus(aaa[2], bbb);
				bus.showInfo();
				check = true;
			} else if (busCheck.endsWith("55")){
				Bus bus = new Bus(aaa[3], bbb);
				bus.showInfo();
				check = true;
			} else if (busCheck.endsWith("99")){
				Bus bus = new Bus(aaa[4], bbb);
				bus.showInfo();
				check = true;
			} else {
				System.out.println("버스 번호를 다시 입력해주세요.");
			}
		}
		sc.close();
	}
	
}
