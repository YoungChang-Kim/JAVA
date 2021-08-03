class Point
{
	int x;
	int y;
	
	Point(){ //1번 생성자
		this("1", 1); //3번 생성자 호출
		System.out.println("Point() 입니다.");
	}

	Point(int x, int y){ //2번 생성자
		this.x = x;
		this.y = y;
	}

	Point(String s, int i){ //3번 생성자
		System.out.println("Point() 입니다.");
	}
}