class Var 
{
	// 변수타입 변수이름
	// int, String
	// 정수형 변수 : byte, short, int, long
	byte a = 3;		// -128 ~ 127
	short b = 10;	//-32768 ~ 32767
	int c = 50;		// -2145683648 ~ 2145683648 (약 21억)
	long d = 2147483648L;	// -922337036854775808 ~ 922337036854775807

	// 실수형 변수 타입 : float, double
	float e = 10.5F;
	double f = 100.7;

	int g = 0;
	double h = -0.0;

	boolean yn = false;

	//문자형 변수 : 한글자
	//char i1 = '';
	char i2 = ' ';
	char i3 = 'A';
	char i4 = 65;
	//정수, 실수, 문자형 변수는 기본형이다.

	// String(문자열) 변수는 클래스형이다.
	String s1 = "";
	String s2 = " ";
	String s3 = "A";

	public static void main(String[] args){
	}
}