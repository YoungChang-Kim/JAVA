class Point
{
	int x;
	int y;
	
	Point(){
		this(10, 10);
	}

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	void mark(){
		System.out.println("mark");
	};
}