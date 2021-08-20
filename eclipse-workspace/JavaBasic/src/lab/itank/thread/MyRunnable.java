package lab.itank.thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		go();		
	}

	public void go() {
		
		//실행결과의 예측성을 높이는 방법
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
