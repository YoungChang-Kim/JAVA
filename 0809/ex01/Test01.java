//���
class Parent{
	String secondName = "ȫ";
	int amount = 50000000;
	static String firstName = "�浿";

	Parent(){
		System.out.println("Parent() ȣ��");
	}

	Parent(int amount){
		System.out.println("Parent(int amount) ȣ��");
	}

	int work(int time){
		return time * 100000;
	}

	void save(int money){
		amount += money;
	}

	static void meetFriend(String friendName){
		System.out.println("ģ��" + friendName + "�� ��հ� ��Ҵ�.");
	}
}

class Child extends Parent{
	// ��Ӹ� �ް� �ƹ��� �ڵ尡 �����.
	Child(){
		//super();
		super(20000);
		System.out.println("Child() ȣ��");
	}

	Child(int amount){
		//super();
		super(10000);
		System.out.println("Child(int amount) ȣ��");
	}
}

class Test01{
	public static void main(String[] args){
		Child ch1 = new Child();
		Child ch2 = new Child(500000);
		/*
		System.out.println(ch1.secondName);
		System.out.println(ch1.amount);
		ch1.work(8);
		ch1.save(50000);

		System.out.println(Child.firstName);
		Child.meetFriend("�濵");
		*/
	}
}