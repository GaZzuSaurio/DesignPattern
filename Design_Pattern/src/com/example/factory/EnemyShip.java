package com.example.factory;

public abstract class EnemyShip {
	private String name;
	private double amtDamage;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getDamage() {
		return amtDamage;
	}
	
	public void setDamage(double damage) {
		this.amtDamage = damage;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " is shooting");
	}

}
