package models.equipment.interfaces;

import models.equipment.IronSword;
import models.equipment.SteelSword;
import models.equipment.WoodenSword;

public class AttackWeaponFactory implements WeaponFactory {

	public Weapon createWeapon(String material) {
		switch(material.toLowerCase()) {
		case "wood":
		case "wooden":
			return fabricate(new WoodenSword());
		case "iron":
			return fabricate(new IronSword());
		case "steel":
			return fabricate(new SteelSword());
		default:
			System.out.println("Invalid material!");
			return null;
		}
	}

	private AttackWeapon fabricate(AttackWeapon weapon) {
		System.out.println("Fabricated " + weapon.name + " with " + weapon.attack + " attack power.");
		return weapon;
	}

}
