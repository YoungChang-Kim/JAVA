class Person{
	String name;
	static int population;//√—¿Œ±∏
	static int a;

	Person(){
		population++;
	}

	Person(String name){
		this.name = name;
		population++;
	}
}