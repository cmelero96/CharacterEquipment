package models.equipment.interfaces;

import models.equipment.IronShield;
import models.equipment.SteelShield;
import models.equipment.WoodenShield;

public class DefenseWeaponFactory implements WeaponFactory {

	public Weapon createWeapon(String material) {
		switch(material.toLowerCase()) {
		case "wood":
		case "wooden":
			return fabricate(new WoodenShield());
		case "iron":
			return fabricate(new IronShield());
		case "steel":
			return fabricate(new SteelShield());
		default:
			System.out.println("Invalid material!");
			return null;
		}
	}

	private DefenseWeapon fabricate(DefenseWeapon weapon) {
		System.out.println("Fabricated " + weapon.name + " with " + weapon.defense + " defense power.");
		return weapon;
	}
	
}
