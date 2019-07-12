package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {double total = (getPopulation()*getGrowthRate())+getPopulation()*.5;
return total;
	}

}
