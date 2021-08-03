class LineTest 
{
	public static void main(String[] args) 
	{
		System.out.println("=============line1============");
		Line line1 = new Line();
		line1.draw(new Point(3, 5), new Point(1, 2));

		System.out.println("=============line2============");
		Line line2 = new Line();
		Point p1 = new Point(6, 7);
		Point p2 = new Point(9, 10);
		line2.draw(p1, p2);
	}
}
