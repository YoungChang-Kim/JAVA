class C{
	static int sum(int num){
		int sum = 0;
		int a = 1;
		int[] sumArray = new int[num];

		for(int i = 0; i < sumArray.length; i++){
			sumArray[i] = a++;
		}

		for (int item : sumArray){
			sum += item;
		}
		return sum;
	}

	public static void main(String[] args){
		System.out.println(sum(10));
	}
}