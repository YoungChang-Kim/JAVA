package lab.itank.lambda;

import java.util.function.Consumer;

public class LamdbaTest{

	public static void main(String[] args) {
		A a = new A() {
			public void exec() {
				System.out.println("A 익명 내부클래스");
			}			
//			public void run() {}
		};
		
		a.exec();
		
		A r01 = ()->{System.out.println("A 람다식");};
		r01.exec();
		
		B b = new B() {
			public void exec(int time) {
				System.out.println("B 익명 내부클래스 : " + time);
			}
		};
		b.exec(1);
		
		B r02 = (t) -> { System.out.println("B 람다식 : "+ t);};		
		r02.exec(5);
		
		C r03 = (t, n) -> {
			System.out.println("C 람다식 : - 시간 : "+ t + ", 이름 : "+ n);
		};
		
		r03.run(3, "영창");
		
		D r04 = (t, n) -> {
			System.out.println(t);
			System.out.println(n);
			return n + "스레드가" + t + "초 동안 실행되었습니다.";
		};
		
		System.out.println(r04.run(5, "Main"));
		
		
	}

}
