class Math{
	
	int x, y;

	Math(int x, int y){
		this.x = x;
		this.y = y;
	}

	// ��ü�� ������ ���� �ʴ� �޼ҵ�� static �޼ҵ�(Ŭ���� �޼ҵ�)�� ����
	static int sum(int a, int b){
		// return (a + b) + (x + y);
		return (a + b);
	}
}

class MathTest{
	public static void main(String[] args){
		Math m01 = new Math(3, 2);
		System.out.println(m01.sum(10, 20));

		Math m02 = new Math(3, 2);
		System.out.println(m02.sum(10, 20));

		System.out.println(Math.sum(10, 20));
	}
}
