class Var2{
	
	int a;			//��ü ����	default = 0
	static int b;	//Ŭ���� ���� default = 0
	double d;		// default = 0.0
	boolean bool;	// default = false(0)
	char c;			// default = '';
	String str;		// default = null;

	Var2(String s01){ //�Ķ���� �Ǵ� �Ű�����
		int c = 3; //�������� �Ǵ� ���ú��� �����Ҵ�
		// int c;
		
		s01 = "������ �� ��밡��";

		System.out.println(c);
		System.out.println(a); //��ü ���� ���� x
		System.out.println(b); //Ŭ���� ���� ���� x

		a = 0;
		b = 2;
		s01 = "";
	};

	byte z;

	void method01(String s02, boolean yn){
		// c = 5;
		int d;
		a = 5;
		b = 20;
	};

	static void mothod02(){
		System.out.println(a); // static �޼ҵ峻���� non-static(��ü ����) ������ ����
		System.out.println(b); // static �޼ҵ峻���� static(Ŭ���� ����) ������ ���� x
	}

	static short sht;

	public static void main(String[] args){
		System.out.println(b);
	}
}
