class Point
{
	int x;
	int y;
	
	Point(){ //1�� ������
		this("1", 1); //3�� ������ ȣ��
		System.out.println("Point() �Դϴ�.");
	}

	Point(int x, int y){ //2�� ������
		this.x = x;
		this.y = y;
	}

	Point(String s, int i){ //3�� ������
		System.out.println("Point() �Դϴ�.");
	}
}