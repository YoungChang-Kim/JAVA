class Test06{
	public static void main(String[] args) 
	{
		Zoo zoo = new Zoo("���� �����");

		zoo.rename(new Bird("������"));
		
		Bird bird = new Bird("Ÿ��");
		zoo.rename(bird);
	}
}
