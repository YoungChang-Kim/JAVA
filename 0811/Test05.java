//final �����
//1.Ŭ���� ��
//2.�޼ҵ� ��
//3.���� ��


//1.Ŭ���� �� : ����� �Ұ����� Ŭ������ �ȴ�.(��� �� �� ����.)
final class ClassA{
}

//class ClassB extends ClassA{}

//2. �޼ҵ� �� : �������̵� �� �� ����.
class ClassC{
	final void methodA(){}
}

//
class ClassD extends ClassC{
	//void methodA(){}
}


//3. ���� �� : �ʱⰪ�� ���� �� �� ����.
class ClassE{
	static final double PI = 3.14;

	double getPI(){

		//PI = 3.141492;
		return PI;
	}
}

// class ClassD extends ClassC{void methodA(){}}

//���� �� �鿩�� ����
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
