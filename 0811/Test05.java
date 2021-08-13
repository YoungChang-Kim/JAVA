//final 에약어
//1.클래스 앞
//2.메소드 앞
//3.변수 앞


//1.클래스 앞 : 상속이 불가능한 클래스가 된다.(상속 할 수 없다.)
final class ClassA{
}

//class ClassB extends ClassA{}

//2. 메소드 앞 : 오버라이딩 할 수 없다.
class ClassC{
	final void methodA(){}
}

//
class ClassD extends ClassC{
	//void methodA(){}
}


//3. 변수 앞 : 초기값을 변경 할 수 없다.
class ClassE{
	static final double PI = 3.14;

	double getPI(){

		//PI = 3.141492;
		return PI;
	}
}

// class ClassD extends ClassC{void methodA(){}}

//조금 더 들여다 보기
class ClassF{
	
	final double A;
	
	ClassF(){A = 100.0;}
	ClassF(double A){
		this.A = A;
	}
}

class ClassG{
	
	static final double A = 100.0;
	
	//ClassG(){A = 100.0;}
	//ClassG(double A){this.A = A;}
}

class ClassH{

	ClassH(final double d){
		//d=100.0;
		
		final int i=0;
		//i=5;
	}
}

class Test05{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
