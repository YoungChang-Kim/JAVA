interface Animal{

	public abstract void eat();
	public abstract void sleep();

	public default void help(){
		System.out.println("�ڿ� ���°踦 ���������ش�.");
	}
}

interface Pet extends Animal{

	public static void actCharming(){
		System.out.println("�ֱ��� ����");
	}

	public default void help(){
		System.out.println("����� ���� �ܷο��� ���� ���ش�.");
	}
}

class Dog implements Pet{
	//�߻�޼ҵ� ����
	public void eat(){
		System.out.println("���� �Ծ��");
	}

	public void sleep(){
		System.out.println("���� �ڿ�");
	}

	//����Ʈ �޼ҵ� help() ������(�������̵�)
	public void help(){
		System.out.println("�������� �� ģ���� �����Դϴ�.");
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