//���2ź : ��ó�� ��⸦.. �ٷ��Ǹ�
class Parent{
	String secondName = "ȫ";
	int amount = 500000000;
	int work(int time){return time * 100000;}
	void save(int money){amount += money;}
}

class Child extends Parent{
	int work(int time){return time * 120000;}
	//void save(int money){amount += money;}
	void play(){System.out.println("�ų��� ��ƿ�!!!");}
	void eat(){}
}

class Child2 extends Child{
	//int work(int time){return time * 120000;}
	//void save(int money){amount += money;}
	//void play(){System.out.println("�ų��� ��ƿ�!!!");}
	//void eat(){}
	
	//Child2 cc = new Child2();
}

class Test01{
	public static void main(String[] args){
		Child child1 = new Child();
		System.out.println("Child = " + child1.work(5));

		Parent p1 = new Child(); // ��Ӱ��� �� ���� ����
		System.out.println("Parent -> Child = " + p1.work(5));
		p1.save(100000);
		//Child c = new Parent();//X

		Parent p2 = new Parent();
		System.out.println("Parent = " + p2.work(5));

		Parent p3 = new Parent();
		Child child2 = new Child();

		Parent p4 = new Child();
		p4.work(1);
		//p4.play(); //-> �θ� Ŭ������ play�� ���� ������ 

		Child2 cc = new Child2();

		System.out.println(cc.work(3));
		cc.save(50000);
		cc.play();
		cc.eat();
	}
}