package models.equipment.interfaces;

public abstract class Weapon {
	public String name;
	public int condition = 100;
	
	public abstract void action();

}
