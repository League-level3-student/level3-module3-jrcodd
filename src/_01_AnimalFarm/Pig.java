package _01_AnimalFarm;

public class Pig extends Animal {

	@Override
	void makeNoise() {
		System.out.println("oink oink");

	}

	@Override
	void move(int distance) {
	System.out.println("the pig was too busy to move");

	}

}
