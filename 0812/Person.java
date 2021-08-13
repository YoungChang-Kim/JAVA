public class Person{

	private String name;
	private int age;

	private boolean adult;

	private static int population;

	private static final String COUNTRY = "KOREA";

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		if(age>=1){
			this.age = age;
		}else{
			this.age = 0;
		}
	}

	public int getAge(){
		return age;
	}

	public void setAdult(boolean adult){
		this.adult = adult;
	}

	public boolean isAdult(){
		return adult;
	}

	public static String getCOUNTRY(){
		return COUNTRY;
	}

	public static void setPopulation(int population){
		Person.population = population;
	}

	public static int getPopultaion(){
		return population;
	}

	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}