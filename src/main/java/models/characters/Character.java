package models.characters;

import models.equipment.interfaces.AttackWeapon;
import models.equipment.interfaces.DefenseWeapon;
import models.equipment.interfaces.Weapon;

public abstract class Character {

	String name;

	AttackWeapon mainHand;
	Weapon offHand;

	public void attack() {
		if (mainHand == null) {
			System.out.println("Nothing to attack with!");
			return;
		}

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

	public void equipMain(Weapon item) {
		if (item instanceof AttackWeapon)
			this.mainHand = (AttackWeapon) item;
		else
			System.out.println("Cannot equip this on the main hand!");
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
