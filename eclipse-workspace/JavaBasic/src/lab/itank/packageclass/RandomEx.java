package lab.itank.packageclass;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// 1.Math.random()
		// 0이상 1미만의 double 타입 난수 만들어 리턴
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		int num0 = (int)3.7;
		System.out.println(num0);
		
		//1~10
		int num = (int)(Math.random()*10) + 1;
		System.out.println(num);
		
		int num1 = (int)(Math.random()*100) + 1;
		System.out.println(num1);
		
		//2.Random class
		Random random = new Random();
		
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(5)+1);	
		System.out.println("==================");
		
		Random random2 = new Random(77777L);
		
		System.out.println(random2.nextInt(100));
		System.out.println(random2.nextInt(10));
		System.out.println(random2.nextInt(5));
		

	}

}
