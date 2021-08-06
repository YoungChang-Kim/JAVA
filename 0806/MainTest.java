class Point {
    public int x = 0;
    public int y = 0;

    public Point(int a, int b) {
        x = a;
        y = b;
    }
}

class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

 
    public Rectangle() {
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

    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

   
    public int getArea() {
        return width * height;
    }
}


public class MainTest{
	 
	 public static void main(String[] args){
	  
		Point[] pointArray = new Point[3];
		pointArray[0]= new Point(32,64);
		pointArray[1]= new Point(16,79);
		pointArray[2]= new Point(82,55);
		 
		System.out.println(pointArray[1].x +" "+pointArray[1].y);     
		  
		Rectangle[] recArray = new Rectangle[4];
		  
		Rectangle rectOne = new Rectangle();  
		Rectangle rectTwo = new Rectangle(pointArray[2]);
		Rectangle rectThree = new Rectangle(50, 100);
		Rectangle rectFour = new Rectangle(pointArray[0], 100, 200);
		  
		recArray[0]=rectOne;
		recArray[1]=rectTwo;
		recArray[2]=rectThree;  
		recArray[3]=rectFour; 
	
		System.out.println(recArray[0].origin.x +" "+recArray[0].origin.y);     
		System.out.println(recArray[1].origin.x +" "+recArray[1].origin.y);     
		System.out.println(recArray[2].origin.x +" "+recArray[2].origin.y);     
		System.out.println(recArray[3].origin.x +" "+recArray[3].origin.y);     

	 }
} 


