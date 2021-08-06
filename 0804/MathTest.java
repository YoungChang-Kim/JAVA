class Math{
	
	int x, y;

	Math(int x, int y){
		this.x = x;
		this.y = y;
	}

	// 객체에 영향을 받지 않는 메소드는 static 메소드(클래스 메소드)로 생성
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
