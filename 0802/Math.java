class Math{
	int sum(int toNum){
		int num = 0;
		int sumNum = 0;
		//while �ۼ�
		while(num < toNum){
			sumNum += (++num);
		}
		return sumNum;
	}

	//1~toNum ���� Ȧ���� ���� ���ϴ� �޼ҵ带 �ۼ�
	int oddSum(int toNum){
		int num = 0;
		int sumNum = 0;
		while(num < toNum){
			++num;
			if(num % 2 != 0){
				sumNum += num;
			}
		}
		return sumNum;
	}

	int sumOddNumber(int toNum){
		int result = 0;
		int i = 1;

		while(i <= toNum){
			result = result +i;
			i = i + 2;
		}
		return result;
	}

	int sumOddNumber2(int toNum){
		int result = 0;
		int i = 1;

		do{
			result = result + i;
			i = i + 2;
		}while(i <= toNum);
		return result;
	}
}