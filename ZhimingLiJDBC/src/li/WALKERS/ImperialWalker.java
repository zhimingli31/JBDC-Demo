package li.WALKERS;

public class ImperialWalker {

	private String WTypeID;
	private String WType;
	private int Height;
	private int Weight;
	private int Length;
	private int Width;
	private int Crew;
	private int TroopCapacity;
	private int MaximumSpeed;
	private int OpRange;
	public ImperialWalker(String wTypeID, String wType, int height, int weight, int length, int width, int crew,
			int troopCapacity, int maximumSpeed, int opRange) {

		WTypeID = wTypeID;
		WType = wType;
		Height = height;
		Weight = weight;
		Length = length;
		Width = width;
		Crew = crew;
		TroopCapacity = troopCapacity;
		MaximumSpeed = maximumSpeed;
		OpRange = opRange;
	}
	
	public String getWTypeID() {
		return WTypeID;
	}

	public void setWTypeID(String wTypeID) {
		WTypeID = wTypeID;
	}

	public String getWType() {
		return WType;
	}

	public void setWType(String wType) {
		WType = wType;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getCrew() {
		return Crew;
	}

	public void setCrew(int crew) {
		Crew = crew;
	}

	public int getTroopCapacity() {
		return TroopCapacity;
	}

	public void setTroopCapacity(int troopCapacity) {
		TroopCapacity = troopCapacity;
	}

	public int getMaximumSpeed() {
		return MaximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		MaximumSpeed = maximumSpeed;
	}

	public int getOpRange() {
		return OpRange;
	}

	public void setOpRange(int opRange) {
		OpRange = opRange;
	}

	public void displayWalkerInfo() {
		
		
		System.out.println("Height: " + this.getHeight() + "\tWeight: " + this.getWeight() + "\tLength " + this.getLength()
				+ "\tWidth: " + this.getWidth());
		System.out.println("Crew: " + this.getCrew() + " Troop Capacity: " + this.getTroopCapacity());
		System.out.println("Maximum Speed: " + this.getMaximumSpeed() + "\tOperational Range: " + this.getOpRange());
		System.out.println("___________________________________________________________");
		System.out.println();
	}
}
