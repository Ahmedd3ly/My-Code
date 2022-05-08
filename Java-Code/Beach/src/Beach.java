
public class Beach {
	private String beachName;
	private int avgTemp;
	private boolean isTidal;

	public Beach(String name, int avgTempSetter, boolean tide) {
		setName(name);
		setAvgTemp(avgTempSetter);
		setIsTidal(tide);
	}

	public void setName(String name) {
		beachName = name;
	}

	public String getName() {
		return (beachName);
	}

	public void setAvgTemp(int avgTempSetter) {
		if ((avgTempSetter > 0) && (avgTempSetter < 40)) {
			avgTemp = avgTempSetter;
		} else {
			System.out.println("unsitable temperature.");
		}
	}
	
	public int getAvgTemp() {
		return (avgTemp);
	}

	public void setIsTidal(boolean tide) {
		isTidal = tide;
	}

	public String getIsTidal() {
		if (isTidal) {
			return (" and is affected by tides");
		} else {
			return (" and is not affected by tides");
		}
	}

	@Override
	public String toString() {
		return ("Beach name : " + beachName + " has an average sea temp " + avgTemp + getIsTidal());
	}
}
