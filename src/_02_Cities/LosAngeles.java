package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {double total = getPopulation()*getGrowthRate();
	
	total*=(getGrowthRate()/2);
	return total;
	}
	
}
