class Test06{
	public static void main(String[] args) 
	{
		Zoo zoo = new Zoo("서울 대공원");

		zoo.rename(new Bird("독수리"));
		
		Bird bird = new Bird("타조");
		zoo.rename(bird);
	}
}
