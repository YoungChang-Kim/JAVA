// Ŭ����Ÿ���� ��ü���� *
// Ŭ����Ÿ���� Ŭ��������
// Ŭ����Ÿ���� �Ķ���� * 
// Ŭ����Ÿ���� ��������

class A{
	int i;
	B b;

	A(){}
	A(int i){}
	A(B b){}

	A(int i, B b){
		this.i = i;
		this.b = b;
	}	

	void methodA(int i, B b){
		if(b.b == true){
			System.out.println("����Դϴ�.");
		}else{
			System.out.println("����� �ƴմϴ�.");
		}
	}
	void methodB(){
		//BŬ������ methodB();
		methodA(3, new B("a", false));
	}
}

class B{
	String a;
	boolean b;

	B(){}

	B(String a, boolean b){
		this.a = a;
		this.b = b;
	}

	void methodB(){};
}