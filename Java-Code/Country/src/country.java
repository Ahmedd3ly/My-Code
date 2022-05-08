
public class country {
	private String countryName;
	private int population;
	private int area;

	public country() {
	}

	public country(String name, int countryArea, int countryPop) {
		setName(name);
		setGeographicalValues(countryArea, countryPop);
	}

	public void setName(String name) {
		countryName = name;
	}

	public String getName() {
		return ("Country's Name: " + countryName);
	}

	public void setGeographicalValues(int countryArea, int countryPop) {
		if ((countryPop < 0) || (countryArea < 0)) {
			System.out.println("Invalid data.");
		} else {
			population = countryPop;
			area = countryArea;
		}
	}

	public String getArea() {
		return ("Country's Area: " + area);
	}

	public String getPopulation() {
		return ("Country's population: " + population);
	}

	public int getDensity() {
		return (population / area);
	}

	@Override
	public String toString() {
		return ("Country Name is " + countryName + ", it's area is " + area + " m^2, it's population is " + population
				+ ", and it's density is " + getDensity());
	}
}
