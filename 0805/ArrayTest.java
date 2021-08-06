class ArrayTest{
	public static void main(String[] args) {
		
		//배열생성 방법 1
		int[] array = new int[3];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;

		//String 값을 넣을 수 있는 배열 크기 3개
		String[] array3 = new String[3];
		array3[0] = "가";
		array3[1] = "나";
		array3[2] = "다";

		char[] charArray = new char[3];
		charArray[0] = 'a';
		charArray[1] = 'b';
		charArray[2] = 'c';

		boolean[] boolArray = new boolean[4];
		boolArray[0] = true;
		boolArray[1] = false;
		boolArray[2] = false;
		boolArray[3] = true;

		String[] strArray = new String[3];
		strArray[1] = "B";
		

		//배열생성 방법 2
		int[] array2 = {10, 20, 30, 40, 50, 60, 70};
		String[] array4 = {"가", "나", "다", "라", "마"};
		char[] charArraySol2 = {'a', 'b', 'c'};
		boolean[] boolArraySol2 = {true, false, false, true};
		String[] strArrSol2 = {"a", "b"};

		System.out.println(array2); //[I@2f92e0f4
		
		System.out.println(array2.length);
		
		//첫번째 for문
		int sum1 = 0;
		for(int i=0; i<array2.length; i++){
			System.out.println(array2[i]);
			sum1 += array2[i];
		}
		System.out.println("sum1 total : "+sum1);
		System.out.println("sum1 average : "+((double)sum1/array2.length));

		//두번째 for문(향상된 for문)(배열, 자료구조)
		int sum2 = 0;
		for(int b : array2){
			sum2 += b;
		}
		System.out.println(sum2);

		for(boolean a : boolArraySol2){
			if(a){
				System.out.println("사실입니다.");
			}
		}

	}
}
