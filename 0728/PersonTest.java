class PersonTest
{
	public static void main(String[] args){
		// Ŭ���� -> ��ü�� ���� �� ����.
		Person p1 = new Person(); // �⺻ ������ ȣ��
		p1.name = "�̽���";
		p1.age = 26;
		p1.gender = '��';
		
		Person p2 = new Person(); // �⺻ ������ ȣ��
		p2.name = "�迵â";
		p2.age = 25;
		p2.gender = '��';
		
		Person p3 = new Person(); // �⺻ ������ ȣ��
		System.out.println(p3.name); //null
		p3.name = "���ٿ�";
		System.out.println(p3.name); // "���ٿ�"

		Person p4 = new	Person("XXX"); // String ������ ȣ��
		Person p5 = new Person(10); // int ������ ȣ��
		Person p6 = new Person("�ڻ���", 25); // String, int ������ ȣ��
		System.out.println("p6.name : "+p6.name+", p6.age : "+p6.age);
		Person p7 = new Person("����ǥ", 25, true); // String, int, boolean ������ ȣ��
		Person p8 = new Person(12.5f, 'c');
	}
}