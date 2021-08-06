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

		//배열의 책이름을 모두 출력, null일 경우 실행안함
		if (array != null){
			for(Book book : array){
				System.out.println(book.getName() + "을(를) 자주 읽어요.");
			}
		}		
	}

	String getName(){
		return this.name;
	}

	Book[] getBookArray(Book book){
		//책 2권을 가진 배열을 리턴하세요.
		Book[] bookArray = {new Book("HTML"), new Book("Spring")};
		return bookArray;
	}

}

class ArrayTest{
	
	public static void main(String[] args){

		Book[] array = null;		
		Book[] bookArray = new Book[3]; // Book[3] 빈 배열 생성 

		bookArray[0] = new Book("HTML");
		bookArray[1] = new Book("Spring");
		bookArray[2] = new Book("Java");

		Person[] personArray = new Person[2]; // Person[2] 빈 배열 생성

		personArray[0] = new Person("미영", bookArray[1]);
		personArray[1] = new Person("홍길동", bookArray[2]);

		System.out.println(personArray[0].getName());
		personArray[0].read(null);

		System.out.println();

		System.out.println(personArray[1].getName());
		personArray[1].read(array); // null pointer exeption

	}
}