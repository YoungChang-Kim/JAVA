class Person{
	String name = "�迵â";
	Book favoriteBook;
	
	Person(){}

	Person(String name){
		this.name = name;
	}

	void read(Book book){
		System.out.println(book.name);
	}

	public static void main(String[] args){
		
		Person p1 = new Person();
		p1.read(new Book("�ڹ�")); // ��ȸ������ ����ϴ� ��ü ����
		
		Person p2 = new Person("ȫ�浿");
		Book book2 = new Book("spring"); // ������ ����ϴ� ��ü ����
		p2.read(book2);

		Person p3 = new Person("�ƹ���");
		p3.read(book2);
	}
}