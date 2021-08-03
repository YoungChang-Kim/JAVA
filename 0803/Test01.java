class Test01{

	public static void main(String[] args){
		//클래스변수 -> static 변수
		//클래스형 변수 -> 클래스 이름
		//case 1)
		
		Person person = new Person("김영창");

		person.favoriteBook = new Book("java");

		System.out.println(person.name);
		System.out.println(person.favoriteBook.name);

		//============================================
		//case 2)

		Book book = new Book("어린왕자");

		Person person2 = new Person("홍길동");
		person2.favoriteBook = book;
		
		System.out.println(person2.name);
		System.out.println(person2.favoriteBook.name);
	}
}