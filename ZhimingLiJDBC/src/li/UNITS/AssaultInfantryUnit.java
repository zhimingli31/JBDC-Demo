package li.UNITS;

import li.ENUMS.Units;
import li.MAIN.Location;

public class AssaultInfantryUnit extends StormtrooperUnit{
	
	private HeavyWalkerUnit TransportedBy;

	public AssaultInfantryUnit(String STUID, BattleGroup UnitCmd, Units UnitType, int AssignedStrength,
			Location Position) {
		super(STUID, UnitCmd, UnitType, AssignedStrength, Position);
		
		this.setSTUID(STUID);
		this.setUnitCmd(UnitCmd);
		this.setUnitType(UnitType);
		this.setAssignedStrength(AssignedStrength);
		this.setPosition(Position);
		
		this.TransportedBy = new HeavyWalkerUnit(STUID,UnitCmd,Position);
	}


	public HeavyWalkerUnit getTransportedBy() {
		return TransportedBy;
	}


	public void setTransportedBy(HeavyWalkerUnit transportedBy) {
		TransportedBy = transportedBy;
	}


	@Override
	public void displayUnitInfo() {
		super.moveTo(this.getPosition());
		System.out.println("Transported By: " + this.getTransportedBy().getWUID());
		System.out.println();
	}

}
