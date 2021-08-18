package lab.itank.packageclass;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("책이름 입력>>");
		String name = scanner.nextLine();
		System.out.println("입력값 확인 : " + name);
		
		System.out.println("책가격 입력 >>");
//		int price = scanner.nextInt();
		int price = Integer.parseInt(scanner.nextLine());
		System.out.println("입력값 확인 : " + price);
		
//		scanner.nextLine();
		
		System.out.println("저자 입력>>");
		String writer = scanner.nextLine();
		System.out.println("입력값 확인 : " + writer);
		
		System.out.println("입력이 완료 되었습니다.");
		System.out.println("책 제목 : "+name+", 가격 : "+price+", 저자 : "+writer);
		
		Book book = new Book(name, price, writer);
		
		//스캐너 닫기
		scanner.close();
	}

}
