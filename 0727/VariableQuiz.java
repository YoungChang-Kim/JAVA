class  VariableQuiz
{
	String a;
	static String b;

	VariableQuiz(double c){
		char d;
		System.out.println(a); // ��ü ������ ����Ʈ�� null�� ��µ�
		System.out.println(b); // Ŭ���� ������ ����Ʈ�� null�� ��µ�
		System.out.println(c); // �Ķ���ͷ� ����Ʈ ���� 0.0�� ��µ�
		System.out.println(d); // ���������� ���Ҵ��� �ȵ� ������ ����ϸ� ����
		System.out.println(e); // ���������� Ŭ������ ������� ���� ������ ��� �Ͽ� ����
		System.out.println(f); // �ٸ� ���������� ���� ����Ͽ� ����
		System.out.println(g); // 28�� ���ο� ����� Ŭ���� ������ ȣ���� ����Ʈ ���� 0�� ���
	}

	void writeVariable(int e){
		boolean f = true;
		System.out.println(a); // ��ü ������ ����Ʈ�� null�� ��µ�
		System.out.println(b); // Ŭ���� ������ ����Ʈ�� null�� ��µ�
		System.out.println(c); // �����̳� Ŭ�������� �ش� ������ ����Ȱ��� ���� ��µ��� ����
		System.out.println(d); // �����̳� Ŭ�������� �ش� ������ ����Ȱ��� ���� ��µ��� ����
		System.out.println(e); // �Ķ���Ϳ� ����� e�� ����Ʈ ���� 0�� ��µ�
		System.out.println(f); // �������� f�� �Ҵ�� true�� ��µ�
		System.out.println(g); // 28�� ���ο� ����� Ŭ���� ������ ȣ���� ����Ʈ ���� 0�� ���
	}

	byte g;
	System.out.println(g); // Ŭ���������� ����, ������, �޼ҵ� �ܿ��� ������ �Ұ��� ����
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
