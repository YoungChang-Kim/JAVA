class ClassA{
	void methodA(){
		System.out.println("ClassA의 methodA()");
	}
}

class ClassB extends ClassA{
	void methodA(){
		System.out.println("ClassB의 methodA()");
	}
}

class ClassC extends ClassA{

}

class ClassD extends ClassB{
	void methodA(){
		System.out.println("ClassD의 methodA()");
	}
}

class ClassE extends ClassC{
	void methodA(){
		System.out.println("ClassE의 methodA()");
	}
}

class ClassF extends ClassC{
	void methodA(){
		System.out.println("ClassF의 methodA()");
	}
}

class Polymorphism{
	ClassA classA;

	Polymorphism(ClassA classA){
		this.classA = classA;
	}

	void one(ClassB classB){
		classB.methodA();
	}

	void two(ClassC classC){
		classC.methodA();
	}

	public static void main(String[] args){
		Polymorphism polymorphism1 = new Polymorphism(new ClassA());
		Polymorphism polymorphism2 = new Polymorphism(new ClassB());
		Polymorphism polymorphism3 = new Polymorphism(new ClassC());
		Polymorphism polymorphism4 = new Polymorphism(new ClassD());
		Polymorphism polymorphism5 = new Polymorphism(new ClassE());
		Polymorphism polymorphism6 = new Polymorphism(new ClassF());

		polymorphism1.one(new ClassB());
		polymorphism1.one(new ClassD());

		polymorphism1.two(new ClassC());
		polymorphism1.two(new ClassE());
		polymorphism1.two(new ClassF());
	}
}
