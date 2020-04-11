import models.characters.Character;
import models.characters.Hero;
import models.equipment.IronShield;
import models.equipment.IronSword;

public class Main {
	
	public static void main(String[] args) {
		
		Character pepe = new Hero();

		pepe.equipMain(new IronSword());
		pepe.equipOff(new IronShield());
		
		pepe.attack();
		pepe.block();
	}

}
