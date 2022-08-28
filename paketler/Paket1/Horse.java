package Paket1;

import Paket2.Animal;

public class Horse extends Animal {

	public Horse(String name) {
		super(name);
		
	
	}
	public void speak() {
		System.out.println(this.name + " konuþuyor...");
	}
}
