class A{
	void methodA(String s){System.out.println("A Ŭ������ methodA()");}
	void methodB(String s){System.out.println("A Ŭ������ methodB()");}
	static void methodC(String s){System.out.println("A Ŭ������ methodC()");}
	static void methodD(String s){System.out.println("A Ŭ������ methodD()");}
}

class B extends A{
	//static void methodA(String s){} // ����
	void methodB(String s){System.out.println("B Ŭ������ methodB()");} 
	//void methodC(String s){} // ����
	static void methodD(String s){System.out.println("B Ŭ������ methodD()");}
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
