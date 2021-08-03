class BookTest 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		b1.title = "자바";
		b1.price = 20000;

		Book b2 = new Book();
		b2.title = "스프링";
		b2.price = 50000;

		Book b3 = new Book();
		b3.title = "자바스크립트";
		b3.price = 15000;

		System.out.println("1번책 : "+b1.title+", 가격 : "+b1.price);
		System.out.println("2번책 : "+b2.title+", 가격 : "+b2.price);
		System.out.println("3번책 : "+b3.title+", 가격 : "+b3.price);
	}
}
