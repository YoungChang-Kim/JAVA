package lab.itank;

import java.util.Scanner;

public class GuessGame {
	
	Player player;
	
	public void startGame() {
		/*
		//����� �� ���� ���ڸ� RandomManager�� ���� �����´�.
		int rand;
		RandomManager randomManager = new RandomManager();
		rand = randomManager.getRandomNumber();
		
		//ver1
		//player�� ����� ���ڸ� ���� ������ �Ѵ�. (��ȸ�� 3����)
		Player player = new Player();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i+"��° ��ȸ�Դϴ�. ���ڸ� ���� ������");
			player.guess();
			if(player.getNumber() == rand) {
				System.out.println(i+"�� °�� ���߼̽��ϴ�!");
				break;
			}else {
				System.out.println("Ʋ���̽��ϴ�.");
				if(i == 3) {
					System.out.println("3ȸ�� ��ȸ�� ��� �����̱���..");
				}
			}
		}
		
		//���߸� ������� ����ٶ�� �޼��� �����ְ� �ٷ� ��������
		//�� ���߸� 3ȸ�� ��ȸ�� ��� �����̱���..�ٷ� ��������
		*/
		//ver2
		//�߰����� : ������ �ٷ� ���� ���� �ʰ� 
		//�������࿩�θ� �Է� �޾� ������ ���Ӱ� ���Ḧ �����Ѵ�.
		int rand;
		String restart;
		RandomManager randomManager = new RandomManager();
		rand = randomManager.getRandomNumber();
		
		Scanner scanner = new Scanner(System.in);
		
		//ver1
		//player�� ����� ���ڸ� ���� ������ �Ѵ�. (��ȸ�� 3����)
		Player player = new Player();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i+"��° ��ȸ�Դϴ�. ���ڸ� ���� ������");
			player.guess();
			if(player.getNumber() == rand) {
				System.out.println(i+"�� °�� ���߼̽��ϴ�!");
				break;
			}else {
				System.out.println("Ʋ���̽��ϴ�.");
				if(i == 3) {
					System.out.println("3ȸ�� ��ȸ�� ��� �����̱���..");
					System.out.println("�絵�� �Ͻðھ��? y / n");
					restart = scanner.next();
					if(restart == "y") {
						i -= 2;
					}else {
						System.out.println("��������");
					}
				}
			}
		}
	}
}

