package li.UNITS;

import li.MAIN.Location;

public class BattleGroup {
	
	private String BGID;
	private String Designation;
	private Location Position;
	public BattleGroup(String BGID, String Designation, Location Position) {
		this.BGID = BGID;
		this.Designation = Designation;
		this.Position = Position;
	}
	
	public String getBGID() {
		return BGID;
	}

	public void setBGID(String BGID) {
		this.BGID = BGID;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}

	public Location getPosition() {
		return Position;
	}

	public void setPosition(Location Position) {
		this.Position = Position;
	}

	public void displayBattleGroup() {
		System.out.println("____Battle Group: " + this.getDesignation());
		System.out.println("Located At " + this.getPosition().toString());
		System.out.println("\t________________");
	}
	

}
