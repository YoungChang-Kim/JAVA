class Person{
	String name = "김영창";
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
		p1.read(new Book("자바")); // 일회성으로 사용하는 객체 생성
		
		Person p2 = new Person("홍길동");
		Book book2 = new Book("spring"); // 여러번 사용하는 객체 생성
		p2.read(book2);

		Person p3 = new Person("아무개");
		p3.read(book2);
	}
}