package step9_04.zombie;

import java.util.*;

public class PlayGame {

	static Scanner scan = new Scanner(System.in);
	static Random ran = new Random();
	
	void play() {
		
		Hero hero     = new Hero(1, 200, 20, 10);//현재위치,현재체력,멕스체력,회복기회
		Zombie zombie = new Zombie(5, 100, 10); //현재위치,현재체력,멕스체력
		Boss boss     = new Boss(9, 300, 20, 100);//현재위치,현재체력,멕스체력,방어력

		while (true) {
			
			System.out.println("\n[msg]현재 위치 = " + hero.getPosition());
			System.out.print("[1]앞으로 이동하기 [2]종료하기: ");
			int move = scan.nextInt();

			if (move == 1) {
				
				hero.setPosition(hero.getPosition()+1);
				
				if (hero.getPosition() == zombie.getPosition() || hero.getPosition() == boss.getPosition()) {
					
					boolean isBoss = false;
					String enemyName = "좀비";
					
					if (hero.getPosition() == boss.getPosition()) {
						isBoss = true;
						enemyName = "보스";
					}
					
					System.out.print("\n[msg]"+enemyName +"를 만났습니다. 공격모드로 바뀝니다. ");
					
					while (true) {
						
						System.out.print("\n[1]공격하기 [2]포션마시기: ");
						int selectMenu = scan.nextInt();

						if (selectMenu == 1) {
							if (!isBoss) {
								zombie.attack(hero);
								hero.attack(zombie); 
							}
							else {
								boss.attack(hero);
								hero.attack(boss); 
							}
						}
						else if (selectMenu == 2) {
							hero.recovery();
						}
						
						if (hero.getCurrentHp() <= 0) {
							System.out.println("\n[msg]Hero가 죽었습니다. 게임에서 졌습니다. ");
							break;
						}

						if (!isBoss) {
							if (zombie.getCurrentHp() <= 0) {			
								System.out.println("\n[msg]"+enemyName+"를 이겼습니다. 앞으로 이동할 수 있습니다.");
								break;
							}
						}
						else {
							if (boss.getCurrentHp() <= 0) {
								System.out.println("\n[msg]"+enemyName+"를 이겼습니다. 앞으로 이동할 수 있습니다.");
								break;
							}
						}
					}
				}				
								
				if (hero.getPosition() == 10) {
					System.out.println("\n[msg]게임에서 승리했습니다. 종료합니다.");
					break;
				}

			} 
			else if (move == 2) {
				System.out.println("\n[msg]종료합니다. 감사합니다.");
				scan.close();
				break;
			}

		}
	}

}
