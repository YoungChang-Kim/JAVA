class ArrayTest{
	public static void main(String[] args) {
		
		//�迭���� ��� 1
		int[] array = new int[3];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;

		//String ���� ���� �� �ִ� �迭 ũ�� 3��
		String[] array3 = new String[3];
		array3[0] = "��";
		array3[1] = "��";
		array3[2] = "��";

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
		

		//�迭���� ��� 2
		int[] array2 = {10, 20, 30, 40, 50, 60, 70};
		String[] array4 = {"��", "��", "��", "��", "��"};
		char[] charArraySol2 = {'a', 'b', 'c'};
		boolean[] boolArraySol2 = {true, false, false, true};
		String[] strArrSol2 = {"a", "b"};

		System.out.println(array2); //[I@2f92e0f4
		
		System.out.println(array2.length);
		
		//ù��° for��
		int sum1 = 0;
		for(int i=0; i<array2.length; i++){
			System.out.println(array2[i]);
			sum1 += array2[i];
		}
		System.out.println("sum1 total : "+sum1);
		System.out.println("sum1 average : "+((double)sum1/array2.length));

		//�ι�° for��(���� for��)(�迭, �ڷᱸ��)
		int sum2 = 0;
		for(int b : array2){
			sum2 += b;
		}
		System.out.println(sum2);

		for(boolean a : boolArraySol2){
			if(a){
				System.out.println("����Դϴ�.");
			}
		}

	}
}
