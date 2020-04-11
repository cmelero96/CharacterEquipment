package models.equipment;

import models.equipment.interfaces.AttackWeapon;

public class WoodenSword extends AttackWeapon {
	
	public WoodenSword() {
		name = "Wooden Sword";
		attack = 10;
	}

	@Override
	public void attack() {
		System.out.println("Attacked with " + this.name + " for " + this.attack + " damage.");
	}
}
