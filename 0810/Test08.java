interface Animal{

	public abstract void eat();
	public abstract void sleep();

	public default void help(){
		System.out.println("자연 생태계를 유지시켜준다.");
	}
}

interface Pet extends Animal{

	public static void actCharming(){
		System.out.println("애교를 떨다");
	}

	public default void help(){
		System.out.println("사람의 고독과 외로움을 덜게 해준다.");
	}
}

class Dog implements Pet{
	//추상메소드 구현
	public void eat(){
		System.out.println("밥을 먹어요");
	}

	public void sleep(){
		System.out.println("잠을 자요");
	}

	//디폴트 메소드 help() 재정의(오버라이딩)
	public void help(){
		System.out.println("강아지는 참 친근한 동물입니다.");
	}
}

class Test08{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.help();
		

	}
}