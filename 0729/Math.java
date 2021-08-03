class Math{
	
	static int sum(int a, int b){
		// int result = a + b;
		return a+b;
	}

	public static void main(String[] args)
	{
		System.out.println(sum(2, 3));

		int returnValue = sum(2, 3);

		System.out.println(returnValue+10);
	}
}
