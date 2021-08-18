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
		
		//Book 객체를 넣는 ArrayList를 선언하세요.
	    //책 3권을 넣으세요.
	    //모든 책으 ㅣ정보(책이름, 가격)를 출력하세요. (for문 2가지 다 사용하세요)
	    //알고리즘의 책의 가격을 1500으로 변경해주세
	    //딥러닝 3500, java 5500 2권을 추가
	    //java 책을 검색해서 출력
	    //구버전 Java 책 삭제
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("Java", 3000));
		bookList.add(new Book("Spring", 5000));
		bookList.add(new Book("알고리즘", 1000));
		
		for (int i = 0; i < bookList.size(); i++) {
			System.out.print(bookList.get(i).getName()+" : "+bookList.get(i).getPrice()+", ");
		}
		System.out.println();
		
		for (Book book : bookList) {
			System.out.print(book.getName()+" : "+book.getPrice()+", ");
		}
		System.out.println();
		
		bookList.add(new Book("딥러닝", 3500));
		bookList.add(new Book("java2", 5500));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("찾으실 책을 입력해주세요");
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

