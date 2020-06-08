package li.UNITS;

import li.ENUMS.Units;
import li.INTERFACES.Tactical;
import li.MAIN.Location;

public abstract class StormtrooperUnit implements Tactical{

	private String STUID;
	private BattleGroup UnitCmd;
	private Units UnitType;
	private int AssignedStrength;
	private Location Position;
	
	public StormtrooperUnit(String sTUID, BattleGroup unitCmd, Units unitType, int assignedStrength,
			Location position) {

		this.STUID = STUID;
		this.UnitCmd = UnitCmd;
		this.UnitType = UnitType;
		this.AssignedStrength = AssignedStrength;
		this.Position = Position;
	}

	
	public String getSTUID() {
		return STUID;
	}


	public void setSTUID(String sTUID) {
		STUID = sTUID;
	}


	public BattleGroup getUnitCmd() {
		return UnitCmd;
	}


	public void setUnitCmd(BattleGroup unitCmd) {
		UnitCmd = unitCmd;
	}


	public Units getUnitType() {
		return UnitType;
	}


	public void setUnitType(Units unitType) {
		UnitType = unitType;
	}


	public int getAssignedStrength() {
		return AssignedStrength;
	}


	public void setAssignedStrength(int assignedStrength) {
		AssignedStrength = assignedStrength;
	}


	public Location getPosition() {
		return Position;
	}


	public void setPosition(Location position) {
		Position = position;
	}


	public abstract void displayUnitInfo();


	@Override
	public void moveTo(Location L) {
		System.out.println(this.getUnitType() + " Unit: " + this.getSTUID());
		System.out.println("Currently Located At: " + this.getPosition().toString());
		System.out.println("Assigned to Battle Group: " + this.getUnitCmd().getDesignation());
		
		
	}

}
