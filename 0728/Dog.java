class Dog 
{
	String name;
	int age;
	// 0. 생성자에 파라미터가 없는것(기본생성자)
	Dog(){}
	// 1. 타입 다르게
	Dog(String s1){}
	Dog(int i1){}
	Dog(boolean b1){}
	// 2. 순서 다르게
	Dog(String s1, int i1, boolean b1){}
	Dog(int i1, boolean b1, String s1){}
	Dog(boolean b1, String s1, int i1){}
	// 3. 개수 다르게
	Dog(String s1, int i1){}
	Dog(String s1, int i1, boolean b1, byte by1){}
	Dog(String s1, int i1, boolean b1, byte by1, char c1){}
}
