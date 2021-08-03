class RectangleTest
{
	public static void main(String[] args){

		Rectangle myRect = new Rectangle();

		myRect.width = 40;
		myRect.height = 30;

		System.out.println("너비 : "+ myRect.width + ", 높이 : "+myRect.height+", 넓이 : " + myRect.area(myRect.width, myRect.height));
	}
}