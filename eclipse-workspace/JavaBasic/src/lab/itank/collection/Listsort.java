package lab.itank.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listsort {
	
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<String>();
		
		stringList.add("B");
		stringList.add("��");
		stringList.add("D");
		stringList.add("b");
		stringList.add("��");
		
		Collections.sort(stringList);
		
		for (String string : stringList) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(5);
		integerList.add(3);
		integerList.add(7);
		integerList.add(2);
		
		Collections.sort(integerList);
		
		for (Integer integer : integerList) {
			System.out.print(integer+" ");
		}
		System.out.println();
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("Java", 3000));
		bookList.add(new Book("Spring", 5000));
		bookList.add(new Book("�˰���", 1000));
		bookList.add(new Book("������", 3500));
		bookList.add(new Book("java2", 5500));
		
		
//		public static <Book extends Comparable<Book>> void sort(List<Book> list)
		
//		Collections.sort(bookList);
//		for (Book book : bookList) {
//			System.out.println("å�̸��� ���� : "+"å �̸� : "+book.getName() + " " + "-å���� : "+ book.getPrice());
//		}
		
//		public static <T> void sort(List<T> list, Comparator<? super T> c) 
		
		Collections.sort(bookList, new PriceComparator());
		for (Book book : bookList) {
			System.out.println("���� �� ���� : "+"å �̸� : "+book.getName() + " " + "-å���� : "+ book.getPrice());
		}
		
		Collections.sort(bookList, new BookNameComparator());
		for (Book book : bookList) {
			System.out.println("å �̸� �� ���� : "+"å �̸� : "+book.getName() + " " + "-å���� : "+ book.getPrice());
		}
	}
}
