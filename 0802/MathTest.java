class MathTest 
{
	public static void main(String[] args) 
	{
		Math mt = new Math();
		int sumNum = mt.sum(10);
		System.out.println(sumNum);
		System.out.println(mt.sum(100));
		System.out.println(mt.sum(1000));
		int oddSumNum = mt.oddSum(10);
		System.out.println(oddSumNum);
		System.out.println(mt.oddSum(100));
		System.out.println(mt.oddSum(1000));
	}
}
