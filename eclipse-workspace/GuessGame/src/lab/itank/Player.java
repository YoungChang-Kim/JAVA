package lab.itank;

import java.util.Scanner;

public class Player {
	
	private int number;
	
	//scanner�� �Է� �޾� ��ü ������ ���� �����Ѵ�.
	public void guess() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		number = Integer.parseInt(scanner.nextLine());
		setNumber(number);				
	}
	
	//set,get �޼ҵ�
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
