package com.kyle.zookeeper;

public class Mammals {
	// MEMBER VAR
	public int energyLevel = 100;
	
	
	// CONSTRUCTOR
	public Mammals() {}
	
	public Mammals( int energyLevel){
		this.energyLevel = energyLevel;
	}
	

	// METHODS
	public int displayEnergy() {
		System.out.println("Energy level: " + energyLevel);
		return getEnergyLevel();
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
}
