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
		classA.methodA();//ClassD �Ҽ� �޼��尡 �����
		classA.methodB();//ClassD �Ҽ� �޼��尡 �����
		classA.methodC();//ClassD �Ҽ� �޼��尡 �����
		classA.methodD();//ClassD �Ҽ� �޼��尡 �����

		ClassC classC = new ClassF();
		classC.methodA();//ClassF �Ҽ� �޼��尡 �����
		classC.methodB();//ClassC �Ҽ� �޼��尡 �����
		classC.methodC();//ClassC �Ҽ� �޼��尡 �����
		classC.methodD();//ClassA �Ҽ� �޼��尡 �����

		ClassF classF = new ClassG();
		classF.methodA();//ClassF �Ҽ� �޼��尡 �����
		classF.methodB();//ClassC �Ҽ� �޼��尡 �����
		classF.methodC();//ClassC �Ҽ� �޼��尡 �����
		classF.methodD();//ClassA �Ҽ� �޼��尡 �����
		classF.methodF();//ClassF �Ҽ� �޼��尡 �����
		
	}
}