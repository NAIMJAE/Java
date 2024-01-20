package GPT06;

public class BankAccount {
	public int balance; // 잔액
	
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println(amount + "원 입금되었습니다.");
	}
	
	public void withdraw(int amount) throws InsufficientFundsException {
		if (amount <= balance) {
			this.balance -= amount;
			System.out.println(amount + "원 출금되었습니다.");
		} else {
			throw new InsufficientFundsException("잔액 부족");
		}
	}
}
