class A{
	void methodA(String s){System.out.println("A 클래스의 methodA()");}
	void methodB(String s){System.out.println("A 클래스의 methodB()");}
	static void methodC(String s){System.out.println("A 클래스의 methodC()");}
	static void methodD(String s){System.out.println("A 클래스의 methodD()");}
}

class B extends A{
	//static void methodA(String s){} // 오류
	void methodB(String s){System.out.println("B 클래스의 methodB()");} 
	//void methodC(String s){} // 오류
	static void methodD(String s){System.out.println("B 클래스의 methodD()");}
}


class Test{
	public static void main(String[] args){
		A a = new B();
		a.methodA("methodA");
		a.methodB("methodB");
		a.methodC("methodC");
		a.methodD("methodD");
	}
}
