abstract class Animal{
//추상 메소드를 선언 하면 추상클래스를 생성해야한다.
	abstract void eat();
	void sleep(){}
}

class Dog extends Animal{
// 자식 클래스에서 부모 클래스에서 생성한 추상 메소드를 구현해야한다.
	void eat(){}
	void sleep(){}

}

class AnimalManagement{
	void eat(){
		
	}
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
