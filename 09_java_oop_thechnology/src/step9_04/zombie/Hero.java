package step9_04.zombie;



public class Hero extends Unit {
	
	int damage;
	int recoveryCount;
	
	public Hero(int position, int currentHp, int maxHp, int recoveryCount) {
		super(position, currentHp, maxHp); //부모클래스의 추가생성자를 실행.부모클래스의 기본생성자는 아무것도 없는것임.
		this.setPosition(position);
		this.setMaxHp(maxHp);
		this.recoveryCount = recoveryCount;
	}

	public void attack(Unit enemy) {

		if (enemy instanceof Boss) {	//보스인지 아닌지 구분해서 공격 // 형변환이 굳이 필요한가?? 형변환은 보스만 되니깐
			
			Boss boss = (Boss)enemy;
			this.damage = PlayGame.ran.nextInt(getMaxHp()) + 1;
			
			if (boss.shield > 0) {  
				int tempBossShield = boss.shield - this.damage;
				if (tempBossShield >= 0) { 
					 boss.shield = boss.shield- this.damage;
				}
				else {
					boss.shield = 0;
					boss.setCurrentHp(boss.getCurrentHp() + tempBossShield);
				}
			}	
			else {
				boss.setCurrentHp(boss.getCurrentHp() - this.damage);
			}
			
			if (boss.getCurrentHp() <= 0) {
				boss.setCurrentHp(0);
			}
			System.out.println("\n\t[msg]히어로가 " + this.damage + "의 공격력으로 공격 :" + " 현재 Boss hp : " + boss.getCurrentHp() + " 현재 Boss Shield : " + boss.shield);
		}
		else {
			this.damage = PlayGame.ran.nextInt(getMaxHp()) + 1;
			enemy.setCurrentHp(enemy.getCurrentHp() - this.damage);
			
			if (enemy.getCurrentHp() <= 0) {
				enemy.setCurrentHp(0);
			}
			
			System.out.println("\n\t[msg]히어로가 " + this.damage + "의 공격력으로 공격 :" + " 현재 Zombie hp : " + enemy.getCurrentHp());
		}
		
	}


	public void recovery() {
		
		if (recoveryCount > 0) {
			setCurrentHp(getCurrentHp() + 100);
			System.out.println("\n[msg]체력 회복해서" + getCurrentHp() + "이 되었습니다");
			recoveryCount--;
		}
		else if (recoveryCount == 0) {
			System.out.println("\n[msg]모두 사용했습니다.");
		}
		
	}


}
