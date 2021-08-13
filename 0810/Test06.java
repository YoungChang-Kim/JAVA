interface C{
	//상수랑 추상메소드

	//정적메소드
	static void method01(){
		System.out.println("정적메소드는 인터페이스 이름으로 호출 가능합니다.");
	}

	//디폴트 메소드
	public default void method02(){
		System.out.println("C 인터페이스의 default 메소드 호출");
	}
	
	//추상 메소드
	void method03();
}

interface DD extends C{
	public default void method02(){
		System.out.println("DD 인터페이스의 default 메소드 호출");
	};
}

class F implements DD{
	public void method02(){
		System.out.println("F클래스의 method02");
	}

	public void method03(){
		System.out.println("F클래스의 method03");
	}

}

class Test06{
	public static void main(String[] args){
		C.method01(); // o
		//C.method02(); // x

		CC cc = new CC();
		cc.method02();//디폴트 메소드 : implements 해서 구현 없이 바로 사용 가능
		cc.method03();//추상 메소드 : implements 해서 구현해야 사용가능
		
		F f = new F();
		f.method03();
	}
}

class CC implements C{
	public void method03(){
		System.out.println("인터페이스의 method03 호출");
	}
	//디폴트 메소드는 재정의 가능.
	public void method02(){
		System.out.println("인터페이스의 default 메소드 호출");
	}
}
