package lab.itank.thread;

public class BankAccountJob implements Runnable{

	private BankAccount account = new BankAccount();	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			makeWithdraw(10);
			
			if(account.getBalance()<0) {
				System.out.println("��!!! ���̳ʽ���");
			}else if(account.getBalance()==0){
				System.out.println("0���̾�");
			}
		}
		
	}
	
	public synchronized void makeWithdraw(int amount) {		
		
		if(account.getBalance() >= amount) {
			account.withdraw(amount);
			System.out.println(account.getBalance()+"���ҽ��ϴ�.");
		}else {
			System.out.println("�ܰ� ����");
		}
		System.out.println("���� ������ �̿����ּż� �����մϴ�.\n");	
		
	}
	
	public static void main(String[] args) {
		BankAccountJob job = new BankAccountJob();
		
		Thread a = new Thread(job, "����");
		Thread b = new Thread(job, "����");
		
		a.start();
		b.start();
	}
	
}
