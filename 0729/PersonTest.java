class PersonTest{
	
	int age;
	
	void test(){
		Person p = new Person("test");
		p.play();
	}

	public static void main(String[] args){
		// Person p1 = new Person("�迵â");
		// p1.eat("������ġ");
		// p1.play();
		// p1.study("��ó��");
		// p1.sleep(1);

		// p1.plan();

		PersonTest pt = new PersonTest();
		pt.age=100;
		pt.test();
		// test();
	}
}