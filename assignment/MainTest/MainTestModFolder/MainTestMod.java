		
		//main()에서는 order() 외에는 호출하지 마시오.
		//변수선언은 꼭 private 하지 않아도 됩니다.
		//메소드 위에 주석을 달아지만,
		//메소드를 수정 및 삭제하지 않는 한에서 여러분이 흐름상
		//맞다고 생각하는 대로 코드 작성해도 됩니다.
		
		//결과 : Seller는 Buyer가 산 과일 개수 만큼 
        //      과일 개수 줄어들고 수입이 증가되며,
        //      Buyer는 보유 금액이 감소하게 된다.

		// =====================추가 보수 내용==============================
		// 1. Seller의 품목의 갯수가 모자라면 해당 가게에서 해당 품목의 부족을 출력	| 
		// 2. Buyer가 구매하려는데 돈이 모자라면 해당 손님은 돈이 모자람을 출력		|
		// 3. 각 사과, 바나나의 가격을 가게마다 다르게 책정						|
		// ==============================================================


public class MainTestMod {

	public static void main(String[] args) {

		Seller seller01 = new Seller("털보네", 10, 12, new Apple(), new Banana(50));
		Seller seller02 = new Seller("선녀네", 15, 18, new Apple(), new Banana(40));
		//Seller(보유사과개수, 보유바나나개수) 객체 2개 생성 - ok
	
		//Buyer(과일 살수 있는 총 보유 금액) 객체 3개 생성 - ok
		Buyer buyer01 = new Buyer("유리", 200); // 돈이 모자람
		Buyer buyer02 = new Buyer("철수", 1500);
		Buyer buyer03 = new Buyer("짱구", 1000);
		
		//Buyer 형 모든 객체의 order 메소드 호출
		buyer01.order(seller01, 10, 12);
		buyer02.order(seller02, 16, 19); // 사려는 갯수가 해당 가게의 갯수보다 많음
		buyer03.order(seller02, 5, 8);

		//위에 만든 모든 객체의 객체 변수 값 출력하기
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

	
// 과일 가격을 가게(객체) 마다 적용 하기 위한 보수
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

	//어떤 Seller가 품목의 갯수가 부족 한지 알기 위해 Seller이름 선언
	String name;
	//사과개수 변수 선언
	int appleCount;
	//바나나개수 변수 선언
	int bananaCount;
	//수입 변수 선언()
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

	
	//주문 개수만큼 과일을 파는 메소드구현(과일 개수가 줄겠지?), 
	//과일 총 판매금액을 리턴해준다.
	public int sell(int appleCount, int bananaCount) {
		if(this.appleCount < appleCount && this.bananaCount < bananaCount){
			System.out.println(this.getName() + " : 사과와 바나나의 갯수가 부족합니다.");
			return 0;
		}else if(this.appleCount < appleCount){
			System.out.println(this.getName() + " : 사과 갯수가 부족합니다.");
			return 0;
		}else if(this.bananaCount < bananaCount){
			System.out.println(this.getName() + " : 바나나 갯수가 부족합니다.");
			return 0;
		}else{
			this.appleCount -= appleCount;
			this.bananaCount -= bananaCount;
			int total = (appleCount*apple.price) + (bananaCount*banana.price);
			return total;
		}
	}

	//구매자로 부터 받은 돈을 내 수입으로 포합하는 메소드
	public void takeMoney(int total) {
		sellerMoney += total;
	}
}

class Buyer {
	int buyerMoney;
	//어떤 Buyer가 돈이 부족 한지 알기 위해 Buyer이름 선언
	String name;
	//구매자가 보유하고 있는 금액 변수 선언 - ok
	
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
	
	//원하는 Seller 객체에게 사고 싶은	
	//원하는 Seller 객체에게 사고 싶은 사과 개수,
	//바나나 개수를 판매하라고 하고
	//구매액을 받아오면 바로 금액을 지급한다.
	//지급하는 행위는 giveMoney()을 호출한다.
	public void order(Seller seller, int appleCount, int bananaCount) {
		int total = seller.sell(appleCount, bananaCount);
		if(total > this.buyerMoney){
			System.out.println(this.getName()+" : 돈이 부족합니다.");
		}else{
			giveMoney(seller, total);
		}
	}
	
	//나의 보유 금액을 줄이고
	//Seller에게 돈을 준다.
	public void giveMoney(Seller seller, int total) {
		this.buyerMoney -= total;
		seller.takeMoney(total);
	}
}

