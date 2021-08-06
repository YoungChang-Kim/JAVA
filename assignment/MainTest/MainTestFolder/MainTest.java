		
		//main()������ order() �ܿ��� ȣ������ ���ÿ�.
		//���������� �� private ���� �ʾƵ� �˴ϴ�.
		//�޼ҵ� ���� �ּ��� �޾�����,
		//�޼ҵ带 ���� �� �������� �ʴ� �ѿ��� �������� �帧��
		//�´ٰ� �����ϴ� ��� �ڵ� �ۼ��ص� �˴ϴ�.
		
		//��� : Seller�� Buyer�� �� ���� ���� ��ŭ 
        //      ���� ���� �پ��� ������ �����Ǹ�,
        //      Buyer�� ���� �ݾ��� �����ϰ� �ȴ�.


public class MainTest {

	public static void main(String[] args) {

		Seller seller01 = new Seller(10, 12);
		Seller seller02 = new Seller(15, 18);
		//Seller(�����������, �����ٳ�������) ��ü 2�� ���� - ok
	
		//Buyer(���� ��� �ִ� �� ���� �ݾ�) ��ü 3�� ���� - ok
		Buyer buyer01 = new Buyer(2000);
		Buyer buyer02 = new Buyer(1500);
		Buyer buyer03 = new Buyer(1000);
		
		//Buyer �� ��� ��ü�� order �޼ҵ� ȣ��
		buyer01.order(seller01, 10, 12);
		buyer02.order(seller02, 10, 10);
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


class Apple {
	//��� 1���� ���� 70��
	static int price;
	static {
		price = 70;
	}
}

class Banana {
	//�ٳ��� 1���� ���� 50��
	static int price;
	static {
		price = 50;
	}
}


class Seller {

	//������� ���� ����
	int appleCount;
	//�ٳ������� ���� ����
	int bananaCount;
	//���� ���� ����()
	int sellerMoney;

	Seller(int appleCount, int bananaCount){
		this.appleCount = appleCount;
		this.bananaCount = bananaCount;
	}

	
	//�ֹ� ������ŭ ������ �Ĵ� �޼ҵ屸��(���� ������ �ٰ���?), 
	//���� �� �Ǹűݾ��� �������ش�.
	public int sell(int appleCount, int bananaCount) {
		this.appleCount -= appleCount;
		this.bananaCount -= bananaCount;
		int total = (appleCount*Apple.price) + (bananaCount*Banana.price);
		return total;
	}

	//�����ڷ� ���� ���� ���� �� �������� �����ϴ� �޼ҵ�
	public void takeMoney(int total) {
		sellerMoney += total;
	}
}

class Buyer {
	int buyerMoney;
	//�����ڰ� �����ϰ� �ִ� �ݾ� ���� ���� - ok

	Buyer(int buyerMoney){
		this.buyerMoney = buyerMoney; 
	}
	
	//���ϴ� Seller ��ü���� ��� ����	
	//���ϴ� Seller ��ü���� ��� ���� ��� ����,
	//�ٳ��� ������ �Ǹ��϶�� �ϰ�
	//���ž��� �޾ƿ��� �ٷ� �ݾ��� �����Ѵ�.
	//�����ϴ� ������ giveMoney()�� ȣ���Ѵ�.
	public void order(Seller seller, int appleCount, int bananaCount) {
		int total = seller.sell(appleCount, bananaCount);
		giveMoney(seller, total);
	}
	
	//���� ���� �ݾ��� ���̰�
	//Seller���� ���� �ش�.
	public void giveMoney(Seller seller, int total) {
		this.buyerMoney -= total;
		seller.takeMoney(total);
	}
}

