package com.example.abstractfactory;

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to 
// provide as an option to build

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
	
	protected EnemyShip makeEnemyShip(String typeofship) {
		EnemyShip theEnemyShip = null;
		
		// If UFO sent grab use the factory that knows
		// what types of weapons and engines a regular UFO
		// needs. The EnemyShip object is returned & given a name
		
		if(typeofship.equals("UFO")) {
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
			
			// If UFO BOSS was sent grab use the factory that knows
			// what types of weapons and engines a Boss UFO
			// needs. The EnemyShip object is returned & given a name
		} else if (typeofship.equals("UFO BOSS")) {
			EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
			theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Boss Ship");
		}
		
		return theEnemyShip;
	}

}
