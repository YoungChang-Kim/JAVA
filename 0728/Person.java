class Person 
{
	String name; // �ʼ�������
	int age; // ���õ�����
	char gender;

	//1. �����ڴ� ��ü ���鶧 ����Ѵ�.
	//2. ��ü������ �ʱⰪ ����Ҷ� ���
	//3. ����Ʈ������(�⺻ ������)�� Ŭ���� ���� �����ڰ� �ϳ��� ������� �����Ϸ��� ����Ʈ �����ڸ� �ڵ� �����Ѵ�.
	//   ������ ����Ʈ �����ڿܿ� �����ڸ� ������ ��� ����Ʈ �����ڸ� �����Ϸ��� �ڵ� ���������� �ʴ´�.

	Person(){
		// name = "ȫ�浿";
		// age = 20;
	}

	Person(String name){
		System.out.println("Person(String n)������ ȣ��");
		this.name = name;
	}

	Person(int n){
		System.out.println("Person(int n)������ ȣ��");
		System.out.println(n);
	}

	Person(String name, int age){
		System.out.println("Person(String n, int a)������ ȣ��Ǿ����ϴ�.");
		this.name = name;
		this.age = age;
		System.out.println(this.name +", "+ this.age);
	}

	Person(String n, int a, boolean b){
		System.out.println("Person(String n, int a, boolean b)������ ȣ��Ǿ����ϴ�.");
		System.out.println(n + ", "+a+", " + b);
	}

	Person(float f, char c){
		f = 10.2F;
		System.out.println("Person(float f, char c)������ ȣ��Ǿ����ϴ�.");
		System.out.println(f +", "+ c);
	}
}