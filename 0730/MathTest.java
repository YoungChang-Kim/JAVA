class MathTest 
{
	public static void main(String[] args) 
	{
		Math ma = new Math();
		boolean isProper = ma.isProperFraction(2, 2);
		System.out.println(isProper);
		//void prime = ma.isPrime();
		ma.isPrime();
	}
}
