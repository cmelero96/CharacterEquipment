package models.equipment.interfaces;

public abstract class AttackWeapon extends Weapon {
	
	protected int attack;
	
	public void action() {
		attack();
	}
	
	public void attack() {
		System.out.println("Attacked with " + this.name + " for " + this.attack + " damage.");
	}
	
	public int getAttack() {
		return attack;
	}
	
}
