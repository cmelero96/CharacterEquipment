package models.equipment.interfaces;

public abstract class DefenseWeapon extends Weapon {

	protected int defense;
	
	public void action() {
		block();
	}
	
	public void block() {
		System.out.println("Blocking " + this.defense + " damage with " + this.name + ".");	
	}
	
}
