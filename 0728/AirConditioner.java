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
		System.out.println("������ �µ� : "+a1.temperature+", ������ �귣�� : "+a1.brand+", ������ ��ġ : "+a1.position);
	}
}
