package lab.itank.thread;

public class BankAccountJob implements Runnable{

	private BankAccount account = new BankAccount();	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			makeWithdraw(10);
			
			if(account.getBalance()<0) {
				System.out.println("윽!!! 마이너스야");
			}else if(account.getBalance()==0){
				System.out.println("0원이야");
			}
		}
		
	}
	
	public synchronized void makeWithdraw(int amount) {		
		
		if(account.getBalance() >= amount) {
			account.withdraw(amount);
			System.out.println(account.getBalance()+"남았습니다.");
		}else {
			System.out.println("잔고 부족");
		}
		System.out.println("저희 은행을 이용해주셔서 감사합니다.\n");	
		
	}
	
	public static void main(String[] args) {
		BankAccountJob job = new BankAccountJob();
		
		Thread a = new Thread(job, "부인");
		Thread b = new Thread(job, "남편");
		
		a.start();
		b.start();
	}
	
}
