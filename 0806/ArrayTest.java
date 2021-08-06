class Book{
	
	String name;

	Book(){}

	Book(String name){
		this.name = name;
	}

	String getName(){
		return this.name;
	}

}

class Person{

	String name;
	Book fBook;
	Book[] Booklist;

	Person(String name, Book fBook){
		this.name = name;
		this.fBook = fBook;
	}

	void read(Book[] array){

		//�迭�� å�̸��� ��� ���, null�� ��� �������
		if (array != null){
			for(Book book : array){
				System.out.println(book.getName() + "��(��) ���� �о��.");
			}
		}		
	}

	String getName(){
		return this.name;
	}

	Book[] getBookArray(Book book){
		//å 2���� ���� �迭�� �����ϼ���.
		Book[] bookArray = {new Book("HTML"), new Book("Spring")};
		return bookArray;
	}

}

class ArrayTest{
	
	public static void main(String[] args){

		Book[] array = null;		
		Book[] bookArray = new Book[3]; // Book[3] �� �迭 ���� 

		bookArray[0] = new Book("HTML");
		bookArray[1] = new Book("Spring");
		bookArray[2] = new Book("Java");

		Person[] personArray = new Person[2]; // Person[2] �� �迭 ����

		personArray[0] = new Person("�̿�", bookArray[1]);
		personArray[1] = new Person("ȫ�浿", bookArray[2]);

		System.out.println(personArray[0].getName());
		personArray[0].read(null);

		System.out.println();

		System.out.println(personArray[1].getName());
		personArray[1].read(array); // null pointer exeption

	}
}