package lab.itank;

import java.util.Random;

public class RandomManager {
	
	//1~10������ ���� ���ڸ� ����� �����Ѵ�.
	public static int getRandomNumber() {
		int rand;
		Random random = new Random();
		rand = random.nextInt(10);
		
		return rand;
	}
}
