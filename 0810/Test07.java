abstract class Animal{ // ����
	abstract void eat();
	abstract void sleep();
}

abstract class Mammal extends Animal{//������
	abstract void bear();//����ϴ�
}

class Dog extends Mammal{
	void eat(){
		System.out.println("���� �Խ��ϴ�.");
	}

	void sleep(){
		System.out.println("���� ��ϴ�.");
	}

	void bear(){
		System.out.println("�������� ���ҽ��ϴ�.");
	}
}

class Cat extends Mammal{

	void eat(){
		System.out.println("���� �Խ��ϴ�.");
	}

	void sleep(){
		System.out.println("���� ��ϴ�.");
	}

	void bear(){
		System.out.println("�������� ���ҽ��ϴ�.");
	}
}

class Test07{
	public static void main(String[] args){
		//Dog ��ü ���� �޼ҵ� ��� ȣ��
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
