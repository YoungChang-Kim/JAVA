package x.y.z;

import a.b.c.A;

public class Y extends A{

	public Y(){
		super(3);
	}

	public void test(){
/*
	public A(){}
	protected A(int i){}
	A(double b){}
	private A(String s){}
*/

		A a1 = new A();
		//A a2 = new A(3);
		//A a3 = new A(2.0);
		//A a4 = new A("abc");

		a();
		b();
		//c();//package private
		//d();


		A.sa();
		A.sb();
		//A.sc();
		//A.sd();


		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);

		System.out.println(A.sa);
		System.out.println(A.sb);
		//System.out.println(A.sc);
		//System.out.println(A.sd);

	}
}
