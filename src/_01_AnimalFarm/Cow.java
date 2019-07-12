package _01_AnimalFarm;

public class Cow extends Animal {

	@Override
	void makeNoise() {
		System.out.println("moo");

	}

	@Override
	void move(int distance) {
		System.out.println("the cow walked into the fence and fell over and died");
	}

}
