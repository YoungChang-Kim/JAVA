class Person 
{
	String name;

	Person(String name){
		this.name = name;
	}
	void eat(String food){
		System.out.println(food+"(��)�� �Ծ��!");
	}
	void play(){
		System.out.println("play");
	}
	void study(String subject){
		System.out.println(subject+"�� �����մϴ�.");
	}
	void sleep(int bedtime){
		System.out.println(bedtime+"�ÿ� ��ϴ�.");
	}

	void plan(){
		System.out.println("----------------plan-----------------");
		eat("��");
		play();
		study("�ڹ�");
		sleep(1);
	}
}
