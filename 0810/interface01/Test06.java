interface C{
	//1.�߻� �޼ҵ�
	public void abstractMethod();

	//2.���
	public final int one = 1;

	//3.����Ʈ �޼ҵ�
	public default void defaultMethod(){
		System.out.println("����Ʈ �޼ҵ� ȣ��");
	}

	//4.���� �޼ҵ�
	public static void staticMethod(){
		System.out.println("���� �޼ҵ� ȣ��");
	}

}


class CC implements C{
	//1.�߻� �޼ҵ� ����
	public void abstractMethod(){
		System.out.println("CC Ŭ������ �߻� �޼ҵ� ����");
	}

	//2. ����Ʈ �޼ҵ� �������̵�
	public void defaultMethod(){
		System.out.println("CC Ŭ������ ����Ʈ �żҵ� �������̵�");
	}
	//3. ���� �޼ҵ� �������̵�

	public static void staticMethod(){
		System.out.println("CC Ŭ������ ���� �޼ҵ� �������̵�");
	}
}

interface DD extends C{
	
}

class F implements DD{
	//1.�߻� �޼ҵ� ����
	public void abstractMethod(){
		System.out.println("F Ŭ������ �߻� �޼ҵ� ����");
	}

	//2. ����Ʈ �޼ҵ� �������̵�

	//3. ���� �޼ҵ� �������̵�

	public static void staticMethod(){
		System.out.println("F Ŭ������ ���� �޼ҵ� �������̵�");
	}
}

class Test06{
	public static void main(String[] args){
		//1.��ü ����
		CC c = new CC();
		F f = new F();
		
		//�߻�޼��� ȣ��
		c.abstractMethod();
		//CCŬ������ ���� �޼ҵ� ȣ��
		CC.staticMethod();

		//
	}
}

