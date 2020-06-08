package li.UNITS;

import li.ENUMS.Units;
import li.MAIN.Location;

public class ReconnaissanceUnit extends StormtrooperUnit{
	
	private ScoutWalkerUnit TransportedBy;

	public ReconnaissanceUnit(String STUID, BattleGroup UnitCmd, Units UnitType, int AssignedStrength,
			Location Position) {
		super(STUID, UnitCmd, UnitType, AssignedStrength, Position);
		this.setSTUID(STUID);
		this.setUnitCmd(UnitCmd);
		this.setUnitType(UnitType);
		this.setAssignedStrength(AssignedStrength);
		this.setPosition(Position);
		
		this.TransportedBy = new ScoutWalkerUnit(STUID,UnitCmd,Position);
	}

	public ScoutWalkerUnit getTransportedBy() {
		return TransportedBy;
	}

	public void setTransportedBy(ScoutWalkerUnit transportedBy) {
		TransportedBy = transportedBy;
	}

	@Override
	public void displayUnitInfo() {
		super.moveTo(this.getPosition());
		System.out.println("Transported By: " + this.getTransportedBy().getWUID());
		System.out.println();
		
	}

}
