abstract class A{
	abstract void methodA();//추상메소드
	void methodB(){}
}

class B extends A{
	void methodA(){}
	void methodB(){}
}

abstract class Animal{
	abstract void eat();
}

class Test02{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
