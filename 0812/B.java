public class B{
	public void test(){
/*
	public A(){}
	protected A(int i){}
	A(double b){}
	private A(String s){}
*/
		//A a1 = new A();
		//A a2 = new A(3);
		//A a3 = new A(2.0);
		//A a4 = new A("abc");

		a1.a();
		a1.b();
		a1.c();
		//a1.d();

		A.sa();
		A.sb();
		A.sc();
		//A.sd();

		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);

		System.out.println(A.sa);
		System.out.println(A.sb);
		System.out.println(A.sc);
		System.out.println(A.sd);
	}
}
