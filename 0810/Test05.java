//인터페이스
interface A{
	//(v_1.7)
	//상수
	//추상 메소드
	//인터페이스 내에 변수, 메소드에 final, abstract, public 생략 가능
	//public static final double PI = 3.14;//상수는 변수명을 전부 대문자로 표현
	double PI = 3.14;

	//public abstract void methodA();
	void methodA();

	//(v_1.8) 
	//정적 메소드
	//디폴트 메소드
}

interface H extends A{}
interface I{}
class X{}


//클래스 -> 인터페이스 : implements
//클래스 -> 클래스 , 인터페이스 -> 인터페이스 : extends

class B extends X implements H,I{
	//구현 상속효과
	/*
	Test05.java:29: error: '{' expected
	class B extends X,Y{//구현 상속효과
	                 ^
	*/
		public void methodA(){
		//PI = 2.14;
			System.out.println(PI);
		}
}

class Test05{

	public void methodA(X x){}
	public void methodB(H h){}
	public void methodC(I zxc){}
	public void methodD(A a){}
	public static void main(String[] args){
		//interface 는 new 할 수 없어요.
		B b = new B();
		b.methodA();

		X x = new B();
		H h = new B();
		I i = new B();
		A a = new B();

		Test05 t5 = new Test05();
		t5.methodA(new B());
		t5.methodB(new B());
		t5.methodC(new B());
		t5.methodD(new B());
	}
}
