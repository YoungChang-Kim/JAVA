class A{

	String s;
	int i;

	void methodA(B b){
		System.out.println("methodA(B b)");
		System.out.println(b.d);
		b.d = 5.5;
		System.out.println(b.d);
		b.methodB();
	}

	void methodA2(){
		System.out.println("�׽�Ʈ�� �޼ҵ��Դϴ�");
	}
}

class B{

	double d;

	void methodB(){}

	A methodB2(String s, int i){
		A a = new A();
		a.s = s;
		a.i = i;

		return a;
	}
}

class Main{
	public static void main(String[] args){
		A a = new A();
		a.methodA(new B());

		B b = new B();
		A a2 = b.methodB2("���� �� ����~~", 5);

		System.out.println(a2); // A@1f32e575
		System.out.println(b.methodB2("", 1)); // A@279f2327 //��ü�� ���� �����ϴ� �޼ҵ带 ȣ���ؼ� �ٸ� �ּڰ�

		System.out.println(a2.s);
		System.out.println(a2.i);

		a2.methodA2();
		b.d = 7.7;
		a2.methodA(b);
	}
}