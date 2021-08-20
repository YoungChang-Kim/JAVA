package lab.itank.thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		go();		
	}

	public void go() {
		
		//�������� �������� ���̴� ���
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		doMore();
		
	}

	public void doMore() {
		System.out.println(Thread.currentThread().getName());		
	}

}
