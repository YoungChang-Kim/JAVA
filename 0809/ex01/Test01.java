//상속
class Parent{
	String secondName = "홍";
	int amount = 50000000;
	static String firstName = "길동";

	Parent(){
		System.out.println("Parent() 호출");
	}

	Parent(int amount){
		System.out.println("Parent(int amount) 호출");
	}

	int work(int time){
		return time * 100000;
	}

	void save(int money){
		amount += money;
	}

	static void meetFriend(String friendName){
		System.out.println("친구" + friendName + "랑 재밌게 놀았다.");
	}
}

class Child extends Parent{
	// 상속만 받고 아무런 코드가 없어요.
	Child(){
		//super();
		super(20000);
		System.out.println("Child() 호출");
	}

	Child(int amount){
		//super();
		super(10000);
		System.out.println("Child(int amount) 호출");
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
		Child.meetFriend("길영");
		*/
	}
}