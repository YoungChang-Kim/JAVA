class Test03{

	public static void main(String[] args){

		Bird bird = new Bird("¾Ş¹«»õ");
		Monkey monkey = new Monkey("°³ÄÚ¿ø¼şÀÌ");
		Insect insect = new Insect("¸Ş¶Ñ±â");

		Zoo z1 = new Zoo(bird, monkey, insect);
		Zoo z2 = new Zoo(new Bird("¾Ş¹«»õ2"), new Monkey("¿ø¼şÀÌ2"), new Insect("¸Ş¶Ñ±â2"));
		Zoo z3 = new Zoo(bird, new Monkey("¿ø¼şÀÌ2"), new Insect("¸Ş¶Ñ±â2"));
		Zoo z4 = new Zoo(monkey);
		Zoo z5 = new Zoo(new Monkey("¿ø¼şÀÌ3"));
		Zoo z6 = new Zoo(new Insect("¸Ş¶Ñ±â3"));
		Zoo z7 = new Zoo(insect);
		
		System.out.println(z1.insect.name);
		System.out.println(z6.insect.name);

		System.out.println(z2.bird.name);
		System.out.println(z3.bird.name);

		System.out.println(bird.name);

		bird.name = "Âü»õ";

		System.out.println(z2.bird.name);
		System.out.println(bird.name);

		bird.name = "±îÄ¡";

		System.out.println(z2.bird.name);
		System.out.println(bird.name);
	}
}