package models.characters;

import models.equipment.interfaces.AttackWeapon;
import models.equipment.interfaces.DefenseWeapon;
import models.equipment.interfaces.Weapon;

public abstract class Character {
	
	String name;

	AttackWeapon mainHand;
	Weapon offHand;
	
	public void attack() {
		mainHand.action();
		if (offHand instanceof AttackWeapon)
			offHand.action();
	}
	
	public void block() {
		if (offHand instanceof DefenseWeapon)
			offHand.action();
		else
			System.out.println("Nothing to block with!");
	}
	
	public void equipMain(AttackWeapon item) {
		this.mainHand = item;
	}
	
	public void equipOff(Weapon item) {
		this.offHand = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AttackWeapon getMainHand() {
		return mainHand;
	}

	public void setMainHand(AttackWeapon mainHand) {
		this.mainHand = mainHand;
	}

	public Weapon getOffHand() {
		return offHand;
	}

	public void setOffHand(Weapon offHand) {
		this.offHand = offHand;
	}
	
}
