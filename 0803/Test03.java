class Test03{

	public static void main(String[] args){

		Bird bird = new Bird("�޹���");
		Monkey monkey = new Monkey("���ڿ�����");
		Insect insect = new Insect("�޶ѱ�");

		Zoo z1 = new Zoo(bird, monkey, insect);
		Zoo z2 = new Zoo(new Bird("�޹���2"), new Monkey("������2"), new Insect("�޶ѱ�2"));
		Zoo z3 = new Zoo(bird, new Monkey("������2"), new Insect("�޶ѱ�2"));
		Zoo z4 = new Zoo(monkey);
		Zoo z5 = new Zoo(new Monkey("������3"));
		Zoo z6 = new Zoo(new Insect("�޶ѱ�3"));
		Zoo z7 = new Zoo(insect);
		
		System.out.println(z1.insect.name);
		System.out.println(z6.insect.name);

		System.out.println(z2.bird.name);
		System.out.println(z3.bird.name);

		System.out.println(bird.name);

		bird.name = "����";

		System.out.println(z2.bird.name);
		System.out.println(bird.name);

		bird.name = "��ġ";

		System.out.println(z2.bird.name);
		System.out.println(bird.name);
	}
}