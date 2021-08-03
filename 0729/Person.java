class Person 
{
	String name;

	Person(String name){
		this.name = name;
	}
	void eat(String food){
		System.out.println(food+"(을)를 먹어요!");
	}
	void play(){
		System.out.println("play");
	}
	void study(String subject){
		System.out.println(subject+"을 공부합니다.");
	}
	void sleep(int bedtime){
		System.out.println(bedtime+"시에 잡니다.");
	}

	void plan(){
		System.out.println("----------------plan-----------------");
		eat("밥");
		play();
		study("자바");
		sleep(1);
	}
}
