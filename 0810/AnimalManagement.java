abstract class Animal{
//�߻� �޼ҵ带 ���� �ϸ� �߻�Ŭ������ �����ؾ��Ѵ�.
	abstract void eat();
	void sleep(){}
}

class Dog extends Animal{
// �ڽ� Ŭ�������� �θ� Ŭ�������� ������ �߻� �޼ҵ带 �����ؾ��Ѵ�.
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
