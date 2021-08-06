// 클래스타입의 객체변수 *
// 클래스타입의 클래스변수
// 클래스타입의 파라미터 * 
// 클래스타입의 지역변수

class A{
	int i;
	B b;

	A(){}
	A(int i){}
	A(B b){}

	A(int i, B b){
		this.i = i;
		this.b = b;
	}	

	void methodA(int i, B b){
		if(b.b == true){
			System.out.println("사실입니다.");
		}else{
			System.out.println("사실이 아닙니다.");
		}
	}
	void methodB(){
		//B클래스의 methodB();
		methodA(3, new B("a", false));
	}
}

class B{
	String a;
	boolean b;

	B(){}

	B(String a, boolean b){
		this.a = a;
		this.b = b;
	}

	void methodB(){};
}