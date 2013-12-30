package com.example.abstractfactory;

public class UFOEnemyShip extends EnemyShip {
	
	// we define the type of ship we want to create 
	// by stating we want to use the factory that 
	// makes enemy ships
	
	EnemyShipFactory shipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}
	
	// EnemyShipBuilding calls this method to build a specific UFOEnemyShip
	void makeShip() {
		System.out.println("Making enemy ship " + getName());
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
	}

}
