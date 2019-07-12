package _01_AnimalFarm;

public class Chicken extends Animal {

	@Override
	void makeNoise() {
System.out.println("Cluck Cluck");
	}

	@Override
	void move(int distance) {
		System.out.println("the chicken walked toward the food");

	}

}
