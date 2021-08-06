class Test01{

	public static void main(String[] args){

		A a1 = new A(1, new B("a", false));
		a1.methodA();

		A a2 = new A(5, new B("a", true));
		a2.methodA();
	}
}