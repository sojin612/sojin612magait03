package step9_04.zombie;

public class Zombie extends Unit {
	
	int damage;
	
	public Zombie(int position, int currentHp, int maxHp) {
		super(position,currentHp,maxHp);
	}
	
	
	public void attack(Unit hero) {
		
		this.damage = PlayGame.ran.nextInt(getMaxHp()) + 1;
		hero.setCurrentHp(hero.getCurrentHp()-this.damage);
		
		if(hero.getCurrentHp() <= 0) {
			hero.setCurrentHp(0);
		}
		
		setCurrentHp(getCurrentHp()+this.damage/2);
		
		System.out.println("\n\t[msg]좀비가 "+ this.damage + "의 공격력으로 공격 :"
				+ " 현재 Hero hp : "+ hero.getCurrentHp()+" / 좀비 체력 회복 " + getCurrentHp()); 
		
	}

}