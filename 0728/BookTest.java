class BookTest 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		b1.title = "�ڹ�";
		b1.price = 20000;

		Book b2 = new Book();
		b2.title = "������";
		b2.price = 50000;

		Book b3 = new Book();
		b3.title = "�ڹٽ�ũ��Ʈ";
		b3.price = 15000;

		System.out.println("1��å : "+b1.title+", ���� : "+b1.price);
		System.out.println("2��å : "+b2.title+", ���� : "+b2.price);
		System.out.println("3��å : "+b3.title+", ���� : "+b3.price);
	}
}
