package entities;

import logic.Monster;
import logic.Player;



public class Entity {
	
	public Player ePLAYER;
	public Monster eMONSTER;
	
	public Entity (Player player) {
		ePLAYER = player;
	}
	
	public Entity (Monster monster) {
		eMONSTER = monster;
	}
	
	public void damagePlayer (int damage) {
		ePLAYER.setHealth(ePLAYER.getHealth().getOrderID(), -damage);
		System.out.println(ePLAYER.getFullHealth());
	}
	
	public void damageMonster (Monster monster, int damage) {
		
	}
	
}