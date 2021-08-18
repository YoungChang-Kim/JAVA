package lab.itank;

import java.util.Random;

public class RandomManager {
	
	//1~10까지의 랜덤 숫자를 만들어 리턴한다.
	public static int getRandomNumber() {
		int rand;
		Random random = new Random();
		rand = random.nextInt(10);
		
		return rand;
	}
}
