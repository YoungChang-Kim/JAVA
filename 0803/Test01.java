class Test01{

	public static void main(String[] args){
		//Ŭ�������� -> static ����
		//Ŭ������ ���� -> Ŭ���� �̸�
		//case 1)
		
		Person person = new Person("�迵â");

		person.favoriteBook = new Book("java");

		System.out.println(person.name);
		System.out.println(person.favoriteBook.name);

		//============================================
		//case 2)

		Book book = new Book("�����");

		Person person2 = new Person("ȫ�浿");
		person2.favoriteBook = book;
		
		System.out.println(person2.name);
		System.out.println(person2.favoriteBook.name);
	}
}