abstract class A{
	abstract void methodA();//�߻�޼ҵ�
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
