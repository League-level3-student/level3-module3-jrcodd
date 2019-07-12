package _01_AnimalFarm;

public class Sheep extends Animal {

	@Override
	void makeNoise() {
System.out.println("BAAAAAAAA");
	}

	@Override
	void move(int distance) {
		System.out.println("the sheep walked off a cliff R.I.P");
	}

}
