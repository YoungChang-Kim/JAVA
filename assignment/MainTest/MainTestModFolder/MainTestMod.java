		
		//main()������ order() �ܿ��� ȣ������ ���ÿ�.
		//���������� �� private ���� �ʾƵ� �˴ϴ�.
		//�޼ҵ� ���� �ּ��� �޾�����,
		//�޼ҵ带 ���� �� �������� �ʴ� �ѿ��� �������� �帧��
		//�´ٰ� �����ϴ� ��� �ڵ� �ۼ��ص� �˴ϴ�.
		
		//��� : Seller�� Buyer�� �� ���� ���� ��ŭ 
        //      ���� ���� �پ��� ������ �����Ǹ�,
        //      Buyer�� ���� �ݾ��� �����ϰ� �ȴ�.

		// =====================�߰� ���� ����==============================
		// 1. Seller�� ǰ���� ������ ���ڶ�� �ش� ���Կ��� �ش� ǰ���� ������ ���	| 
		// 2. Buyer�� �����Ϸ��µ� ���� ���ڶ�� �ش� �մ��� ���� ���ڶ��� ���		|
		// 3. �� ���, �ٳ����� ������ ���Ը��� �ٸ��� å��						|
		// ==============================================================


public class MainTestMod {

	public static void main(String[] args) {

		Seller seller01 = new Seller("�к���", 10, 12, new Apple(), new Banana(50));
		Seller seller02 = new Seller("�����", 15, 18, new Apple(), new Banana(40));
		//Seller(�����������, �����ٳ�������) ��ü 2�� ���� - ok
	
		//Buyer(���� ��� �ִ� �� ���� �ݾ�) ��ü 3�� ���� - ok
		Buyer buyer01 = new Buyer("����", 200); // ���� ���ڶ�
		Buyer buyer02 = new Buyer("ö��", 1500);
		Buyer buyer03 = new Buyer("¯��", 1000);
		
		//Buyer �� ��� ��ü�� order �޼ҵ� ȣ��
		buyer01.order(seller01, 10, 12);
		buyer02.order(seller02, 16, 19); // ����� ������ �ش� ������ �������� ����
		buyer03.order(seller02, 5, 8);

		//���� ���� ��� ��ü�� ��ü ���� �� ����ϱ�
		System.out.println("==================seller======================");
		System.out.println("==================seller01======================");
		System.out.println("seller01.appleCount : "+seller01.appleCount);
		System.out.println("seller01.bananaCount : "+seller01.bananaCount);
		System.out.println("seller01.sellerMoney : "+seller01.sellerMoney);

		System.out.println("==================seller02======================");
		System.out.println("seller02.appleCount : "+seller02.appleCount);
		System.out.println("seller02.bananaCount : "+seller02.bananaCount);
		System.out.println("seller02.sellerMoney : "+seller02.sellerMoney);

		System.out.println("==================buyer======================");
		System.out.println("buyer01.buyerMoney : "+buyer01.buyerMoney);
		System.out.println("buyer02.buyerMoney : "+buyer02.buyerMoney);
		System.out.println("buyer03.buyerMoney : "+buyer03.buyerMoney);

	}
}

	
// ���� ������ ����(��ü) ���� ���� �ϱ� ���� ����
class Apple {
	int price;

	Apple(){
		this.price = 70;
	}


	Apple(int price){
		this.price = price;
	}
}

class Banana {
	int price;

	Banana(){
		this.price = 50;
	}

	Banana(int price){
		this.price = price;
	}
}


class Seller {

	//� Seller�� ǰ���� ������ ���� ���� �˱� ���� Seller�̸� ����
	String name;
	//������� ���� ����
	int appleCount;
	//�ٳ������� ���� ����
	int bananaCount;
	//���� ���� ����()
	int sellerMoney;
	Apple apple;
	Banana banana;

	Seller(String name, int appleCount, int bananaCount){
		this.name = name;
		this.appleCount = appleCount;
		this.bananaCount = bananaCount;
	}

	Seller(String name, int appleCount, int bananaCount, Apple apple, Banana banana){
		this.appleCount = appleCount;
		this.bananaCount = bananaCount;
		this.name = name;
		this.apple = apple;
		this.banana = banana;
	}

	String getName(){
		return this.name;
	}

	
	//�ֹ� ������ŭ ������ �Ĵ� �޼ҵ屸��(���� ������ �ٰ���?), 
	//���� �� �Ǹűݾ��� �������ش�.
	public int sell(int appleCount, int bananaCount) {
		if(this.appleCount < appleCount && this.bananaCount < bananaCount){
			System.out.println(this.getName() + " : ����� �ٳ����� ������ �����մϴ�.");
			return 0;
		}else if(this.appleCount < appleCount){
			System.out.println(this.getName() + " : ��� ������ �����մϴ�.");
			return 0;
		}else if(this.bananaCount < bananaCount){
			System.out.println(this.getName() + " : �ٳ��� ������ �����մϴ�.");
			return 0;
		}else{
			this.appleCount -= appleCount;
			this.bananaCount -= bananaCount;
			int total = (appleCount*apple.price) + (bananaCount*banana.price);
			return total;
		}
	}

	//�����ڷ� ���� ���� ���� �� �������� �����ϴ� �޼ҵ�
	public void takeMoney(int total) {
		sellerMoney += total;
	}
}

class Buyer {
	int buyerMoney;
	//� Buyer�� ���� ���� ���� �˱� ���� Buyer�̸� ����
	String name;
	//�����ڰ� �����ϰ� �ִ� �ݾ� ���� ���� - ok
	
	Buyer(String name, int buyerMoney){
		this.name = name;
		this.buyerMoney = buyerMoney; 
	}

	Buyer(int buyerMoney){
		this.name = "";
		this.buyerMoney = buyerMoney;
	}

	String getName(){
		return this.name;
	}
	
	//���ϴ� Seller ��ü���� ��� ����	
	//���ϴ� Seller ��ü���� ��� ���� ��� ����,
	//�ٳ��� ������ �Ǹ��϶�� �ϰ�
	//���ž��� �޾ƿ��� �ٷ� �ݾ��� �����Ѵ�.
	//�����ϴ� ������ giveMoney()�� ȣ���Ѵ�.
	public void order(Seller seller, int appleCount, int bananaCount) {
		int total = seller.sell(appleCount, bananaCount);
		if(total > this.buyerMoney){
			System.out.println(this.getName()+" : ���� �����մϴ�.");
		}else{
			giveMoney(seller, total);
		}
	}
	
	//���� ���� �ݾ��� ���̰�
	//Seller���� ���� �ش�.
	public void giveMoney(Seller seller, int total) {
		this.buyerMoney -= total;
		seller.takeMoney(total);
	}
}

