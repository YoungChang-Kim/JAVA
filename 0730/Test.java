class Test 
{
	public static void main(String[] args) 
	{
		int a = 10;
		// a++; // ====> a=a+1; // 11
		// ++a; // 12

		int b = a++;
		System.out.println(b); // 10
		System.out.println(a++); // 11

		a = 10;

		b = ++a;		
		System.out.println(b); // 11
		System.out.println(++a); // 12
	}
}
