package step9_04.zombie;

abstract public class Unit{
	
	private int position;
	private int currentHp;
	private int maxHp;
	
	public Unit() {}
	
	public Unit(int position, int currentHp, int maxHp) {
		this.position = position;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
	}
	
	abstract void attack(Unit unit);
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}
	
}