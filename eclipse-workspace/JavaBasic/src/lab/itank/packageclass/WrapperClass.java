package lab.itank.packageclass;

/*
 --WrapperClass--
 Byte
 Short
 Integer
 Long
 Float
 Double
 Character
 Boolean 
 */
public class WrapperClass {

	public static void main(String[] args) {
		
		Integer i = new Integer(3);
		
		Integer i2 = 3; // 오토박싱(기본형 --> 클래스형) 
		System.out.println(i2.equals(3));
		
		int i3 = i2; // 오토 언박싱(클래스형 --> 기본형)
		
		int a = Integer.parseInt("123");

	}

}
