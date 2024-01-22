package GPT06;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) throws InsufficientFundsException {
		
		BankAccount aa = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금할 금액 : ");
		int bb = sc.nextInt();
		
		aa.deposit(bb);
		
		System.out.print("출금할 금액 : ");
		int cc = sc.nextInt();
		
		try {
			aa.withdraw(cc);
			System.out.println(cc + "원 출금");
		} catch (InsufficientFundsException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
}
