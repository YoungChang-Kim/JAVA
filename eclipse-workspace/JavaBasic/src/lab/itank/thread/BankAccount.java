package lab.itank.thread;

public class BankAccount {
	
	private int balance = 100;

	//�ܾ� ��ȸ
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
//		balance = balance - amount
	}
	
		
}
