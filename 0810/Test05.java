//�������̽�
interface A{
	//(v_1.7)
	//���
	//�߻� �޼ҵ�
	//�������̽� ���� ����, �޼ҵ忡 final, abstract, public ���� ����
	//public static final double PI = 3.14;//����� �������� ���� �빮�ڷ� ǥ��
	double PI = 3.14;

	//public abstract void methodA();
	void methodA();

	//(v_1.8) 
	//���� �޼ҵ�
	//����Ʈ �޼ҵ�
}

interface H extends A{}
interface I{}
class X{}


//Ŭ���� -> �������̽� : implements
//Ŭ���� -> Ŭ���� , �������̽� -> �������̽� : extends

class B extends X implements H,I{
	//���� ���ȿ��
	/*
	Test05.java:29: error: '{' expected
	class B extends X,Y{//���� ���ȿ��
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
		//interface �� new �� �� �����.
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
