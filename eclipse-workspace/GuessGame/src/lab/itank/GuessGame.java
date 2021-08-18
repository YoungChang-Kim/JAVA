package lab.itank;

import java.util.Scanner;

public class GuessGame {
	
	Player player;
	
	public void startGame() {
		/*
		//맞춰야 할 랜덤 숫자를 RandomManager로 부터 가져온다.
		int rand;
		RandomManager randomManager = new RandomManager();
		rand = randomManager.getRandomNumber();
		
		//ver1
		//player를 만들어 숫자를 맞춰 보도록 한다. (기회는 3번뿐)
		Player player = new Player();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i+"번째 기회입니다. 숫자를 맞춰 보세요");
			player.guess();
			if(player.getNumber() == rand) {
				System.out.println(i+"번 째에 맞추셨습니다!");
				break;
			}else {
				System.out.println("틀리셨습니다.");
				if(i == 3) {
					System.out.println("3회의 기회를 모두 날리셨군요..");
				}
			}
		}
		
		//맞추면 몇번만에 맞췄다라고 메세지 보여주고 바로 게임종료
		//못 맞추면 3회를 기회를 모두 날리셨군요..바로 게임종료
		*/
		//ver2
		//추가사항 : 게임을 바로 종료 하지 않고 
		//게임진행여부를 입력 받아 게임이 지속과 종료를 결정한다.
		int rand;
		String restart;
		RandomManager randomManager = new RandomManager();
		rand = randomManager.getRandomNumber();
		
		Scanner scanner = new Scanner(System.in);
		
		//ver1
		//player를 만들어 숫자를 맞춰 보도록 한다. (기회는 3번뿐)
		Player player = new Player();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i+"번째 기회입니다. 숫자를 맞춰 보세요");
			player.guess();
			if(player.getNumber() == rand) {
				System.out.println(i+"번 째에 맞추셨습니다!");
				break;
			}else {
				System.out.println("틀리셨습니다.");
				if(i == 3) {
					System.out.println("3회의 기회를 모두 날리셨군요..");
					System.out.println("재도전 하시겠어요? y / n");
					restart = scanner.next();
					if(restart == "y") {
						i -= 2;
					}else {
						System.out.println("게임종료");
					}
				}
			}
		}
	}
}

