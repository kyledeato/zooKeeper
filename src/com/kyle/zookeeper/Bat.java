package com.kyle.zookeeper;

public class Bat extends Mammals{

	public Bat() {
		super(300);
	}
	public Bat(int energyLevel) {
		// TODO Auto-generated constructor stub
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("fly fly fly");
		setEnergyLevel(getEnergyLevel() - 5);
	}
	public void eatHumans() {
		System.out.println("eating human nom nom");
		setEnergyLevel(getEnergyLevel() + 25);
	}
	public void attackTown() {
		System.out.println("town is on fire");
		setEnergyLevel(getEnergyLevel() - 100);
	}

}
