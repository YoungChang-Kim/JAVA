class Person 
{
	String name; // 필수데이터
	int age; // 선택데이터
	char gender;

	//1. 생성자는 객체 만들때 사용한다.
	//2. 객체변수의 초기값 사용할때 사용
	//3. 디폴트생성자(기본 생성자)는 클래스 내에 생성자가 하나도 없을경우 컴파일러가 디폴트 생성자를 자동 생성한다.
	//   하지만 디폴트 생성자외에 생성자를 생성할 경우 디폴트 생성자를 컴파일러가 자동 생성해주지 않는다.

	Person(){
		// name = "홍길동";
		// age = 20;
	}

	Person(String name){
		System.out.println("Person(String n)생성자 호출");
		this.name = name;
	}

	Person(int n){
		System.out.println("Person(int n)생성자 호출");
		System.out.println(n);
	}

	Person(String name, int age){
		System.out.println("Person(String n, int a)생성자 호출되었습니다.");
		this.name = name;
		this.age = age;
		System.out.println(this.name +", "+ this.age);
	}

	Person(String n, int a, boolean b){
		System.out.println("Person(String n, int a, boolean b)생성자 호출되었습니다.");
		System.out.println(n + ", "+a+", " + b);
	}

	Person(float f, char c){
		f = 10.2F;
		System.out.println("Person(float f, char c)생성자 호출되었습니다.");
		System.out.println(f +", "+ c);
	}
}