package com.kyle.zookeeper;

public class Gorilla extends Mammals{
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething(String something) {
		System.out.println("Gorillas has thrown a " + something);
		setEnergyLevel(getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("Gorilla eating");
		setEnergyLevel(getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("Gorilla climbing a tree");
		setEnergyLevel(getEnergyLevel() - 10);
	}
	

}
