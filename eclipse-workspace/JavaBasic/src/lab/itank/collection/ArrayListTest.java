package lab.itank.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
			ArrayList<String> list = new ArrayList<String>();
			list.add("A");
			list.add("B");
			list.add("C");
			
			for (int i = 0; i < list.size(); i++) { // i == index
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			
			list.set(1, "BB");
			
			for (String string : list) {
				System.out.print(string+" ");
			}
			System.out.println();
			
			list.remove(1);
			
			for (String string : list) {
				System.out.print(string+" ");
			}
			System.out.println();
		*/
		
		//Book ��ü�� �ִ� ArrayList�� �����ϼ���.
	    //å 3���� ��������.
	    //��� å�� ������(å�̸�, ����)�� ����ϼ���. (for�� 2���� �� ����ϼ���)
	    //�˰����� å�� ������ 1500���� �������ּ�
	    //������ 3500, java 5500 2���� �߰�
	    //java å�� �˻��ؼ� ���
	    //������ Java å ����
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("Java", 3000));
		bookList.add(new Book("Spring", 5000));
		bookList.add(new Book("�˰���", 1000));
		
		for (int i = 0; i < bookList.size(); i++) {
			System.out.print(bookList.get(i).getName()+" : "+bookList.get(i).getPrice()+", ");
		}
		System.out.println();
		
		for (Book book : bookList) {
			System.out.print(book.getName()+" : "+book.getPrice()+", ");
		}
		System.out.println();
		
		bookList.add(new Book("������", 3500));
		bookList.add(new Book("java2", 5500));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ã���� å�� �Է����ּ���");
		String search = scanner.nextLine();
		scanner.close();
		
		for (Book book : bookList) {
			if (book.getName().toLowerCase().contains(search)) {
				System.out.print(book.getName()+" : "+book.getPrice()+", ");
			}
		}
		System.out.println();
		
		for (int i = 0; i < bookList.size(); i++) {
			if ("Java".equals(bookList.get(i).getName())) {
				bookList.remove(i);
			}
			System.out.println("remove : "+i);
		}
				
		for (Book book : bookList) {
			System.out.print(book.getName()+" : "+book.getPrice()+", ");
		}
		System.out.println();
		
		
		
	}
	
}

