interface C{
	//1.추상 메소드
	public void abstractMethod();

	//2.상수
	public final int one = 1;

	//3.디폴트 메소드
	public default void defaultMethod(){
		System.out.println("디폴트 메소드 호출");
	}

	//4.정적 메소드
	public static void staticMethod(){
		System.out.println("정적 메소드 호출");
	}

}


class CC implements C{
	//1.추상 메소드 구현
	public void abstractMethod(){
		System.out.println("CC 클래스의 추상 메소드 구현");
	}

	//2. 디폴트 메소드 오버라이딩
	public void defaultMethod(){
		System.out.println("CC 클래스의 디폴트 매소드 오버라이딩");
	}
	//3. 정적 메소드 오버라이딩

	public static void staticMethod(){
		System.out.println("CC 클래스의 정적 메소드 오버라이딩");
	}
}

interface DD extends C{
	
}

class F implements DD{
	//1.추상 메소드 구현
	public void abstractMethod(){
		System.out.println("F 클래스의 추상 메소드 구현");
	}

	//2. 디폴트 메소드 오버라이딩

	//3. 정적 메소드 오버라이딩

	public static void staticMethod(){
		System.out.println("F 클래스의 정적 메소드 오버라이딩");
	}
}

class Test06{
	public static void main(String[] args){
		//1.객체 선언
		CC c = new CC();
		F f = new F();
		
		//추상메서드 호출
		c.abstractMethod();
		//CC클래스의 정적 메소드 호출
		CC.staticMethod();

		//
	}
}

