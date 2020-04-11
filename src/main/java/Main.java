import models.characters.Character;
import models.characters.Hero;
import models.equipment.IronShield;
import models.equipment.interfaces.AttackWeaponFactory;
import models.equipment.interfaces.DefenseWeaponFactory;
import models.equipment.interfaces.WeaponFactory;

public class Main {
	
	public static void main(String[] args) {
		
		WeaponFactory swordsFactory = new AttackWeaponFactory();
		WeaponFactory shieldsFactory = new DefenseWeaponFactory();
		
		Character pepe = new Hero();

		pepe.equipMain(swordsFactory.createWeapon("iron"));
		pepe.equipOff(shieldsFactory.createWeapon("wood"));
		
		pepe.attack();
		pepe.block();
	}

}
