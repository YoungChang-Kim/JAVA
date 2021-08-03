class AirConditioner 
{
	double temperature;
	String brand;
	String position;

	AirConditioner(){}
	public static void main(String[] args) 
	{
		AirConditioner a1;
		AirConditioner a1 = new AirConditioner();
		a1.temperature = 27.3;
		a1.brand = "winia";
		a1.position = "DiningRoom";
		System.out.println("에어컨 온도 : "+a1.temperature+", 에어컨 브랜드 : "+a1.brand+", 에어컨 위치 : "+a1.position);
	}
}
