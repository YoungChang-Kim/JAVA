class Test02{
	public static void main(String[] args){
		Point p1 = new Point();

		Point p2 = new Point(5, 7);

		Line line = new Line();
		line.startPoint = p1;
		line.endPoint = p2;

		System.out.println(line.startPoint.x);
		System.out.println(line.startPoint.y);
		System.out.println(line.endPoint.x);
		System.out.println(line.endPoint.y);
		
	}
}
