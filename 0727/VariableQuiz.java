class  VariableQuiz
{
	String a;
	static String b;

	VariableQuiz(double c){
		char d;
		// System.out.println(a); // ��ü ������ ����Ʈ�� null�� ��µ�
		// System.out.println(b); // Ŭ���� ������ ����Ʈ�� null�� ��µ�
		// System.out.println(c); // �����ڰ� ȣ��� �� �Ķ���Ϳ� �Ҵ�� ���� ���
		// System.out.println(d); // ���������� ���Ҵ��� �ȵ� ������ ����ϸ� ����Ʈ ���� ���⿡ ����
		// System.out.println(e); // ���������� Ŭ������ ������� ���� ������ ��� �Ͽ� ����
		// System.out.println(f); // �ٸ� ���������� ���� ����Ͽ� ����
		// System.out.println(g); // 28�� ���ο� ����� ��ü ������ ȣ���� ����Ʈ ���� 0�� ���
	}

	void writeVariable(int e){
		boolean f = true;
		// System.out.println(a); // ��ü ������ ����Ʈ�� null�� ��µ�
		System.out.println(b); // Ŭ���� ������ ȣ�� Ŭ���� ������ �޼ҵ尡 static | non-static���� ������� ȣ�� �����ϴ�.
		// System.out.println(c); // �����̳� Ŭ�������� �ش� ������ ����Ȱ��� ���� ��µ��� ���� ����
		// System.out.println(d); // �����̳� Ŭ�������� �ش� ������ ����Ȱ��� ���� ��µ��� ���� ����
		System.out.println(e); // �޼��尡 ȣ��� �� �Ķ���Ϳ� �Ҵ�� ���� ���
		// System.out.println(f); // �������� f�� �Ҵ�� true�� ��µ�
		// System.out.println(g); // 28�� ���ο� ����� ��ü ������ ȣ���� ����Ʈ ���� 0�� ���
	}

	byte g;
	// System.out.println(g); // Ŭ���������� ����, ������, �޼ҵ� �ܿ��� ������ �Ұ��� ����
	public static void main(String[] args) 
	{
		VariableQuiz vq = new VariableQuiz(1.2);
		vq.writeVariable(1);
		System.out.println("Hello World!");
	}
}
