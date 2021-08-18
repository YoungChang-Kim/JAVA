package lab.itank.collection;

public class Book {// implements Comparable<Book>{
	private String name;
	private int price;
	
//	public Book() {}	
	
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

//	@Override
//	public int compareTo(Book book) {
////		return this.name.compareTo(book.getName()); // 내림차순
//		return book.getName().compareTo(this.name); // 오름차순
//	}
}
