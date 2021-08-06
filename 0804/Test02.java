class Test02{
	public static void main(String[] args) 
	{
		// System.out.println(Person.population);
		// Person.population++;
		// System.out.println("++ == "+Person.population);

		Person p1 = new Person("p1");
		System.out.println(Person.population);

		// Person.population = 5;

		Person p2 = new Person("p2");
		System.out.println(Person.population);

		// Person.population = 2;

		Person p3 = new Person("p3");
		System.out.println(Person.population);

		Person p4 = new Person();
		System.out.println(Person.population);
	}
}
 