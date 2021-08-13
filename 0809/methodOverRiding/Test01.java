class ClassA{

	void methodA(){}
	void methodB(){}
	void methodC(){}
	void methodD(){}

}

class ClassB extends ClassA{

	void methodA(){}
	void methodB(){}
	void methodC(){}
	void methodD(){}

}

class ClassC extends ClassA{

	void methodA(){}
	void methodB(){}
	void methodC(){}
	
}

class ClassD extends ClassB{

	void methodA(){}
	void methodB(){}
	void methodC(){}
	void methodD(){}

}

class ClassE extends ClassC{

	void methodA(){}
	void methodB(){}
	void methodE(){}

}

class ClassF extends ClassC{

	void methodA(){}
	void methodF(){}

}

class ClassG extends ClassF{

	void methodG(){}

}

class Test01{
	public static void main(String[] args){

		ClassA classA = new ClassD();
		classA.methodA();//ClassD 소속 메서드가 실행됨
		classA.methodB();//ClassD 소속 메서드가 실행됨
		classA.methodC();//ClassD 소속 메서드가 실행됨
		classA.methodD();//ClassD 소속 메서드가 실행됨

		ClassC classC = new ClassF();
		classC.methodA();//ClassF 소속 메서드가 실행됨
		classC.methodB();//ClassC 소속 메서드가 실행됨
		classC.methodC();//ClassC 소속 메서드가 실행됨
		classC.methodD();//ClassA 소속 메서드가 실행됨

		ClassF classF = new ClassG();
		classF.methodA();//ClassF 소속 메서드가 실행됨
		classF.methodB();//ClassC 소속 메서드가 실행됨
		classF.methodC();//ClassC 소속 메서드가 실행됨
		classF.methodD();//ClassA 소속 메서드가 실행됨
		classF.methodF();//ClassF 소속 메서드가 실행됨
		
	}
}