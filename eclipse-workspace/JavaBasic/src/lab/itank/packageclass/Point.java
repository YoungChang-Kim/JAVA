package lab.itank.packageclass;

public class Point {
	int x;
	int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) 
			return true;
		
		if(obj instanceof Point) {
			Point p = (Point)obj;
			
			if((x==p.x) && (y==p.y)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String s01 = new String("자바");
		String s02 = new String("자바");
		
		System.out.println(s01.equals(s02));//true String equals 오버라이딩
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(3, 5);
		
		System.out.println(p01.equals(p02));//false 객체의 주소가 다름
	}
	
	
}
