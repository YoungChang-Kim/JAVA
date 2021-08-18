package lab.itank;

import java.util.Scanner;

public class Player {
	
	private int number;
	
	//scanner로 입력 받아 객체 변수에 값을 셋팅한다.
	public void guess() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		number = Integer.parseInt(scanner.nextLine());
		setNumber(number);				
	}
	
	//set,get 메소드
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
