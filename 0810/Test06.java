interface C{
	//����� �߻�޼ҵ�

	//�����޼ҵ�
	static void method01(){
		System.out.println("�����޼ҵ�� �������̽� �̸����� ȣ�� �����մϴ�.");
	}

	//����Ʈ �޼ҵ�
	public default void method02(){
		System.out.println("C �������̽��� default �޼ҵ� ȣ��");
	}
	
	//�߻� �޼ҵ�
	void method03();
}

interface DD extends C{
	public default void method02(){
		System.out.println("DD �������̽��� default �޼ҵ� ȣ��");
	};
}

class F implements DD{
	public void method02(){
		System.out.println("FŬ������ method02");
	}

	public void method03(){
		System.out.println("FŬ������ method03");
	}

}

class Test06{
	public static void main(String[] args){
		C.method01(); // o
		//C.method02(); // x

		CC cc = new CC();
		cc.method02();//����Ʈ �޼ҵ� : implements �ؼ� ���� ���� �ٷ� ��� ����
		cc.method03();//�߻� �޼ҵ� : implements �ؼ� �����ؾ� ��밡��
		
		F f = new F();
		f.method03();
	}
}

class CC implements C{
	public void method03(){
		System.out.println("�������̽��� method03 ȣ��");
	}
	//����Ʈ �޼ҵ�� ������ ����.
	public void method02(){
		System.out.println("�������̽��� default �޼ҵ� ȣ��");
	}
}
