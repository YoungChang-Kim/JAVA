package lab.itank.lambda;

import java.util.function.Consumer;

public class LamdbaTest{

	public static void main(String[] args) {
		A a = new A() {
			public void exec() {
				System.out.println("A �͸� ����Ŭ����");
			}			
//			public void run() {}
		};
		
		a.exec();
		
		A r01 = ()->{System.out.println("A ���ٽ�");};
		r01.exec();
		
		B b = new B() {
			public void exec(int time) {
				System.out.println("B �͸� ����Ŭ���� : " + time);
			}
		};
		b.exec(1);
		
		B r02 = (t) -> { System.out.println("B ���ٽ� : "+ t);};		
		r02.exec(5);
		
		C r03 = (t, n) -> {
			System.out.println("C ���ٽ� : - �ð� : "+ t + ", �̸� : "+ n);
		};
		
		r03.run(3, "��â");
		
		D r04 = (t, n) -> {
			System.out.println(t);
			System.out.println(n);
			return n + "�����尡" + t + "�� ���� ����Ǿ����ϴ�.";
		};
		
		System.out.println(r04.run(5, "Main"));
		
		
	}

}
