class Point {
	int x = 0;
    int y = 0;

	Point(int a, int b) {
        x = a;
        y = b;
    }
}

class Rectangle {
    int width = 0;
    int height = 0;
    Point origin;

	Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;

        width = w;
        height = h;
    }
}


class Test05 {

	public static void main(String[] args) {

		Point originOne = new Point(23, 94);

		System.out.println(originOne.x);//1��
		System.out.println(originOne.y);//2��

		Rectangle rectOne = new Rectangle(originOne, 100, 200);

		System.out.println(rectOne.width);//3��
		System.out.println(rectOne.height);//4��
		System.out.println(rectOne.origin.x);//5��
		System.out.println(rectOne.origin.y);//6��		

		Rectangle rectTwo = new Rectangle(50, 100);

		System.out.println(rectTwo.width);//7��
		System.out.println(rectTwo.height);//8��
		System.out.println(rectTwo.origin.x);//9��
		System.out.println(rectTwo.origin.y);//10��		

		Rectangle rect3 = new Rectangle();

		Rectangle rect4 = new Rectangle(new Point(10, 20));

	}
}
