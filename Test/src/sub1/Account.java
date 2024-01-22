package sub1;

public class Account {


    private String ano;
    private String owner;
    private int balance;

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌번호: " + ano + " | 계좌주: " + owner + " | 잔액: " + balance;
    }

    public String getAno() {
        return ano;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    // 예금
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\n"+amount + "원을 예금했습니다.");
        } else {
            System.out.println("양수 금액만 예금 가능합니다.");
        }
    }

    // 출금
    public void withdraw(int amount) {
    	// 잔액 확인후 출금
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("\n"+amount + "원을 출금했습니다.");
        } else if (amount <= 0) {
            System.out.println("출금 금액이 잔액보다 많아 출금이 불가능합니다.");
        } else {
            System.out.println("잔액이 부족하여 출금이 불가능합니다.");
        }
    }
}
