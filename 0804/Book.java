import java.util.UUID;

public class Book{
	String name;
	static int number;
	static String publisherId;

	Book(String name){
		this.name = name;
		number++;
	}
	
	// static 블럭 : static 변수 초기화 작업을 목적으로해요.
	// 클래스가 로딩될때 자동으로 실행되요.
	static {
		publisherId = "구디 출판사" + UUID.randomUUID();
	}

	public static void main(String[] args){
		System.out.println(Book.number);
	}
	
}

public class Bookbuyer
{
	
}