class ForEx{
	public static void main(String[] args){
		int result = 0;
		int toNum = 100;

		for(int i = 1; i <= toNum; i++){
			if((i % 10) == 0) {
				continue;
			}

			result += i;
		}
		System.out.println(result);
	}
}