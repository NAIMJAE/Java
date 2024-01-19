package sub1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	
	private static List<Account> accounts = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int userInput = sc.nextInt();
			
			
			 // 내용
			if (userInput == 1) {
				System.out.println("1");
				createAccount();  // 계좌생성
				
			}else if (userInput == 2) {
				System.out.println("2");
				accountList();  // 계좌목록
				
			}else if (userInput == 3) {
				System.out.println("3");
				deposit();  // 예금 
				
			}else if (userInput == 4) {
				System.out.println("4");
				withdraw(); // 출금
				
			}else if (userInput == 5) {
				System.out.println("5");
				break; // 종료
				
			}else {
				System.out.println("잘못입력하셨습니다.");
			}	
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		// 계좌번호, 계좌주, 초기입금액 입력
		System.out.print("계좌번호 : ");
		String accountNo = sc.next();
		
		System.out.print("계좌주 : ");
		String accountOwner = sc.next();
		
		System.out.print("초기입금액 : ");
		int accountBalance = sc.nextInt();
		
		//accounts 리스트에 저장
		Account a1 = new Account(accountNo, accountOwner, accountBalance);
		accounts.add(a1);
		System.out.println("계좌가 생성되었습니다.");
	}
	
	// 계좌목록보기
	private static void accountList() {
		System.out.println("계좌 목록");
		
		// for문 반복으로 accounts 객체 불러오기
		for (Account account : accounts) {
			System.out.println(account);
		}
	}
	
	// 예금하기
	private static void deposit() {
		// 계좌 번호 입력
		System.out.print("계좌번호 : ");
		String inputAno = sc.next();
		
		// findAccount 메서드로 계좌번호 찾기
		Account account = findAccount(inputAno);
		// 계좌 없으면 return
	    if (account == null) {
	        return;
	    }
	    
	    // 예금액 입력
	    System.out.println("현재 잔액: " + account.getBalance());
	    System.out.print("예금액 입력: ");
	    int depositAmount = sc.nextInt();
	    
	    // deposit 메서드에 예금 처리
	    account.deposit(depositAmount);
	    System.out.println("예금이 완료되었습니다.\n현재 잔액: " + account.getBalance());
	}

	// 출금하기
	private static void withdraw() {
		// 계좌 번호 입력
		System.out.print("계좌번호 : ");
	    String inputAno = sc.next();
	    
	    // findAccount 메서드로 계좌번호 찾기
		Account account = findAccount(inputAno);
		// 계좌 없으면 return
	    if (account == null) {
	        return;
	    }
	    
	    // 출금액 입력
	    System.out.println("현재 잔액: " + account.getBalance());
	    System.out.print("출금액 입력 : ");
	    int withdrawAmount = sc.nextInt();
	    
	    // 출금 가능한지 잔액 확인
	    if (account.getBalance() < withdrawAmount) {
	        System.out.println("잔액이 부족합니다.");
	        return;
	    }

	    // withdraw 메서드에 출금 처리
	    account.withdraw(withdrawAmount);
	    System.out.println("출금이 완료되었습니다.\n현재 잔액: " + account.getBalance());
	}

	// Account 리스트에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		// 사용자가 입력한 계좌번호와 일치하는 계좌를 찾고 계좌 반환
		for (Account account : accounts) {
			if (account.getAno().equals(ano)) {
				return account; 
			}
		}
		System.out.println("계좌를 찾을 수 없습니다.");
		System.out.println("계좌번호를 확인해 주세요.");
		return null;
	}

	
	
	
	
}