class RectangleTest
{
	public static void main(String[] args){

		Rectangle myRect = new Rectangle();

		myRect.width = 40;
		myRect.height = 30;

		System.out.println("�ʺ� : "+ myRect.width + ", ���� : "+myRect.height+", ���� : " + myRect.area(myRect.width, myRect.height));
	}
}