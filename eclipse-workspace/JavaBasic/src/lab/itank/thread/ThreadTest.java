package lab.itank.thread;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable job = new MyRunnable();
		
		Thread myThread = new Thread(job, "1��������");
		myThread.start(); //2
		
		Thread myThread2 = new Thread(job, "2��������");
		myThread2.start(); //3
		
		System.out.println("main end!!!");
	}
}