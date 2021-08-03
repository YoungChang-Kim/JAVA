class PersonTest{
	
	int age;
	
	void test(){
		Person p = new Person("test");
		p.play();
	}

	public static void main(String[] args){
		// Person p1 = new Person("±è¿µÃ¢");
		// p1.eat("»÷µåÀ§Ä¡");
		// p1.play();
		// p1.study("Á¤Ã³±â");
		// p1.sleep(1);

		// p1.plan();

		PersonTest pt = new PersonTest();
		pt.age=100;
		pt.test();
		// test();
	}
}