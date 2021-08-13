abstract class Animal{ // 동물
	abstract void eat();
	abstract void sleep();
}

abstract class Mammal extends Animal{//포유류
	abstract void bear();//출산하다
}

class Dog extends Mammal{
	void eat(){
		System.out.println("밥을 먹습니다.");
	}

	void sleep(){
		System.out.println("잠을 잡니다.");
	}

	void bear(){
		System.out.println("강아지를 낳았습니다.");
	}
}

class Cat extends Mammal{

	void eat(){
		System.out.println("밥을 먹습니다.");
	}

	void sleep(){
		System.out.println("잠을 잡니다.");
	}

	void bear(){
		System.out.println("강아지를 낳았습니다.");
	}
}

class Test07{
	public static void main(String[] args){
		//Dog 객체 만들어서 메소드 모두 호출
		Dog dog01 = new Dog();

		dog01.eat();
		dog01.sleep();
		dog01.bear();

		Mammal m = new Cat();
		m.eat();
		m.sleep();
		m.bear();

		Animal a = new Dog();
		a.eat();
		a.sleep();
		//a.bear();

	}
}
