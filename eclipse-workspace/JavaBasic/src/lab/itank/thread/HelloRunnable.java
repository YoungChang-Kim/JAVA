package lab.itank.thread;

public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("스레드 일하는 중");		
	}
	
	public static void main(String[] args) {
		
		Runnable job = new HelloRunnable();
		
		Thread thread = new Thread(job);
		
		thread.setPriority(Thread.MAX_PRIORITY);
				
		thread.start(); // 실행 대기 상태 돌입		
	}
}
