import java.util.UUID;

public class Book{
	String name;
	static int number;
	static String publisherId;

	Book(String name){
		this.name = name;
		number++;
	}
	
	// static �� : static ���� �ʱ�ȭ �۾��� ���������ؿ�.
	// Ŭ������ �ε��ɶ� �ڵ����� ����ǿ�.
	static {
		publisherId = "���� ���ǻ�" + UUID.randomUUID();
	}

	public static void main(String[] args){
		System.out.println(Book.number);
	}
	
}

public class Bookbuyer
{
	
}