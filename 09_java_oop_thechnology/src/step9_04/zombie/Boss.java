package step9_04.zombie;

public class Boss extends Zombie { //좀비클래스 상속

	int shield;
	
	public Boss(int position, int curHp, int maxHp, int shield) {
		super(position, curHp, maxHp);
		this.shield = shield;
	}

	
	public void attack(Unit hero) {

		int criticalProbability  = PlayGame.ran.nextInt(4);
		if (criticalProbability == 0) {
			
			System.out.println("\n\t[msg]보스의 필살기 발동 2배의 공격력");
			
			this.damage = 2 * (PlayGame.ran.nextInt(getMaxHp()) + 1);
			hero.setCurrentHp(hero.getCurrentHp() - this.damage);
			
			if (hero.getCurrentHp() <= 0) {
				hero.setCurrentHp(0);
			}
			
			System.out.println("\n\t[msg]보스가 " + this.damage + "의 공격력으로 공격 :" + " 현재 Hero hp : " + hero.getCurrentHp());
		
		} 
		else {
			
			System.out.println("\n\t[msg]보스의 일반공격 ");
			
			this.damage = PlayGame.ran.nextInt(getMaxHp()) + 1;
			hero.setCurrentHp(hero.getCurrentHp() - this.damage);
			
			if (hero.getCurrentHp() <= 0) {
				hero.setCurrentHp(0);
			}
			
			System.out.println("\n\t[msg]보스가 " + damage + "의 공격력으로 공격 :" + " 현재 Hero hp : " + hero.getCurrentHp());
		
		}
	}

}