//기본형 형변환
class Test01{
	public static void main(String[] args) {
		//자동 형 변환
		int a = 100;
		double b = a;

		System.out.println(b);

		//강제 형변환
		short a1 = 100;
		byte b1 = (byte)a1;
		System.out.println(b1);

		//강제형변환시 주의점
		short a2 = 200;
		byte b2 = (byte)a2;
		System.out.println(b2);//-56

		//안전하게 강제 형변환하기		
		short shortValue = 100;
		//Byte.MIN_VALUE : -128
		if((shortValue >= Byte.MIN_VALUE)&&(shortValue <= Byte.MAX_VALUE)){
			byte byteValue = (byte)shortValue;
		}

		int intValue = 200;
		if((intValue >= Short.MIN_VALUE)&&(intValue <= Short.MAX_VALUE)){
			short intValue = (short)intValue;
		}

		char ch = 65;
		byte by = (byte)ch;
		System.out.println(by);
	}
}
