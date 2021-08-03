class  VariableQuiz
{
	String a;
	static String b;

	VariableQuiz(double c){
		char d;
		// System.out.println(a); // 객체 변수로 디폴트인 null이 출력됨
		// System.out.println(b); // 클래스 변수로 디폴트인 null이 출력됨
		// System.out.println(c); // 생성자가 호출될 때 파라미터에 할당된 값을 출력
		// System.out.println(d); // 지역변수에 값할당이 안된 변수를 출력하면 디폴트 값이 없기에 에러
		// System.out.println(e); // 지역변수나 클래스에 선언되지 않은 변수를 출력 하여 에러
		// System.out.println(f); // 다른 지역변수인 값을 출력하여 에러
		// System.out.println(g); // 28번 라인에 선언된 객체 변수를 호출함 디폴트 값인 0이 출력
	}

	void writeVariable(int e){
		boolean f = true;
		// System.out.println(a); // 객체 변수로 디폴트인 null이 출력됨
		System.out.println(b); // 클래스 변수를 호출 클래스 변수는 메소드가 static | non-static인지 상관없이 호출 가능하다.
		// System.out.println(c); // 지역이나 클래스내에 해당 변수가 선언된것이 없어 출력되지 않음 에러
		// System.out.println(d); // 지역이나 클래스내에 해당 변수가 선언된것이 없어 출력되지 않음 에러
		System.out.println(e); // 메서드가 호출될 때 파라미터에 할당된 값을 출력
		// System.out.println(f); // 지역변수 f에 할당된 true가 출력됨
		// System.out.println(g); // 28번 라인에 선언된 객체 변수를 호출함 디폴트 값인 0이 출력
	}

	byte g;
	// System.out.println(g); // 클래스내에는 변수, 생성자, 메소드 외에는 선언이 불가함 에러
	public static void main(String[] args) 
	{
		VariableQuiz vq = new VariableQuiz(1.2);
		vq.writeVariable(1);
		System.out.println("Hello World!");
	}
}
