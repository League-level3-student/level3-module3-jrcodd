package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	static Cow cow = new Cow();
	static Pig pig = new Pig();
	static Sheep sheep = new Sheep();
	static Chicken chicken = new Chicken();

	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(cow);
		farm.add(pig);
		farm.add(sheep);
		farm.add(chicken);
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).move(100);
		}
	}
}
