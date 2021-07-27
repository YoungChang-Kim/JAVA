class Var2{
	
	int a;			//객체 변수	default = 0
	static int b;	//클래스 변수 default = 0
	double d;		// default = 0.0
	boolean bool;	// default = false(0)
	char c;			// default = '';
	String str;		// default = null;

	Var2(String s01){ //파라미터 또는 매개변수
		int c = 3; //지역변수 또는 로컬변수 선언할당
		// int c;
		
		s01 = "생성자 안 사용가능";

		System.out.println(c);
		System.out.println(a); //객체 변수 오류 x
		System.out.println(b); //클래스 변수 오류 x

		a = 0;
		b = 2;
		s01 = "";
	};

	byte z;

	void method01(String s02, boolean yn){
		// c = 5;
		int d;
		a = 5;
		b = 20;
	};

	static void mothod02(){
		System.out.println(a); // static 메소드내에서 non-static(객체 변수) 변수는 오류
		System.out.println(b); // static 메소드내에서 static(클래스 변수) 변수는 오류 x
	}

	static short sht;

	public static void main(String[] args){
		System.out.println(b);
	}
}
